package lesson6Homework.task02;

public class TxtHandler extends File {
    public TxtHandler(String fileName) {
        super(fileName);
    }

    @Override
    public void read() {
        System.out.println("Я читаю File.Txt");
    }

    @Override
    public void write() {
        System.out.println("Я записываю File.Txt");
    }
}
