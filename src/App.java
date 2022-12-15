import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import enums.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class App {

  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    //aki eu declarei uma lista e sempre que for declarar tem que usar o tipo generico pq tou querendo polimorfismo entao
    //tenho que declarar essa lista do tipo da super class dessa forma essa lista vai aceitar dados de todos tipos das sub class
    List<Shape> list = new ArrayList<>();

    System.out.println("===================================");

    System.out.print("Enter the number of shapes: ");
    int N = sc.nextInt();

    for (int i = 1; i <= N; i++) {
      System.out.print("Shape #" + i + " data: ");
      System.out.print("Rectangle or Circle (r/c)? ");
      char ch = sc.next().charAt(0);
      System.out.print("Color (BLACK/BLUE/RED): ");
      Color color = Color.valueOf(sc.next());

      if (ch == 'r') {
        System.out.print("Width: ");
        double width = sc.nextDouble();
        System.out.print("Height: ");
        double height = sc.nextDouble();
        System.out.println("===================================");
        list.add(new Rectangle(color, width, height));
      } else {
        System.out.print("Radius: ");
        double radius = sc.nextDouble();
        list.add(new Circle(color, radius));
      }
    }
    System.out.println("===================================");
    System.out.println("SHAPE AREAS: ");
    for (Shape shape : list) {
      System.out.println(String.format("%.2f", shape.area()));
    }
    System.out.println("===================================");
    sc.close();
  }
}
