import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();

    int choice = 1;
    List<Triangle> myTriangleList = new ArrayList<Triangle>();

    while(choice == 1) {
      System.out.println("This application will ask you for three side lengths and tell you what kind of triangle you created.");
      System.out.println("Length of Side1: ");
      float side1 = readSide();
      System.out.println("Length of Side2: ");
      float side2 = readSide();
      System.out.println("Length of Side3: ");
      float side3 = readSide();

      Triangle myTriangle = new Triangle(side1, side2, side3);
      myTriangle.calculateType();

      myTriangleList.add(myTriangle);

      for (Triangle eachTriangle : myTriangleList) {
        System.out.println("--------------------");
        System.out.println(eachTriangle.mSide1);
        System.out.println(eachTriangle.mSide2);
        System.out.println(eachTriangle.mSide2);
        System.out.println(eachTriangle.mType);
      }

      System.out.println("Press 1 to continue and calculate more triangles. Press 2 to quit.");
      choice = Integer.parseInt(myConsole.readLine());
      while (choice != 1 && choice != 2) {
        System.out.println("Please input a valid choice.");
        choice = Integer.parseInt(myConsole.readLine());
      }

    }

  }

  public static Float readSide() {
    Console myConsole = System.console();
    return Float.parseFloat(myConsole.readLine());
  }
}
