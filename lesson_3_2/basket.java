import staff.Candy;
import staff.Cookie;
import staff.Staff;

public class Basket {

    public static void main(String[] args) {

        int sumWeight = 0;
        int sumPrice = 0;

        Candy candy1 = new Candy("Rachki", 1, 3, "caramel");
        Cookie сookie1 = new Cookie("Oreo", 2, 4, "Nestle");
        Staff[] basket = {candy1, сookie1};

        for (Staff some: basket) {
            sumWeight += some.weight;
            sumPrice = sumPrice + some.price;
        }

        System.out.println("Общий вес подарка = " + sumWeight);
        System.out.println("Общая стоимость подарка = " + sumPrice);
        System.out.println();
        System.out.println("Список сладостей подарка");

        for (Staff some: basket) {
            System.out.println(some);
        }
    }
}
