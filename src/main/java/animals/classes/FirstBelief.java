package animals.classes;

import animals.interfaces.LayEggs;

public class FirstBelief extends Animal implements LayEggs {




    @Override
    public void doVoice(){
        System.out.println("FirstBelief");
    }

    public void giveBirth() {
        System.out.println("оно откладывает яйца");
    }

    public String breastZones;

    public String breastZones() {
        return breastZones;
    }
}
