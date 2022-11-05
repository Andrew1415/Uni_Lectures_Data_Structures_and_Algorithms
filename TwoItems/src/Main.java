/*
    Andrius Stulgys JNII21
    TwoItems
 */

public class Main {
    public static void main(String[] args){
        TwoItems<String,String> Items=new TwoItems<>("Homer","Marge");

        System.out.println(Items.getFirst());
        System.out.println(Items.getSecond());
        System.out.println(Items);
    }
}
