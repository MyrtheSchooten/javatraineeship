package uitwerkingenHS10.CSM;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {
    @Test
    void WhenPaymentIsDoneBalanceIsLower() {
        //given
        Card rcard1 = new RegularCard(1234, "Gerda", 450);
        //when
        rcard1.pay(20);
        //then
        assertEquals(430, rcard1.credit);


        //given
        Card gcard1 = new GoldCard(2345, "Puck", 200, 25);
        //when
        gcard1.pay(100);
        //then
        assertEquals(125, gcard1.credit);
    }

    @Test
    void WhenRegularCardBalanceIsTooLowPaymentWillFail() {
        //given
        Card rcard2 = new RegularCard(1111, "Inge", 72);
        //when
        rcard2.pay(200);
        //then
        assertEquals(72, rcard2.credit);
    }

    @Test
    void WhenGoldCardBalanceIsLowerThanZeroBalanceWillBeMinusZero() {
        //given
        Card gcard2 = new GoldCard(2222, "Rob", 50, 20);
        //when
        gcard2.pay(80);
        //then
        assertEquals(-10, gcard2.credit);
    }


   /* @Test
    void WhenDiscountIsOutOfRangeExceptionWillBeThrown() {
        //given
        Card gcard3 = new GoldCard(3333, "Piet", 200, 70);
        //When and Then
        assertThrows(OutOfRangeException.class, gcard3 :: setDiscount);
    }*/
}