/*
    Andrius Stulgys JNII21
    Animals OPP
 */
import java.util.LinkedList;
import java.util.Collections;

public class Main {
    public static void main (String[] args){
        LinkedList<Animal> animals=new LinkedList<>();

        Fish fish1=new Fish("Homer");
        fish1.setFinCount(20);

        Fish fish2=new Fish("Marge");
        fish2.setFinCount(10);

        Hamster hamster1=new Hamster("Bart");
        hamster1.setColor("Black");
        hamster1.setTaleLength(15);

        Hamster hamster2=new Hamster("Lisa");
        hamster2.setColor("grey");
        hamster2.setTaleLength(20);

        Hamster hamster3=new Hamster("Maggie");
        hamster3.setColor("white");
        hamster3.setTaleLength(2);

        Hamster hamster4=new Hamster("Bart");
        hamster4.setColor("Orange");
        hamster4.setTaleLength(12);


        animals.add(fish1);
        animals.add(hamster1);
        animals.add(hamster2);
        animals.add(hamster3);
        animals.add(fish2);
        animals.add(hamster4);


        Collections.sort(animals);

        for (int i=0; i<6;i++){
            System.out.println(animals.get(i));
        }

        System.out.println("Finding all animals named Bart:");
        find(animals,"Bart");

    }
        static void find(LinkedList<Animal> animals, String name){
        for(int i=0; i<6; i++){
            if(animals.get(i).getName().equals(name)){
                System.out.println(animals.get(i));
            }
        }
    }
}
