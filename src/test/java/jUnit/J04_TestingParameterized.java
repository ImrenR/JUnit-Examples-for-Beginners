package jUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class J04_TestingParameterized {

    @Test
    void uzunlukSifirdanByk() {
        assertTrue("imren".length() > 0);
        assertTrue("erdem".length() > 0);
//assertTrue("ali".length()>4); // => failed
        assertTrue("tulin".length() > 0); // ustekki failed oldugu icin bunu kontrol edemeyiz code crash oldu
// tulin run olmadi, bu durum bir bad practice dir failed olan testten sonra kalan komutlar
        // run edilemeyecegi cin testlerde defect bulunamaz
    }
//TEKIL SART...
/*
lenght() methodu ile asagıdaki sartlar için 0'dan buyuk deger return ettigini test ediniz.
Sartlar : "yıldız" , "suleyman" , "omer" , "kursat"  --> bu datalar testi nasıl geçer
 */

 @ParameterizedTest
 @ValueSource(strings = {"yıldız" , "suleyman" , "omer" , "kursat"})
 void testBykHarfConvert(String str){ // metoda string olarak gleen pmetreleri asagidaki aksiyonla calistir
     assertTrue(str.length()>2);
        } // passed



//COKLU SART --> Her parametre elemanı KEY VALUE ikili ile test method'unda run edilir.


    }




