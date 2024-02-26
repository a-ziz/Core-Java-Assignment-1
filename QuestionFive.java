abstract class Bank {
  abstract int getBalance();
}
class BankA extends Bank{
  int balance;

  @Override
  int getBalance() {
    return balance += 100;
  }
}
class BankB extends Bank{
  int balance;
  @Override
  int getBalance() {
    return balance += 150;
  }
}
class BankC extends Bank{
  int balance;
  @Override
  int getBalance() {
    return balance += 200;
  }
}
public class QuestionFive {
  public static void main(String[] args) {

    BankA bankA = new BankA();
    System.out.println(bankA.getBalance());

    BankB bankB = new BankB();
    System.out.println(bankB.getBalance());

    BankC bankC = new BankC();
    System.out.println(bankC.getBalance());
  }
}
