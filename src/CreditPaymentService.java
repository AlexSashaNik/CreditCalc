public class CreditPaymentService {
    public double calculate(double creditAmount, double creditPercentPerYear, int yearNum) {
        double creditPercentPerMonth = creditPercentPerYear / 12 / 100;
        double result = creditPercentPerMonth * Math.pow((1 + creditPercentPerMonth), yearNum) / (Math.pow(1 + creditPercentPerMonth, yearNum) - 1);
        result = result * creditAmount;
        return (int) result;
    }

}

