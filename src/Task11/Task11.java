package Task11;

public class Task11 {
    public static void main(String[] args) {
        int [] arry = new int[3];
        arry[0] = 3;
        arry[1] = -9;
        arry[2] = -1;
        for(int i = arry.length-1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if(arry[j] > arry[j+1]){
                    int tmp = arry[j];
                    arry[j] = arry[j+1];
                    arry[j+1] = tmp;
                }
            }
        }
        for(int i = 0; i < arry.length; i++){
            System.out.println(arry[i]);
        }
    }
}
