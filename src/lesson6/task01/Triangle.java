package lesson6.task01;

public class Triangle {
    private String name;
    private int height;
    private  int osnovanie;
    private  int StoronaA;
    private int StoronaB;

    public int getStoronaA() {
        return StoronaA;
    }

    public void setStoronaA(int storonaA) {
        StoronaA = storonaA;
    }

    public int getStoronaB() {
        return StoronaB;
    }

    public void setStoronaB(int storonaB) {
        StoronaB = storonaB;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getOsnovanie() {
        return osnovanie;
    }

    public void setOsnovanie(int osnovanie) {
        this.osnovanie = osnovanie;
    }
    public int squareTriangle(int height, int osnovanie){
        double square = 0.5 * height *osnovanie;
        return (int)square;
    }
    public int PerimetrTriangle(int osnovanie, int storonaA, int storonaB){
        int Perimetr = osnovanie + storonaA + storonaB;
        return Perimetr;
    }
}
