package practicejavaprograms;

public class Main {

    public static void main(String[] args) {
	// polymorphic array

//        food food1 []= new food[2];
//        food1[0]=new tuna();
//        food1[1]=new potpie();
//
//
//        for(int i=0; i<2; ++i){
//            food1[i].eat();
//        }

        //calling subclass objects&methods through superclass
        fatty f = new fatty();
        food fo = new food();
        food po = new potpie();//calling potpie a subclass of food
        food to = new tuna();//calling tuna a subclass of food

        f.digest(fo);
        f.digest(po);
        f.digest(to);


        //f.digest();
    }
}
