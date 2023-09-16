package exhibits;
import animals.Animal;
import animals.Felidae;

import java.util.ArrayList;
import java.util.List;

public class FelidaeExhibit extends AnimalExhibits {
    List<Animal> animalList = new ArrayList<>();

    public FelidaeExhibit(String name, ExhibitType type) {
        super(name, type);
    }

    @Override
    public void getType() {
        
    }

    @Override
    public void getName() {
        
    }

    public void add(Animal amomal) {
        if (amomal instanceof Felidae) {
            animalList.add(amomal);
        }
    }
}
