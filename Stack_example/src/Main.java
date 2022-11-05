/*
Stack namu darbai by Andrius Stulgys JNII21
Namu darbai yra modifikuota stacko uzduotis is paskaitos
 */
public class Main {
    public static void main(String[] args) {

        Stack<Integer> s=new Stack<Integer>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        System.out.println(s.peek());
        System.out.println(s.search(6));
        System.out.println(s.get(3));
        s.remove(3);
        System.out.println(s.get(3));


        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }



    }

}


//    Stack klasėje pamėginkite realizuoti metodus:
//        T peek() - grąžinamas paskutinis įdėtas elementas, tačiau jis nepašalinamas iš klasės
//        boolean search(T value) - steke ieškomas elementas value, jei randame, grąžinama true, jei nerandama grąžinama false.
//        Sukurkite papildomą metodą kuris grąžintų steko n-tąjį elementą nuo viršaus: get(int n)
//        Sukurkite papildomą metodą kuris panaikintų iš steko n-tąjį elementą nuo viršaus: remove(int n)