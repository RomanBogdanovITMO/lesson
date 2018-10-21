package Lesson2.Task09;

public class Task09 {
    public static void main(String[] args) {
        int tarelki = 23;
        double sredstvo = 10;
        while (tarelki > 0){
            tarelki--;
            sredstvo -= 0.5;
            if(tarelki == 0)break;
            if(sredstvo == 0)break;
        }
        if(tarelki == 0 & sredstvo > 0){
            System.out.println("Колличество тарелок " + tarelki);
            System.out.println("Средства осталось " + sredstvo);
        }else if(sredstvo == 0 & tarelki > 0){
            System.out.println("Колличество средства " + sredstvo);
            System.out.println("Тарелок осталось " + tarelki);
        }else {
            System.out.println("ничего нет");
        }
    }
}
