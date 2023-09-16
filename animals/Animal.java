package animals;

public abstract class Animal {
    private String name;
    private double size;

    public Animal (String name, double size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {

        return name;
    }
    public double getSize() {

        return size;
    }
}
