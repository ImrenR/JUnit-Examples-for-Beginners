package jUnit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C01_HesapMakinasiTest {

    @Test
    @DisplayName("ebiik gabik sayilar toplanmasi testi edildi")
    void topla() {
assertEquals(3,C01_HesapMakinasi.topla(1,2)); //passed
assertEquals(5,C01_HesapMakinasi.topla(1,4)); //passed
assertEquals(-1,C01_HesapMakinasi.topla(1,-2)); //passed
assertEquals(4,C01_HesapMakinasi.topla(-8,12)); //passed
//assertEquals(3,C01_HesapMakinasi.topla(1,5)); //failed

    }

    @Test
    @DisplayName("ebiik gabik sayilarin carpimi  testi edildi")
    void carp() {
        assertAll(
                ()-> assertEquals(2.6,C01_HesapMakinasi.carp(2,1.3)),
                ()->   assertEquals(0,C01_HesapMakinasi.carp(0,1.3)));
    }


}