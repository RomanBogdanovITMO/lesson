package lesson7Homework.task01;

public class Main {
    public static void main(String[] args) {
        Pupil pupil = new Pupil(1);
        String[] ex = {"География","Математика"};
        int[] mark = {3,2};
        pupil.setExam(ex,mark);
        System.out.println(pupil.toString());
    }
}
