class Cat {
  String name;
}

public class test {
  public static void main(String[] args) {
    // car Car = new car();
    // Car.color = "red";
    // Car.brand = "BMW";
    // Car.speed = 40;
    // Car.year = 2023;
    // Car.model = "safari";
    // Car.accelerate(1);
    // System.out.println(Car.speed);
    Cat a = new Cat();
    a.name = "bob";
    Cat cat = makeCatNameUpperCase(a);
    System.out.println(cat.name);
    System.out.println(a.name);
  }

  public static Cat makeCatNameUpperCase(Cat cat) {
    cat.name = cat.name.toUpperCase();
    return cat;
  }

}
