package jUnit;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertTimeout;

public class J06_TestingPerformance {

    @Test
    void performanceTest(){
assertTimeout(Duration.ofSeconds(1),()-> IntStream.rangeClosed(0,100).sum()); //passed
assertTimeout(Duration.ofMillis(10),()-> IntStream.rangeClosed(0,100).forEach(System.out::print)); // 14 ms de istnilen sayilari yazdirdi // passed
//assertTimeout(Duration.ofMillis(10),()-> IntStream.rangeClosed(0,100000).forEach(System.out::print)); // 100000 e kadar sayilari yazdi // 10 milisn yio gectigi icin failed oldu sonuc 175 ms
assertTimeout(Duration.ofMillis(10),()-> IntStream.rangeClosed(0,100).sum()); // passed



    }

}
