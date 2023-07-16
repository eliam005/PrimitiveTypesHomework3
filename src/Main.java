public class Main {
    public static void main(String[] args) {

        // Задаем переменные для входных данных

        int balance = 250; // переменная для начального баланса
        int topUpAmount = 1550; // сумма пополнения
        int bonusRubles = topUpAmount / 100; // считаем бонусные рубли
        int finalBalance = balance + topUpAmount; // конечный баланс без бонусов


        // Теперь определяем сумму пополнения, если выше N-ой суммыы, то выводим бонусы и итоговый баланс
        // ... Если иначе, то бонус нет, и мы просто складываем начальный баланс и сумму пополнения

        if (topUpAmount >= 1000) {

            System.out.println("Ваши бонусы составят: " + bonusRubles + " рублей.");
            System.out.println("Ваш итоговый баланс равен: " + (finalBalance + bonusRubles) + " рублей.");
        } else {

            System.out.println("Бонусов нет, вы не выполнили условия акции !");
            System.out.println("Ваш итоговый баланс равен: " + finalBalance + " рублей.");

        }


    }
}