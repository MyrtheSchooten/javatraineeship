package Basis;

public class SquareSum {

    public int squareSum(int[] n){
        int result = 0;
        for(int i = 0; i<n.length; i++){
            result = result + (int) Math.pow(n[i],2);
        }
      return result;
    }
}
