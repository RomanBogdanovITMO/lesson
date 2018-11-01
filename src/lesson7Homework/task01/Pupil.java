package lesson7Homework.task01;

public class Pupil {
    private int id;
    private ExamResult [] examResults;

    public Pupil(int id) {
        this.id = id;
    }



    private class ExamResult{
        String name;
        int mark;
        boolean passed;

        public ExamResult(String name, int mark) {
            this.name = name;
            this.mark = mark;
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

        public boolean isPassed() {
            return passed;
        }

        public void setPassed(boolean passed) {
            this.passed = passed;
        }
    }
}
