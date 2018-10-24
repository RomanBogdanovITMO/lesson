package lesson5ClassAndObject;

public class Main {
    public static void main(String[] args) {
        Good door = new Good("Дверь",1000);
        System.out.println(door.toString());

        Good tabel = new Good();
        tabel.setTitel("Roland");
        tabel.setPrise(700);
        tabel.getPrise();
        System.out.println(tabel.toString());
        System.out.println(tabel.getPrise());

        Good chair = new Good();
        chair.setTitel("стул");
        chair.setPrise(1000);
        System.out.println(chair.toString());
        System.out.println(chair.getTitel());

        Storage storage = new Storage();

        storage.addGood(tabel);
        storage.addGood(chair);
        storage.addGood(chair);
        storage.addGood(chair);

        storage.showGoods();
    }
}
