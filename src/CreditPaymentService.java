public class CreditPaymentService {
    public double calculate(double creditAmount, double creditPercentPerYear, int yearNum) {
        if (creditAmount < 0 || creditPercentPerYear < 0 || yearNum < 0 || yearNum > 3) {
            creditAmount = 0;
        }

        int monthNum = yearNum * 12;
        double creditPercentPerMonth = creditPercentPerYear / 12 / 100;
        double creditPercentPerMonth1 = 1 + creditPercentPerMonth;
        double intoBrackets = Math.pow(creditPercentPerMonth1, monthNum);
        double upperBound = creditPercentPerMonth * intoBrackets;
        double bottomBound = intoBrackets - 1;
        return creditAmount * upperBound / bottomBound;
    }

}

