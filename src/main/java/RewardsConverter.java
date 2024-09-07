import java.util.Scanner;

public class RewardsConverter {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Welcome to the Credit Card Rewards Converter!");
        System.out.println("Please enter a cash value to convert to airline miles: ");
        var input_value = scanner.nextLine();
        double cashValue;
        try {
            cashValue = Double.parseDouble(input_value);
        } catch (NumberFormatException exception) {
            System.out.println("Could not parse input value as a double, exiting");
            return;
        }
        System.out.println("converting $" + input_value + " to miles");
        var rewardsValue = new RewardValue(cashValue);
        System.out.println("$" + input_value + " is worth " + rewardsValue.getMilesValue() + " miles");
    }
}

class RewardValue{
    private static double cashValue = 0;
    private static final double  MILES_CONVERSION_RATE = 0.0035;
    // Constructor
    public RewardValue(double cashValue) {
        RewardValue.cashValue = cashValue;
    }

    // Method to convert cash to miles
    public double getMilesValue() {
        return cashValue / MILES_CONVERSION_RATE;
    }
}