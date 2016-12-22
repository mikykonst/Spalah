package OOP;

public class Deposit {
  private double depAmount = 1000;
  private double percents = 0.20;
  private String clientName = "";

  public Deposit(String clientName, double depAmount, double percents) {
    this.depAmount = depAmount;
    this.percents = percents;
    this.clientName = clientName;
  }

  public double profit(int time) {
    double profit = this.depAmount;
    for (int i = 0; i < time; i++) {
      profit = profit + ((profit / 100) * this.percents);
    }
    return profit - this.depAmount;
  }
}
