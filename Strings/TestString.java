package Strings;

public class TestString {
  public static void main(String[] args) {
    // String is immutable in this we can't change Any method it return a new string
    // //Stringpool??
    // Single Line comment -> //
    // multiline comment -> /* */
    // String a = new String("Ram");
    // String b = new String("Ram");
    // String c = "Ram";
    // String d = "Ram";
    // System.out.println(c == d); // true
    // String x = "Ram";
    // String a = new String("Ram");
    // String b = new String(x);
    // String c = "Ram";
    // String d = "Ram";
    // System.out.println(c == d); // true
    // String name = "Akshit harma";
    // int length = name.length();
    // // System.out.println(length);
    // char c = name.charAt(length - 1);
    // System.out.println(c);

    // String name2 = "Akshit sharma";
    // System.out.println(name.equals(name2));
    // System.out.println(name.equalsIgnoreCase(name2));

    // String str1 = "remote";
    // System.out.println('r' + 0); // find the aski value
    // String str2 = "car";
    // System.out.println('c' + 0);
    // int i = str1.compareTo(str2);
    // System.out.println(i);
    String name = "Amar Panchal";
    // String substring = name.substring(5, 8 );
    // System.out.println(substring);
    // System.out.println(name.toUpperCase());// AMAR PANCHAL
    // System.out.println(name.trim()); // reduce the space bychance it creates
    // String sr = name.replace("Panchal", "Sharma");
    // System.out.println(sr); // Amar Sharma
    // System.out.println(name.contains("pan"));// false
    // System.out.println(name.contains("p")); // false
    // System.out.println(name.contains("an")); // true
    // System.out.println(name.startsWith("am"));// false
    // System.out.println(name.startsWith("Am"));// true
    // System.out.println(name.endsWith("al")); // true
    // System.out.println(name.endsWith("at"));// false
    // String str = "";
    // System.out.println(str.isEmpty());// true
    // System.out.println(str.isBlank());// any element present their its blank the
    // element
    // int i = name.lastIndexOf("a");
    // System.out.println(i);
    // System.out.println(name.lastIndexOf("pan"));
    // System.out.println(name.indexOf("a", 5));
    // int a = 10;
    // String s = String.valueOf(a);
    // System.out.println(s);
    // String formatString = String.format("My name is %s and I am %d years old",
    // "john", 25);
    // System.out.println(formatString); // My name is john and I am 25 year old.
    System.out.println(name.substring(2, 6));// ar p
    System.out.println(name.substring(4, 8));// pan
    System.out.println(name.substring(3, 7));// r pa

  }
}
