package gardenWithApples;

import java.util.ArrayList;
import java.util.List;

public class Tree {
    private int countApples;
    List<Apples>listApples = new ArrayList<>();
    private  String name;

    public Tree(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void addApples(Apples apples){
        for (int i = 0; i < listApples.size(); i++){
            listApples.add(apples);
            countApples++;
        }
    }
}
