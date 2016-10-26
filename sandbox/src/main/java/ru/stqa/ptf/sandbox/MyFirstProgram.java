package ru.stqa.ptf.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {

      Point a = new Point(1, 2);
      Point b = new Point(3, 4);

      System.out.println("Расстояние между двумя точками = " + Point.distance(a, b));

      hello("world");
      hello("moto");
      hello("Stas");

      Square s = new Square(666);
      System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

      Rectangle r = new Rectangle(444, 111);
      System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());
  }

    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody + "!");
    }

}
