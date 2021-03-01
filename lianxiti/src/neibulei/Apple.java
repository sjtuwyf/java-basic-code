package neibulei;

public class Apple {
    double size;
    String color;

    @Override
    public String toString() {
        return "Apple{" +
                "size=" + size +
                ", color='" + color + '\'' +
                '}';
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Apple(double size, String color) {

        this.size = size;
        this.color = color;
    }
}
