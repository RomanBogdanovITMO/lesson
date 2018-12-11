package lesson17Homework.Task03Strategy;

public class ConsoleLogger implements ILogger {

    @Override
    public void write(String message) {
        System.out.println("Вы записали сообщение в консоль: ");
        System.out.println(message);
    }
}
