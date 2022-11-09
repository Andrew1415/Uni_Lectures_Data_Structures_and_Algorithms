/*
JNII21 Andrius Stulgys
Queue
 */
public class Main {
    public static void main(String[] args){
        Queue<Integer> q=new Queue<>();

        System.out.println("Inserted elements: ");
        for (int i=0; i<10; i++) {
            q.enQueue(i);
            System.out.print(i+" ");
        }

        System.out.println();
        System.out.println(q.count());
        System.out.println();

        q.add(10, 7);

        q.remove(8);

        System.out.println("Queue elements: ");
        while (!q.isEmpty()) {
            System.out.print(q.deQueue()+" ");
        }

        System.out.println();

        //System.out.println("Reversed Queue: ");
        //q.printReverse();

    }
}