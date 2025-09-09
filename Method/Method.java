package Method;

// printing sum of Array
public class Method {
  public static void main(String[] args) {
    // int a = 2;
    // int b = 5;
    // System.out.println("Sum is " + (a + b));
    int arr[] = { 2, 4, 5, 8, 7 };
    sumOfArray(arr);
    System.out.println(sumOperations(2, 5));
    System.out.println(sumOperations(2, 5, 3));
    System.out.println(upperFun("piyush mishra"));
    int x = 10;
    System.out.println(multiplyby10(x));
    System.out.println(x);
    String a = "rudhraksh";
    System.out.println(upper(a));
    System.out.println(a);

  }

  public static void sumOfArray(int[] arr) {

    int res = 0;
    for (int i : arr) {
      res += i;
    }
    System.out.println(res);

  }

  private static int sumOperations(int a, int b) {
    return a + b;
  }

  private static int sumOperations(int a, int b, int c) {
    return a + b + c;
  }

  private static String upperFun(String str) {
    return str.trim().toUpperCase();
  }

  public static int multiplyby10(int x) {
    return x * 10;
  }

  public static String upper(String str) {
    return str.toUpperCase();
  }
}
