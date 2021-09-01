package animals.classes;

import animals.interfaces.WearInBag;

class LowerBeasts extends Animal implements WearInBag {
    public LowerBeasts(String name) {
        super(name);
    }

    public void giveBirth() {
        System.out.println("оно носит детей в сумке");
    }
}
