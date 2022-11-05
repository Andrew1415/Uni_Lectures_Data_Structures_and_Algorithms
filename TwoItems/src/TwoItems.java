public class TwoItems<A, B> {
    private A first;
    private B second;

    public A getFirst() {
        return first;
    }

    public void setFirst(A first) {
        this.first = first;
    }

    public B getSecond() {
        return second;
    }

    public void setSecond(B second) {
        this.second = second;
    }

    public TwoItems(A first, B second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "TwoItems{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
