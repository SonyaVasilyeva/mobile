public class Main {
    public static void main(String[] args) {

        double balance = 100;
        double replenishmentAmount = 1300;
        int bonusCalculation;

        if (replenishmentAmount > 1000) {
            bonusCalculation = (int) replenishmentAmount / 100;
        } else {
            bonusCalculation = 0;
        }
        double newBalance = balance + replenishmentAmount + bonusCalculation;
        System.out.println("Сумма счета: " + newBalance);
        System.out.println("Количество бонусных рублей: " + bonusCalculation);

    }
    // Объявляете переменные для входных данных и
    // параметров программы: начального счёта,
    // суммы пополнения и тп

    // Условным оператором проверяете, превысила ли
    // сумма пополнения порог, и для этих двух разных
    // сценариев рассчитываете сумму бонуса и выводите
    // на экран.
}

