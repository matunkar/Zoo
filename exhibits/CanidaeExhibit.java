package exhibits;
import animals.Animal;
import animals.Canidae;

import java.util.ArrayList;
import java.util.List;

public class CanidaeExhibit extends AnimalExhibits {
    List<Animal> animalList = new ArrayList<>();

    public CanidaeExhibit(String name, ExhibitType type) {
        super(name, type);
    }

    @Override
    public void getType() {
        
    }

    @Override
    public void getName() {
        
    }

    public void add(Animal amomal) {
        if (amomal instanceof Canidae) {
            animalList.add(amomal);
        }
    }
}
