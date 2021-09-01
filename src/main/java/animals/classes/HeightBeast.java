package animals.classes;

import animals.interfaces.GiveBirth;


public class HeightBeast extends Animal implements GiveBirth {

    @Override
    public void doVoice() {
        System.out.println("HeightBeast");
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
