package OOP;

/**
 * Клиент
 */
public class Customer extends Human {
    public String discountCard;
    public int money;

    public Customer(String discountCard, int money) {
        this.discountCard = discountCard;
        this.money = money;
    }

    {
        discountCard = "5166516541686165";
        money = 1000;
    }

    public static void learnAboutTheProduct() {
        System.out.println("Клиент Узнаёт про товар");
    }

    public static void buy() {
        System.out.println("Клиент Покупает");
    }
}
