package ExceptionHandling;

import java.io.FileReader;
import java.io.IOException;

public class error {
  public static void main(String[] args) throws IOException {

    // int[] numerator = { 10, 200, 30, 40 };
    // int[] denominator = { 1, 2, 0, 4 };
    // for (int i = 0; i < numerator.length; i++) {
    // System.out.println(divide(numerator[i], denominator[i]));
    // }
    // System.out.println("Good job:)");
    // }

    // public static int divide(int a, int b) {
    // try {
    // return a / b;
    // } catch (ArithmeticException e) {
    // System.out.println("Arithmetic exception :(");
    // return -1;
    // } catch (Exception e) {
    // System.out.println(e);
    // return -1;
    // }
    // }
    // try {
    // level1();
    // } catch (Exception o) {
    // // StackTraceElement[] stackTrace = o.getStackTrace();
    // // for (int i = 0; i < stackTrace.length; i++) {
    // // System.out.println(stackTrace[i]);
    // o.getMessage();
    // }
    // }

    // public static void level3() {
    // int[] arr = new int[5];
    // arr[5] = 10;
    // }

    // public static void level2() {
    // level3();
    // }

    // public static void level1() {
    // level2();
    // }
    // Student a = null;
    // // a.setId (123);
    // method2();
    // System.out.println("Hello");
    // }

    // public static void method2() throws FileNotFoundException {
    // method1();
    // }

    // public static void method1() throws FileNotFoundException {
    // FileReader fileReader = new FileReader("a.text");
    // }
    System.out.println(divide(1, 0));

  }

  public static int divide(int a, int b) {
    try {
      return a / b;
    } catch (Exception e) {
      System.out.println(e);
      return -1;
    } finally {
      System.out.println("Bye");
    }
  }

}