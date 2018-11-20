package lesson12HomeworkException;

public class Main {
    public static void main(String[] args) {
        Delenie d = new Delenie(100, 10);
        try {
            proverca(d.getValue1(), d.getValue2());
        }catch (CheckedException e) {
            System.out.println(e);
        }
        System.out.println(d.work());

    }
    public static void proverca(int i,int j) throws CheckedException {
        if(i == 0){
            throw new CheckedException("делить на нуль нельзя");
        }
        if(j == 0){
            throw  new CheckedException("делить на нуль нельзя");
        }
    }

}
