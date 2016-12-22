package OOP;

import java.util.Scanner;

/**
 * Created by user on 22.12.2016.
 */
public class Main {
  public static void main(String[] args) {
    Bank bank = new Bank("someBank");
    bank.addDeposit(new Deposit("First Client", 100, 10));
    bank.addDeposit(new Deposit("Second Client", 200, 7));
    bank.addDeposit(new Deposit("Third Client", 300, 15.5));
    Scanner scanner = new Scanner(System.in);
    System.out.println("Years count?");
    int years = 0;
    while (years == 0) {
      try {
        years = Integer.parseInt(scanner.nextLine());
      } catch (Exception e) {
        System.out.println("Integer please..");
      }
    }
    System.out.printf("Amount over " + years + " years: $%.2f", bank.calcSum(years));
  }
}
