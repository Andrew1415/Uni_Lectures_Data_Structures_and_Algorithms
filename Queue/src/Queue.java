public class Queue<T> {
    private Item<T> q=null;
    private Item<T> p=null;
    private int elementCount=0;

    public boolean isEmpty() {
        return (p==null && q==null);
    }

    public void enQueue(T data) {
        if (isEmpty()) {
            q=new Item<T>(data);
            p=q;
        }else {
            q.next=new Item<T>(data);
            q=q.next;
        }
        this.elementCount++;
    }

    public T deQueue() {
        if (isEmpty())
            return null;
        T tmp=p.getData();
        p=p.next;
        if (p==null)
            q=null;
        this.elementCount--;
        return tmp;
    }

    public int count(){
        return this.elementCount;
    }

    public void printReverse(){
        Stack<T> s=new Stack<T>();
        while(!isEmpty()){
            s.push(deQueue());
        }
        while(!s.isEmpty()){
            enQueue(s.pop());
        }
        while (!isEmpty()) {
            System.out.print(deQueue()+" ");
        }
    }

    public void add (T t, int i) {
        Stack<T> s = new Stack<T>();
        int count = this.elementCount;
        if (i == 0) {
            s.push(t);
        } else if (i > 0 && i <= count) {
            for (int j = 0; j <= count; j++) {
                if (j != i) {
                    s.push(deQueue());
                } else {
                    s.push(t);
                }
            }
        } else if (i > count) {
            while (!isEmpty()) {
                s.push(deQueue());
            }
            s.push(t);
        }
        while (!s.isEmpty()) {
            enQueue(s.pop());
        }
        Stack<T> ss=new Stack<T>();
        while(!isEmpty()){
            ss.push(deQueue());
        }
        while(!ss.isEmpty()){
            enQueue(ss.pop());
        }
    }

    public void remove(int n){
        int count = this.elementCount;
        Stack<T> s=new Stack<T>();
        for(int i=0; i<count; i++){
            if(i!=n){
                s.push(deQueue());
            } else {
                deQueue();
            }
        }
        Stack<T> ss=new Stack<T>();
        for(int i=0; i<s.size; i++){
            ss.push(s.pop());
        }
        while(!ss.isEmpty()){
            enQueue(ss.pop());
        }
    }
}