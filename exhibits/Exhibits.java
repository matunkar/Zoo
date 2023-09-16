package exhibits;

public abstract class Exhibits {

    // Name

    public String name;
    public ExhibitType type;

    // Type
    public enum ExhibitType {
        ANIMALS, PLANTS, LOCATIONS;
    }

    public Exhibits (String name, ExhibitType type) {

    }


    // get type



    // get name

    public abstract void getName();
    public abstract void getType();
}
