package lesson6.task01;

public class Circle {
    private String name;
    private int radiys;

    public Circle(String name, int radiys) {
        this.name = name;
        this.radiys = radiys;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRadiys() {
        return radiys;
    }

    public void setRadiys(int radiys) {
        this.radiys = radiys;
    }
    public int LengthCircle(int radiys){
        double square = 3.14 *radiys *2;
        return (int)square;
    }
}
