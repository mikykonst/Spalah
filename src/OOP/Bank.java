package OOP;

import java.util.ArrayList;
import java.util.Scanner;
import OOP.Deposit;

public class Bank {

  private static int countDeposits = 0;
  private String bankName;
  public ArrayList<Deposit> depositList = new ArrayList<>();

  public Bank(String bankName) {
    this.bankName = bankName;
  }

  public void addDeposit(Deposit deposit) {
    if (countDeposits < 10) {
      depositList.add(deposit);
      countDeposits++;
    }
  }

  public double calcSum(int years) {
    double sum = 0;
    for (int i = 0; i < depositList.size(); i++) {
      sum += depositList.get(i).profit(years);
    }
    return sum;
  }
}
