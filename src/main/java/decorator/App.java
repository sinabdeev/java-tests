package decorator;

public class App {


    public static void run() {
        // Гадание на Таро
        Service taro = new Divination("Таро", 1000);
        Service chakra = new Chakra(taro, "Характеристика чакр", 500);
        Service aura = new Aura(chakra, "Характеристика ауры", 1500);

        // И общая стоимость
        System.out.println(aura.getPrice());
    }


}
