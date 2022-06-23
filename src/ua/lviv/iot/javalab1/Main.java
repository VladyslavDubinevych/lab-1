package ua.lviv.iot.javalab1;

public class Main {
    public static void main(String[] args) {
        Refrigerator samsung = new Refrigerator();
        Refrigerator xiaomi = new Refrigerator("Xiaomi", 12, 25);
        Refrigerator bosh = new Refrigerator("Bosh", 42, 69,
                15, -5, "S1329F4");
        System.out.println(samsung.toString());
        System.out.println(xiaomi.toString());
        System.out.println(bosh.toString());
    }
}
