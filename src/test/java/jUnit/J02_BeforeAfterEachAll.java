package jUnit;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;



    /* =========================================== @BeforeEach - @AfterEach ============================================

   A-) @BeforeEach anatosyonu kullanılan bir method, her test methodu çalışmadan önce çalıştırılır.
       Bu özelliği sayesinde test verilerinin ayarlanması (başlatılması) için kullanılabilir.
       Araç --> her vites'te debriyaja basma   Namaz --> her rekatın Fatiha'sı

   B-) @AfterEach anatosyonu kullanılan bir method, her test metodu bittikten sonra çalıştırılır.
       Bu özelliği sayesinde test verilerinin temizlenmesi için kullanılabilir.
       Araç --> her vites'te debriyajdan ayagı cekme   Namaz --> her rekatın ayaga kalkma'sı

   C-) JUnit4 de bu anatosyonlar yerine @Before ve @After kullanıyordu.

   D-) AHAN DA TRİCKKK:  @AfterEach veya  @BeforeEach anotasyonunda yazım sırası önemli değildir. Hangisi önce önce yazılırsa yazılsın JAVA
        önce @BeforeEach  sonra @AfterEach compile eder.

        ========================================== @BeforeAll - @AfterAll ===============================================
     A-) @BeforeALl tüm test methodlarından önce BİR KERE çalışan bir method oluşturmak için kullanılır.
         Dolayısıyla veritabanı içeren bir test işleminde ilk olarak veritabanına bağlanmak gerekeceğinden @BeforeAll
         anatosyonu ile bir method tanımlanarak ilk olarak veritabanına bağlanma prosedürü işletilebilir.
          Araç --> kontagı acma   Namaz --> Namazın tekbiri...

     B-) @AfterAll ile tüm test metotlari bittikten sonra BİR KERE çalışan bir metot oluşturulabilir.
         Bu özelliği sayesinde testler bittikten sonra veritabani oturumu kapatılabilir.
         Araç --> kontagı kapatma   Namaz --> Namazın selamı...

        AHAN DA TRİCKKK: @BeforeAll ve @AfterAll anotasyonlarının kullanıldığı metotlar static olmalıdır.
        Not2: JUnit4 de @BeforeClass ve  @AfterClass metotları kulanılmaktadır.

        Kıng of TRICKK : @Before ve @After anotasyonları ayrı bir test gibi tek başına  çalışmaz test'lerin çalışma
                        hiyerarşisini organize eder. Anotasyonlarının yazım sırası run sırasını etkilemez anotasyonlar kendi hiyerarşisine göre run olur

     */

public class J02_BeforeAfterEachAll {
    String str=""; // global variable

    @AfterEach
    void clean(TestInfo info){
     str="Imren";
        System.out.println(info.getDisplayName()+ "@AfterEach--> clean meth run edildi (her vites sonrasi debriyaja basildi");
        System.out.println(".   ***  .");
    }
    @BeforeEach
    void setUp(TestInfo info){
     str="Javacanlara selam olsun";
        System.out.println(info.getDisplayName()+ "@BeforeEach--> clean meth run edildi (her vites sonrasi debriyaj birakildi");
        System.out.println(".   ***  .");
    }
    @BeforeAll
    static void dataBaseAc(){
        System.out.println("@BeforeAll\n--> dataBaseAcma meth run edildi (Kontak acildi)");
        System.out.println(".   ***  .");
    }

    @AfterAll
    static void dataBaseKapa(){
        System.out.println("@AfterAll\n--> dataBaseKapa meth run edildi (Kontak kapatildi)");
        System.out.println(".   ***  .");
    }

    @Test
    @DisplayName("length meth. testi")
   void testStringLength(){
    int actual = str.length();
    int expected= 23;

    assertEquals(expected,actual, "Datalar farkli");
        System.out.println("TEST!--> length meth. test eidldi !");


   }

    @Test
    @DisplayName("Array Test")
    void testWithArray() {
        String str = "selam sana guzel insan";
        String actual[] = str.split(" ");
        String expected[] = {"selam", "sana", "guzel", "insan"};

        assertArrayEquals(actual, expected, "ARRAY FARKLI");
        System.out.println("TEST 2=> Array meth test eidldi");
    }

}
