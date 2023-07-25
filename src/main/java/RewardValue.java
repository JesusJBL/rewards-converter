public class RewardValue {
   private double reward;
   private double RATE = 0.0035;
    // Cash Constructor
    public RewardValue(double cashNumber) {
        reward = cashNumber / RATE;
    }

    // Mile Constructor
    public RewardValue(long mileNumber) {
        reward = mileNumber * RATE;
    }

    public double getCashValue() {
        return reward;
    }

    public double getMilesValue() {
        return reward;
    }
}
