public class DecimalComparator {

  public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
    num1 = (int) (num1 * 1000);
    num2 = (int) (num2 * 1000);
    if (num1 == num2) {
      return true;
    }
    return false;
  }
}
