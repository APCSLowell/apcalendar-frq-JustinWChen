public class APCalendar
{

  private static boolean isLeapYear(int year)
  {
    return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
  }



  public static int numberOfLeapYears(int year1, int year2)
  { 
    int y = 0;
    for (int i = year1; i<=year2; i++){
      if (isLeapYear(i)==true)
        y++;
    }
    return y;

  }


  private static int firstDayOfYear(int year)
  {
      return (2 + 365*(year - 1980) + numberOfLeapYears(1980, year-1)) % 7;
  }


  private static int dayOfYear(int month, int day, int year)
  {
    final int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    int n = day;
    int mth  = 1;
    while (mth < month)
    {
      n += daysInMonth[mth - 1];
      mth++;
    }
    if (mth > 2 && isLeapYear(year))
      n++;
    return n;
  }


  public static int dayOfWeek(int month, int day, int year)
  {
    int fD = firstDayOfYear(year);
    int d = dayOfYear(month, day, year);
    int w = (d + fD-1)%7;
    return w;
  }
}
