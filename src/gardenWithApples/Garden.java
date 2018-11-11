package gardenWithApples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Garden {
    private String nameGarden;
    List<Tree> listTree = new ArrayList<>();
    int countApples = 0;

    public Garden(String nameGarden) {
        this.nameGarden = nameGarden;
    }

    public String getNameGarden() {
        return nameGarden;
    }

    public void setNameGarden(String nameGarden) {
        this.nameGarden = nameGarden;
    }

    public List<Apples> prosedura(Tree tree) {

            for (int j = 0; j < tree.listApples.size(); j++) {
                int count = tree.listApples.get(j).getSizeApple();
                count++;
                tree.listApples.get(j).setSizeApple(count);
                tree.listApples.get(j).fallApples(count);
              //  System.out.println(tree.listApples.get(j).fallCountApples);

                int count1 = tree.listApples.get(j).getOldApple();
                count1++;
                tree.listApples.get(j).setOldApple(count1);
                tree.listApples.get(j).frashApples(count1);
              //  System.out.println(tree.listApples.get(j).toString());
            }
        Iterator<Apples> iterator = tree.listApples.iterator();
            while (iterator.hasNext()){
                Apples nextApples = iterator.next();
                if (nextApples.getSizeApple()>=4){
                    iterator.remove();
                    countApples++;
                }
            }
            return tree.listApples;
    }
    public void getCountAppels(){
        System.out.println("Яблок упало: " + countApples);
    }

}


