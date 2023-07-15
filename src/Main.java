public class Main {
    public static void main(String[] args) {

        // Задаем переменные для входных данных

        int Balance = 250; // переменная для начального баланса
        int TopUpAmount = 1500; // сумма пополнения
        int BonusRubles = TopUpAmount / 100; // считаем бонусные рубли
        int FinalBalance = Balance + TopUpAmount; // конечный баланс без бонусов


        // Теперь определяем сумму пополнения, если выше N-ой суммыы, то выводим бонусы и итоговый баланс
        // ... Если иначе, то бонус нет, и мы просто складываем начальный баланс и сумму пополнения

        if (TopUpAmount >= 1000) {

            System.out.println("Ваши бонусы составят: " + BonusRubles + " рублей.");
            System.out.println("Ваш итоговый баланс равен: " + (FinalBalance + BonusRubles) + " рублей.");
        } else {

            System.out.println("Бонусов нет, вы не выполнили условия акции !");
            System.out.println("Ваш итоговый баланс равен: " + FinalBalance + " рублей.");

        }


    }
}