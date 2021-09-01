package animals.classes;

import animals.classes.HigherBeasts;

class Rodents extends HigherBeasts { //грызуны
    public Rodents(String name) {
        super(name);
    }

    public int enlargedIncisors = 2;

    public int enlargedIncisors() {
        return enlargedIncisors;
    }

}
