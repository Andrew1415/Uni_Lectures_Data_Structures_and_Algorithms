/*
Stack namu darbai by Andrius Stulgys JNII21
Namu darbai yra modifikuota stacko uzduotis is paskaitos
 */
public class Item<T> {
    public T data;
    public Item<T> next=null;
    public Item(T data){
        this.data=data;
    }
}
