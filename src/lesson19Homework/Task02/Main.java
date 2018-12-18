package lesson19Homework.Task02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {

    private BlockingQueue<String> orderCooker;
    private BlockingQueue<String> readyOrder;

    private final String DONE = "done";
    private List<String> order;

    public Main() {
        orderCooker = new ArrayBlockingQueue<>(3, true);
        readyOrder = new ArrayBlockingQueue<>(3,true);

        Add();
        (new Thread(new Waiter())).start();
        (new Thread(new Cooker())).start();

    }

    public List<String> Add() {
        System.out.println("Делайте ваш заказ.");
        System.out.println("После завершения напишите (готово).");
        Scanner scanner = new Scanner(System.in);
        order = new ArrayList<>();
        String str = null;
        while (true) {
            str = scanner.nextLine();
            if (str.equals("готово")) break;
            order.add(str);
        }
        return order;
    }

    public class Waiter implements Runnable {

        @Override
        public void run() {
            try {
                int count = 0;
                for (int i = 0; i < order.size(); i++) {
                    orderCooker.put(order.get(i));
                    if (++count < 4)
                        Thread.sleep(1000);
                }
                orderCooker.put(DONE);
                String str = null;
                System.out.println("Заказ: ");
                while (!((str = readyOrder.take()).equals(DONE))){
                   Thread.sleep(2000);
                    System.out.println(str);
                }
                System.out.println("Готов, приятного аппетита.");

            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    class Cooker implements Runnable {

        @Override
        public void run() {
            try {
                System.out.println("Ваш заказ:");
                String str = null;
                while (!((str = orderCooker.take()).equals(DONE))){
                    readyOrder.put(str);
                    System.out.print(str + ",");

                }
                System.out.println();
                System.out.println("Повар готовит ваш заказ" + readyOrder.toString());
                readyOrder.put(DONE);


            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }


    public static void main(String[] args) {
        new Main();
    }
}

