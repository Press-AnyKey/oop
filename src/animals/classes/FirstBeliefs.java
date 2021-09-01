package animals.classes;

public class FirstBeliefs extends Animal implements LayEggs {
    public FirstBeliefs(String name) {
        super(name);
    }

    public void giveBirth() {
        System.out.println("оно откладывает яйца");
    }

    public String breastZones = "У самок вместо сосков есть зоны молочных желёз, " +
            "с которых потомство слизывает молоко";

    public String breastZones() {
        return breastZones;
    }
}
