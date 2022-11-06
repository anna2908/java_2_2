public class Main
{
    public static void main(String[] args)
    {
        int sum = 100;
        int money = 1100;
        int bonus = 100;
        int bonusMoney = 0;
        System.out.println("Счет абонента: " + sum + " руб.");
        System.out.println("Сумма пополнения: " + money + " руб.");
        if (money > 1000)
        {
            bonusMoney = money / bonus;
        }
        else
        {
            bonusMoney = 0;
        }
        sum = sum + money + bonusMoney;
        System.out.println("Начисленно бонусов: " + bonusMoney + " руб.");
        System.out.println("Счет абонента: " + sum + " руб.");
    }
}