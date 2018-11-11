package gardenWithApples;

public class Apples {
    private  int oldApple;
    private String colorApple;
    private int sizeApple;
    int fallCountApples = 0;
    int frashCountApple = 0;


    public Apples(int oldApple, String colorApple, int sizeapple) {
        this.oldApple = oldApple;
        this.colorApple = colorApple;
        this.sizeApple = sizeapple;
    }

    public int getOldApple() {
        return oldApple;
    }

    public void setOldApple(int oldApple) {
        if(oldApple > 0) {
            this.oldApple = oldApple;
        }
    }

    public String getColorApple() {
        return colorApple;
    }

    public void setColorApple(String colorApple) {
        this.colorApple = colorApple;
    }

    public int getSizeApple() {
        return sizeApple;
    }

    public void setSizeApple(int sizeApple) {
        if(sizeApple > 0) {
            this.sizeApple = sizeApple;
        }
    }

    public int frashApples(int oldApple){
        if(oldApple > 5){
            frashCountApple++;
        }
        return frashCountApple;
    }
    public int fallApples(int sizeApple){

        if(sizeApple >= 4){
            fallCountApples++;

        }
        return fallCountApples;
    }

    @Override
    public String toString() {
        return "Apples{" +
                "oldApple=" + oldApple +
                ", colorApple='" + colorApple + '\'' +
                ", sizeApple=" + sizeApple +
                '}';
    }
    public void getCountAppls(){
        System.out.println(fallCountApples);
    }
}
