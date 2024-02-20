package com.maven.Junit;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


@TestInstance(TestInstance.Lifecycle.PER_METHOD)
class MathUtilsTest {

    MathUtils mathUtils;


     @BeforeAll
   static void beforeAllInit(){
         System.out.println("global before all");
     }

    @AfterAll
    static void afterAllInit(){
        System.out.println("global after all");
    }

      @BeforeEach
      void init(){
          mathUtils=new MathUtils();
      }

      @AfterEach
      void cleanup(){
          System.out.println("cleaning up.....");
      }

     @Test
     @DisplayName("testing add method")
     @Disabled
     void test(){
         MathUtils mathUtils = new MathUtils();
         int expected=2;
         int actual=mathUtils.Add(1,1);
         assertEquals(expected, actual);
     }


     @Test
     void testDivide(){
         MathUtils mathUtils = new MathUtils();

         assertThrows(ArithmeticException.class,() -> mathUtils.divide(1,0),"divide by should be thrown ");

     }

     @Test
    void testComputeCirlceArea(){
         MathUtils mathUtils = new MathUtils();
         assertEquals(314.1592653589793,mathUtils.computeCircleArea(10),"method to calculate circle area" );
     }
}