public class LeapYear {

  public static boolean isLeapYear(int year) {
    if(year < 1 || year > 9999) {
      return false;
    }
    if((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)) {
      return true;
    }
    return false;
  }
}
