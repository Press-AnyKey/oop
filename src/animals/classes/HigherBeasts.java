package animals.classes;

import animals.GiveBirth;
import animals.classes.Animal;

public class HigherBeasts extends Animal implements GiveBirth {
    public HigherBeasts(String name) {
        super(name);
    }

    private String detachment; //отряд //заполнять должны сами
    ///грызуны, хоботовые, ....

    public String getDetachment() {
        return detachment;
    }

    public void giveBirth() {
        System.out.println("оно живородящее");
    }
}
