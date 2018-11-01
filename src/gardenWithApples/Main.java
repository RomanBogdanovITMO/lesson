package gardenWithApples;

public class Main {
    public static void main(String[] args) {
        Garden garden = new Garden("сад яблок");
        Tree tree = new Tree("Дерево");
        Apples apples1 = new Apples(6,"read",4);
        tree.addApples(apples1);
        garden.prosedura(tree);
        System.out.println(apples1.frashCountApple);
    }
}
