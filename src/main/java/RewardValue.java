
public class RewardValue {
    private double cash;
    private double miles;
 
    public RewardValue(double cashVal) {
      cash = cashVal;
    }
 
    public RewardValue(int milesVal) {
      miles = milesVal;
    }
 
    public double getCashValue() {
      double cashTotal = cash + miles * 0.0035;
      return cashTotal;
    }
 
    public double getMilesValue() {
      double milesTotal = miles + cash / 0.0035;
      return milesTotal;
    }
 
 }
 