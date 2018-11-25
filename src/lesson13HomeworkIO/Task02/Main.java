package lesson13HomeworkIO.Task02;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        splitFiles(Integer.parseInt(reader.readLine()));
        /*try {
            unionFiles(reader.readLine(),reader.readLine(),reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }
    public static void unionFiles(String file, String file2, String file3){
        BufferedInputStream bos = null;
        BufferedInputStream bist = null;
        BufferedOutputStream boss = null;
        int b;
        int a;
        try {
            bos = new BufferedInputStream(new FileInputStream(file));
            bist = new BufferedInputStream(new FileInputStream(file2));
            boss = new BufferedOutputStream(new FileOutputStream(file3));
            while ((a = bist.read()) != -1){
                boss.write(a);
            }
            while ((b = bos.read()) != -1){
                boss.write(b);
            }
            boss.flush();
            bos.close();
            bist.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        public static void splitFiles(int counByte){
            try (FileInputStream inputStream = new FileInputStream("file.txt");
                 FileOutputStream outputStream = new FileOutputStream("file2.txt")) {

                byte[] bytes = new byte[counByte];
                for (int i = 0; i < bytes.length; i++) {
                    bytes[i] = (byte) inputStream.read();
                }
                outputStream.write(bytes);
                outputStream.flush();
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }

