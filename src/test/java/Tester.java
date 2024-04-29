

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

public class Tester {

   @Test
   public void partA () {
      int result = APCalendar.numberOfLeapYears(0,2000);
      assertEquals(486,result);
      result = APCalendar.numberOfLeapYears(1950,1960);
      assertEquals(3,result);
      result = APCalendar.numberOfLeapYears(1900,2020);
      assertEquals(30,result);
      result = APCalendar.numberOfLeapYears(2000,2021);
      assertEquals(6,result);
   }
   @Test
   public void partB(){
      /*
      1999 Feb 5 5 Nov 15 1   2000 Feb 5 6 Nov 15 3
      2001 Feb 5 1 Nov 15 4   2002 Feb 5 2 Nov 15 5
      2003 Feb 5 3 Nov 15 6   2004 Feb 5 4 Nov 15 1
      2005 Feb 5 6 Nov 15 2   2006 Feb 5 0 Nov 15 3
      2007 Feb 5 1 Nov 15 4
    */
       int result = APCalendar.dayOfWeek(2,5,1999);
       assertEquals(5,result);
       result = APCalendar.dayOfWeek(11,15,1999);
       assertEquals(1,result);
       result = APCalendar.dayOfWeek(2,5,2000);
       assertEquals(6,result);
       result = APCalendar.dayOfWeek(11,15,2000);
       assertEquals(3,result);
       result = APCalendar.dayOfWeek(2,5,2001);
       assertEquals(1,result);
       result = APCalendar.dayOfWeek(11,15,2001);
       assertEquals(4,result);
       result = APCalendar.dayOfWeek(2,5,2002);
       assertEquals(2,result);
       result = APCalendar.dayOfWeek(11,15,2002);
       assertEquals(5,result);
   }


}
