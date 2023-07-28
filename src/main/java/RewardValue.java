public class RewardValue {
   private double cashNumber;
   private int milesNumber;
   public static final double RATE = 0.0035;
    // Cash Constructor
    public RewardValue(double cashNumber) {
        this.cashNumber = cashNumber;
    }

    // Mile Constructor
    public RewardValue(int milesNumber) {
        this.cashNumber =  (milesNumber * RATE);
    }

    public static int compareToCash(double cashNumber) {
        return (int) (cashNumber / RATE);
    }

    public double getCashValue() {
        return cashNumber;
    }

    public int getMilesValue() {
        return compareToCash(this.cashNumber);
    }
}
