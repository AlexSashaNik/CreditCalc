public class CreditPaymentService {
    public int calculate(int period, int credit) {
        double creditSum;
        double percent = 9.99;
        double x = Math.pow((1 + (percent / 12 / 100)), period * 12);
        creditSum = credit * (percent / 12 / 100) * x / (x - 1);
        return (int) creditSum;
    }

}

