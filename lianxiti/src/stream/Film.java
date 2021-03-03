package stream;

public class Film {
    private String name;

    @Override
    public String toString() {
        return "Film{" +
                "name='" + name + '\'' +
                '}';
    }

    public Film() {
    }

    public Film(String name) {

        this.name = name;
    }
}
