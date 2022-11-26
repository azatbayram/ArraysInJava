package ArrayPractice;

public class ArrayWithLoop {

    public static void main(String[] args) {

        String[] products = {"Timberland","Shirt","Watch","Bag","Shoes"};
        double [] prices = {120.0,12.99,300,25,67.89};

        for (int i=0; i<products.length; i++) {
            System.out.println(products[i]);
        }

        System.out.println("**********************");

        for (String word:products) {
            System.out.println(word);
        }

        System.out.println("*********************");

        for (double price:prices) {
            System.out.println(price);
        }

        System.out.println("**********************");

        //print products in reverse order
        for(int i=products.length-1;i>=0;i--) {
            System.out.println(products[i]);
        }
    }

}
