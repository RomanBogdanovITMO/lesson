package gardenWithApples;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Apples apples = new Apples(5,"wite",1);
        Apples apples1 = new Apples(1,"1",1);
        Apples apples2 = new Apples(2,"1",3);


        Tree tree = new Tree("rte");
        tree.addApples(apples);
        tree.addApples(apples1);
        tree.addApples(apples2);

        Garden garden = new Garden("asd");
        garden.prosedura(tree);
        garden.prosedura(tree);
        garden.prosedura(tree);
        System.out.println(tree.listApples.toString());
        garden.getCountAppels();
    }
}
