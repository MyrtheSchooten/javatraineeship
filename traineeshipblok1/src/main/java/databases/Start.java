package databases;

import java.sql.*;

import static databases.util.Props.get;

public class Start {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(get("url"), get("username"), get("password"));
             Statement statement = connection.createStatement();) {
            Start start = new Start();

            int allRows = start.printAllRows(statement);
            System.out.println("allRows=" + allRows);

            /*start.insertRows(connection, statement);*/
            start.deleteRows(connection, "Leusden");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    private void insertRows(Connection connection, Statement statement) throws SQLException {
        try {
            connection.setAutoCommit(false);

            statement.executeUpdate("INSERT INTO publishers (pub_id, pub_name, city, state, country) VALUES ('8956', 'Test', 'Leusden', 'UT', 'NLD');");
            statement.executeUpdate("INSERT INTO publishers (pub_id, pub_name, city, state, country) VALUES ('0089', 'Test', 'Leusden', 'UT', 'NLD');");

            connection.commit();
        } catch (SQLException e) {
            System.err.println("Er gaat iets mis in SQL..." + e.getMessage());
            connection.rollback();
        }
    }

    private void deleteRows(Connection connection, String city) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM publishers WHERE city=?");
        preparedStatement.setString(1, city);

        int i = preparedStatement.executeUpdate();
        System.out.println("Deleted " + i + " rows.");
    }


    public int printAllRows(Statement statement) throws SQLException {
        ResultSet resultSet = statement.executeQuery("select pub_id, pub_name, city, state from publishers");

        // 5a data
        while (resultSet.next()) {
            String pub_id = resultSet.getString(1);
            String pub_name = resultSet.getString(2);
            String city = resultSet.getString("city");

            System.out.println(pub_id + ", " + pub_name);
        }

        // 5b metadata
        ResultSetMetaData metaData = resultSet.getMetaData();
        String catalogName = metaData.getCatalogName(1);
        String schemaName = metaData.getSchemaName(1);
        System.out.println("catalogName=" + catalogName);
        System.out.println("schemaName=" + schemaName);
        return resultSet.getRow();
    }
}

