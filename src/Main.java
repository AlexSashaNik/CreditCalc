public class Main {
    public static void main(String [] args) {
        CreditPaymentService service = new CreditPaymentService();

        double OneYear = service.calculate(1_000_000_000, 9.99, 1);
        System.out.println(OneYear);
        System.out.println();

        double TwoYears = service.calculate(1_000_000_000, 9.99, 2);
        System.out.println(TwoYears);
        System.out.println();

        double ThreeYears = service.calculate(1_000_000_000, 9.99, 3);
        System.out.println(ThreeYears);
        System.out.println();
    }

}
