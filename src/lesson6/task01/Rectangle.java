package lesson6.task01;

public class Rectangle {
    private  String name;
    private int StoronaRectangleA;
    private int StoronaRectangleB;
    public Rectangle(String name, int storonaRectangleA, int storonaRectangleB) {

            this.name = name;
            StoronaRectangleA = storonaRectangleA;
            StoronaRectangleB = storonaRectangleB;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStoronaRectangleA() {
        return StoronaRectangleA;
    }

    public void setStoronaRectangleA(int storonaRectangleA) {
        if(storonaRectangleA >=0) {
            StoronaRectangleA = storonaRectangleA;
        }else{
            System.out.println("Сторона А - ошибка");
        }
    }

    public int getStoronaRectangleB() {
        return StoronaRectangleB;
    }

    public void setStoronaRectangleB(int storonaRectangleB) {
        if (storonaRectangleB >=0) {
            StoronaRectangleB = storonaRectangleB;
        }else {
            System.out.println("Сторона В - ошибка");
        }
    }
    public int PerimetrRectangle(int storonaRectangleA, int storonaRectangleB){
        int perimetor;
        int err = 0;
        if(storonaRectangleA >=0 & storonaRectangleB >= 0) {
             perimetor = 2 * (storonaRectangleA + storonaRectangleB);
            return perimetor;
        }else {
            return err;
        }
    }
    public int SquareRectangle(int storonaRectangleA, int storonaRectangleB){
        int SquareRectangle = storonaRectangleA * storonaRectangleB;
        return SquareRectangle;
    }
}
