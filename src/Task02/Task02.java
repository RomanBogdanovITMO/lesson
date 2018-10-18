package Task02;

public class Task02 {
    public static void main(String[] args) {
        int countSotk = 10;
        int a = 3;
        int countSotkm2 = (int) Math.pow(countSotk, a);
        int countLines = 15;
        int longsLine = 25;
        int emptySotk = countSotkm2 - (countLines * longsLine);
        System.out.println(emptySotk);
    }
}
