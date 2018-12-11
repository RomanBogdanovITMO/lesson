package lesson17Homework.Task03Strategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        RecordinMessage recordinMessage = new RecordinMessage();

        System.out.println("Выбирите активый вид записи (Console, File, TimeFile): ");
        String recording = scanner.nextLine();
        System.out.println("Ваше сообщение: ");
        String msg = scanner.nextLine();

        Client client = new Client(recording,msg);

        if(client.getRecordtype().equals("Console")){
            ConsoleLogger consoleLogger = new ConsoleLogger();
            recordinMessage.setiLogger(consoleLogger);
        }else if(client.getRecordtype().equals("File")){
            FileLogger fileLogger = new FileLogger();
            recordinMessage.setiLogger(fileLogger);
        }else if(client.getRecordtype().equals("TimeFile")){
            TimeFileLogger timeFileLogger = new TimeFileLogger();
            recordinMessage.setiLogger(timeFileLogger);
        }

        recordinMessage.recording(client.getMassege());
    }
}
