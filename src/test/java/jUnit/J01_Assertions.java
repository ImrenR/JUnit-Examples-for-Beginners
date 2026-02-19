package jUnit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class J01_Assertions {


    @Test
    @DisplayName("toAssert test")
    void testToAssert(){
        //1-> AssertEquals --> positive testing: expected to be positive value and actual values to be equal otherwise return failed
        int actual = "imren".length();
        int expected = 5;

        assertEquals(expected,actual);
        assertEquals(5,actual); //inline style=> bad practice, simple teste aykiri her zaman kullanilmaz
        assertEquals(5,"haluk".length()); //inline style=> bad practice, simple teste aykiri her zaman kullanilmaz
        assertEquals("haluk".length(),expected); //expected ve actual siralamasi degisebilir
    //    assertEquals(expected,4,"expected deger actual degere esit degil"); //message yzilabilir

        //2-> AssertNotEquals --> negative testing:
        expected=7;
        assertNotEquals(expected,actual, "expected and actual values are equal"); // failed olmali

        //3-> AssertTrue --> positive testing: girilen conditioni test eder if gibi calisir
        // passed is true aksi taktirde failed (false)



      //  assertTrue(expected==actual, "failed verir");
        assertTrue(expected!=actual, "dogru,esit degil,passed verir");

        //4-> assertFalse --> negative testing:
assertFalse(expected== actual); // passed olur
//assertFalse(expected != actual); // false doner


    }
    @Test
@DisplayName("ToConverterUpper Test")
    void testConverterUpper(){
      String expected="imren";
      String actual="IMREN";

      assertEquals(expected,actual); //failed
        actual="imren";
    }


    @Test
    @DisplayName("Array Test")
    void testWithArray(){
     String str ="selam sana guzel insan";
     String actual[]= str.split(" ");
     String expected[]= {"selam","sana","guzel","insan"};
     String expected1[]= {"sana","guzel","insan"};

     assertArrayEquals(actual,expected); // passed
   //  assertArrayEquals(actual,expected1); // failed







    }
}
