import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        double vnd;
        double usd;
        final double RATE = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter USD:");
        usd = scanner.nextDouble();
        vnd = usd * RATE;
        System.out.println("VND: " + vnd);

    }
}
