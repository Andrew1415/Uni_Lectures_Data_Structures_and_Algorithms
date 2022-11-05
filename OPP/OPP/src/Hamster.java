public class Hamster extends Animal{

    public int tailLength;
    public String color;

    public Hamster(String name) {
        super(name, "Hamster");
    }

    public int getTaleLength() {
        return tailLength;
    }

    public String getColor() {
        return color;
    }

    public void setTaleLength(int taleLength) {
        this.tailLength = taleLength;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Hamster. " +
                "Name=" + name +
                ", Tale Length=" + tailLength +
                "cm, Color=" + color;
    }
}
