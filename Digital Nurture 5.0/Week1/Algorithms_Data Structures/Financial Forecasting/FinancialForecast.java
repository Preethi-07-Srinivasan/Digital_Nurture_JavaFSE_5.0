public class FinancialForecast {

    // Recursive method
    public static double Value(double presentValue, double rate, int years) {

        // Base case
        if (years == 0) {
            return presentValue;
        }

        // Recursive case
        return Value(presentValue, rate, years - 1) * (1 + rate);
    }

    public static void main(String[] args) {

        double presentValue = 10000;  // initial amount
        double growthRate = 0.10;     // 10%
        int years = 3;

        double futureValue = Value(presentValue, growthRate, years);

        System.out.println("Future Value after " + years + " years = " + futureValue);
    }
}