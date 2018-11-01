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
        this.oldApple = oldApple;
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
        this.sizeApple = sizeApple;
    }

    public int frashApples(int oldApple){
        if(oldApple > 5){
            frashCountApple ++;
        }
        return frashCountApple;
    }
    public int fallApples(int sizeApple){
         fallCountApples = 0;
        if(sizeApple > 2){
            fallCountApples++;
        }
        return fallCountApples;
    }
}
