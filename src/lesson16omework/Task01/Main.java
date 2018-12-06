package lesson16omework.Task01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**1. Используя паттерн Decorator создать шифрующие потоки ввода/вывода с помощью XOR (можете выбрать другой способ).
 Они должны наследовать FilterInputStream и FilterOutputStream.
 Конструктор этих потоков должен принимать пароль в виде массива байт и поток, который он декорирует.

 Использование должно выглядеть следующим образом:
 Трафик автоматически шифрует и дешифруется:
 InputStream in = new CryptoInputStream(socket.getInputStream(), password);
 OutputStream out = new CryptoOutputStream(socket.getOutputStream(), password);

 Сохраняем в шифрованный файл и читаем из шифрованного файла:
 InputStream in = new CryptoInputStream(new FileInputStream("test.bin"), password);
 OutputStream out = new CryptoOutputStream(new FileOutputStream("test.bin"), password);

 Для простоты можете начать имплементацию, где пароль - один байт.*/

public class Main {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = new CryptoInputStream(new FileInputStream("file.txt"),"K");
        OutputStream outputStream = new CryptoOutputStream(new FileOutputStream("file2.txt"),"K");
        //System.out.println((char) (inputStream.read()));
        while (inputStream.available() > 0) {
            outputStream.write(inputStream.read());
            outputStream.flush();
        }
    }
}
