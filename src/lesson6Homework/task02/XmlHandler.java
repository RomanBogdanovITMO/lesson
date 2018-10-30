package lesson6Homework.task02;

public class XmlHandler extends File {

    public XmlHandler(String fileName) {
        super(fileName);
    }

    @Override
    public void read() {
        System.out.println("я читаю File.Xml");
    }

    @Override
    public void write() {
        System.out.println("я записываю File.Xml");
    }
}
