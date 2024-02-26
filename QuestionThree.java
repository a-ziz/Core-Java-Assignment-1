import java.util.Scanner;

class Average{

  public void calculateAverage(){
    Scanner sc = new Scanner(System.in);

    int sum = 0;
    System.out.print("Enter 3 numbers to calculate their average: ");

    for (int i = 0; i < 3; i++){
      int temp = sc.nextInt();
      sum += temp;
    }

    System.out.println("Average: " + sum / 3);

    sc.close();
  }

}
public class QuestionThree {
  public static void main(String[] args) {
    Average avg = new Average();
    avg.calculateAverage();
  }
}
