package Map;

import java.util.Objects;

public class Car {
    private String name;
    private String color;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Car car = (Car) o;
        return Objects.equals(getName(), car.getName()) &&
                Objects.equals(getColor(), car.getColor());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getName(), getColor());
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Car() {

    }

    public Car(String name, String color) {

        this.name = name;
        this.color = color;
    }
}
