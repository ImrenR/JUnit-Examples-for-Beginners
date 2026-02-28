package jUnit;

import org.junit.jupiter.api.*;

import java.lang.annotation.Repeatable;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class J05_TstingRepeatedDisable {

 //   @RepeatedTest(a) => Test edilecek method a kadar loop icinde run edilir.


@AfterEach
    void  afterMethod(){
    System.out.println("@AfterEach method run edildi");
    System.out.println(" ****  ");
}

    @BeforeEach
    void  beforeMethod(){
        System.out.println("@BeforerEach method run edildi");
        System.out.println(" ****  ");
    }

@RepeatedTest(5)
    @DisplayName("Contains Test 5 kez run edilecek")
void testedContains(){

    boolean actual= "Imren".contains("hi");
    boolean expected=false;
    assertEquals(actual,expected, "imren does not contain hi");
    System.out.println("testedContains run edildi");
}

    @RepeatedTest(7)
    @DisplayName("sum Test 5 kez run edilecek")
    void testedContainsTopla(){


        assertEquals(5,3+2, "sum test");
        System.out.println("testedContainsSum run edildi");
    }


    @Disabled // bu testi calistirmasin diye => Continue gibi calisir
    @Test
    void  karpuzTest(){
    System.out.println("Karpuz testen salam");
    assertEquals(19,"adana karpuzu guldurur yuzuuu", "disabled test");

}


}
