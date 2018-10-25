package lesson6.task01;


import javax.xml.bind.SchemaOutputResolver;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Круг",20);
        System.out.println(circle.getName());
        System.out.println("длина окружности: " + (circle.LengthCircle(20)));

        Rectangle rectangle = new Rectangle("Прямоугольник",10,23);
        System.out.println(rectangle.getName());

        System.out.println("Периметор прямоугольника: " + rectangle.PerimetrRectangle(10,23));

        System.out.println(rectangle.SquareRectangle(10,23));

        Triangle triangle = new Triangle();
        triangle.setName("Треугольник");
        System.out.println(triangle.getName());

        triangle.setHeight(50);
        triangle.setOsnovanie(100);
        triangle.setStoronaA(50);
        triangle.setStoronaB(40);

        System.out.println("Периметр треугольника: " + triangle.PerimetrTriangle(triangle.getOsnovanie(),triangle.getStoronaA(),triangle.getStoronaB()));
        System.out.println(triangle.squareTriangle(triangle.getHeight(),triangle.getOsnovanie()));

    }
}
