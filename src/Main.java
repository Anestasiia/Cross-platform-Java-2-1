import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double price;

        do {
            System.out.print("Введіть ціну товару: ");
            price = scanner.nextDouble();
        } while (price <= 0);

        int expiryPeriod, daysPassed;

        do {
            System.out.print("Введіть термін придатності товару (в днях): ");
            expiryPeriod = scanner.nextInt();

            System.out.print("Введіть кількість днів, що пройшли з дня виготовлення товару: ");
            daysPassed = scanner.nextInt();
        } while (expiryPeriod <= daysPassed || expiryPeriod <= 0);

        double p;

        do {
            System.out.print("Введіть знижку( 0 < p < 1): ");
            p = scanner.nextDouble();
        } while (p <= 0 || p >= 1);

        if ((expiryPeriod - daysPassed) == 1) {
            price *= p;
        } else if ((expiryPeriod - daysPassed) < expiryPeriod / 2) {
            price *= (1 - p);
        }

        System.out.println("Поточна ціна товару: " + price);
    }

}