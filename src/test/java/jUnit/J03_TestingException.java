package jUnit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class J03_TestingException {

    /*
   assertThrow() method'u --> belirtilen işlemin (executable) belirtilen türde bir Exception oluşturup oluşturmadığını
   test eder.
       Dolayısıyla 2 parametre alır.
       1. parametre --> expected(beklenen) Exception(istisna) türü,
       2. parametre --> actual(oluşacak)  çalıştırılacak olan işlemdir.
   Eğer işlem belirtilen türde bir exception oluşturursa test başarılı olur.TEST PASSED
   Ama exception oluşmaz ise veya türü yanlış olursa test başarısız olur.TEST FAILED
  TRİCKK : Exception.io türünde parent-child ilişkisi var ise yine test başarılı sayılır.
*/

@Test
    @DisplayName("NumberformatException TEST")
    void testException(){
  //  String strSayi="1453";
    String strSayi="14b3";
    assertThrows(NumberFormatException.class,()->Integer.parseInt(strSayi)); //passed
}

    @Test
    @DisplayName("NullPointerException TEST")
    void testException02(){
        //  String strSayi="1453";
        String str1="imren";
        String str =null;
        assertThrows(NullPointerException.class,()->str1.length()); //passed
        assertThrows(NullPointerException.class,()->str.length()); // failed
    }





}
