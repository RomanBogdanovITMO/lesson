package Task03;

public class Task03 {
    public static void main(String[] args) {
        int value = 10;

        double a = 8.5;
        double b = 11.45;

        double c = Math.abs(a);
        double d = Math.abs(b);

        if(a == b){
            System.out.println("число " + value + " =" + a + ", " + b);
        }
        if (a < b){
            System.out.println("Число " + b + " ближе к числу " + value);
        }
        if(a > b){
            System.out.println("Число " + a + " ближе к числу " + value);
        }
    }
}
