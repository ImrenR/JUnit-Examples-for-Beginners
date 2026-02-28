package jUnit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class J07_TestingGroup {
// TASK-> 0 icermeyen degerler icin multiplyExact() test ediniz.
// TASK-> 0 iceren degerler icin multiplyExact() test ediniz.


    @ParameterizedTest
    @DisplayName("parametreli group disi carp testi")
    @CsvSource(value = {"12,3,4", "-16,8,-2", "0,0,5"})
    void testCarp(int expected,int a, int b) {
        //assertEquals(expected,(a*b)); // bad practice
        assertEquals(expected,Math.multiplyExact(a,b));


    }

    @Nested // parent test gibi kapsamindaki classindaki tum testleri group olarak ayni anda run eder
    @DisplayName("Grup test run edildi")
    class GroupTest{
        @ParameterizedTest
        @DisplayName("parametreli group ici carp testi")
        @CsvSource(value = {"0,3,4", "16,-8,-2", "0,0,5"})
        void testCarp(int expected,int a, int b) {
            assertEquals(expected,(a*b));
            assertEquals(expected,Math.multiplyExact(a,b));


        }

        @Test
        @DisplayName("IllegalArgumentException TEST")
        void testException03(){
            assertThrows(IllegalArgumentException.class,()->printAge(-12)); //passed
        }
        void printAge(int age){
            if(age<0) {
                throw new IllegalArgumentException();
            }else System.out.println("age=" + age);
        }



    }



}
