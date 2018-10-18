package Task06;

public class Task06 {
    public static void main(String[] args) {
        int sizeCreadit = 1_000_000;
        int percentAge = 8;
        int cuontAge = 10;
        double persentAge2 = 8;

        double a = persentAge2 / 12;
        int pereplataMonth = (int)(sizeCreadit * a / 100);
        System.out.println(pereplataMonth);

        int pereplata = (sizeCreadit * percentAge / 100) * cuontAge;
        System.out.println(pereplata);

    }
}
