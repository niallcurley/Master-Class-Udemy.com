package practicejavaprograms;
/*
polymorphism is using one class to point to another and using its variables/instance variables and methods
 */
public class Main {

    public static void main(String[] args) {


        Plant plant1 = new Plant();
        plant1.grow();
        Tree tree = new Tree();
        tree.grow();

        Plant plant2 = tree;

        plant2.grow();

        //tree.shedLeaves();

        //plant2.shedLeaves();  -- doesnt work

        Plant plant3 = new Plant();

        plant3.grow();

        Plant plant4 = tree;
        plant4.grow();

        //tree.shedLeaves();
        plant4.grow();
        tree.shedLeaves();
        tree.grow();
        tree.water();

        doGrow(tree);
    }

    public static void doGrow(Plant plant){//this is for entering a parametre class so that certain methods can be entered.

        plant.grow();

    }
}
