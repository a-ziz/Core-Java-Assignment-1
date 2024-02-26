import java.util.Scanner;

public class QuestionOne {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter length: ");
    double length = sc.nextDouble();
    System.out.print("Enter width: ");
    double breadth = sc.nextDouble();

    int areaOfRect = (int) length * (int) breadth;
    System.out.println("Area of the rectangle: " + areaOfRect);

    sc.close();
  }
}
