package lesson7Homework.task01;

import java.util.Arrays;

public class Pupil {
    private int id;
    private ExamResult[] examResults;
    final static int COUNT_MAX = 2;

    public Pupil(int id) {
        this.id = id;
        this.examResults = new ExamResult[COUNT_MAX];
    }


    private class ExamResult {
        String name;
        int mark;
        boolean passed;

        public ExamResult(String name, int mark) {
            this.name = name;
            this.mark = mark;
            this.passed = mark > 2;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getMark() {
            return mark;
        }

        public void setMark(int mark) {
            this.mark = mark;
        }

        public boolean getPassed() {
            return passed;
        }

        @Override
        public String toString() {
            if(this.passed == true){
                return name + " сдал";
            }
            return name + " не сдал";
        }
    }

        public void setExam(String[] lesson, int[] marks) {
            if (lesson.length != marks.length) {
                System.out.println("ошибочные данные");
                return;
            }
            for (int i = 0; i < lesson.length; i++) {
                this.examResults[i] = new ExamResult(lesson[i], marks[i]);
            }
        }

        @Override
        public String toString() {
            StringBuilder examsString = new StringBuilder();
            for (int i = 0; i < examResults.length; i++) {
                examsString.append("\n");
                examsString.append(examResults[i].toString());
            }

            return "Студент: " + this.id
                    + examsString.toString();
        }
    }

