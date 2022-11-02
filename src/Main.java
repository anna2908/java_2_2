public class Main
{
    public static void main(String[] args)
    {
        int Sum = 100;
        int Money = 1100;
        int Bonus = 100;
        int BonusMoney = 0;
        System.out.println("Счет абонента: " + Sum + " руб.");
        System.out.println("Сумма пополнения: " + Money + " руб.");
        if (Money >= 1000)
            BonusMoney = Money / Bonus;
        else
            BonusMoney = 0;
        Sum = Sum + Money + BonusMoney;
        System.out.println("Начисленно бонусов: " + BonusMoney + " руб.");
        System.out.println("Счет абонента: " + Sum + " руб.");
    }
}