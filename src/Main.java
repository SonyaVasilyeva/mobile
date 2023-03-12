public class Main {
    public static void main(String[] args) {

        double balance = 100;
        double replenishmentAmount = 1300;
        double newBalance = balance + replenishmentAmount;
        int bonusCalculation = (int) replenishmentAmount / 100;

        if (replenishmentAmount > 1000) {
            System.out.println("Количество бонусных рублей: " + bonusCalculation);
        } else {
            System.out.println("Количество бонусных рублей: 0");
        }

        System.out.println("Сумма счета: " + newBalance);

    }
    // Объявляете переменные для входных данных и
    // параметров программы: начального счёта,
    // суммы пополнения и тп

    // Условным оператором проверяете, превысила ли
    // сумма пополнения порог, и для этих двух разных
    // сценариев рассчитываете сумму бонуса и выводите
    // на экран.
}

