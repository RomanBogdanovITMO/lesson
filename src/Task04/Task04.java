package Task04;

public class Task04 {
    public static void main(String[] args) {
        int a = 2;
        int b = 10;
        int c = 4;
        double x1,x2;

        int d = (b * b)- (4 * a * c);
        if(d < 0){
            System.out.println("нет решений");
        }else if(d == 0){
            x1 = (-b) / (2 * a);
            System.out.println("x1 = " + x1);
        }else {
            x1 = (-b) + Math.sqrt(d) / (2 * a);
            x2 = (-b) - Math.sqrt(d) / (2 * a);
            if(x1 == x2) {
                System.out.println("x1 = x2 " + x1);
            }else {
                System.out.println("x1 = " + x1 + "; x2 = " + x2);
            }
        }
    }
}
