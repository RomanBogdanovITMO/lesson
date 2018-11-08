package gardenWithApples;

import java.util.ArrayList;
import java.util.List;

public class Garden {
private String nameGarden;
List<Tree>listTree = new ArrayList<>();

    public Garden(String nameGarden) {
        this.nameGarden = nameGarden;
    }

    public String getNameGarden() {
        return nameGarden;
    }

    public void setNameGarden(String nameGarden) {
        this.nameGarden = nameGarden;
    }
    public void prosedura(Tree tree){
        for(int i = 0; i<1; i ++){
            for(int j = 0; j < tree.listApples.size(); j++){
                int count = tree.listApples.get(j).getSizeApple();
                count++;
                tree.listApples.get(j).fallApples(count);
                if((tree.listApples.get(j).fallApples(count)) >=3){
                    tree.listApples.remove(j);

                    System.out.println(tree.countApples--);
                }
            }
        }
    }
    public void showAppls(Tree tree){
        System.out.println(tree.countApples);
    }
}
