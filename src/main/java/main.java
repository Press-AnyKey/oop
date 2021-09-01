import animals.classes.Animal;
import animals.classes.FirstBelief;
import animals.classes.HeightBeast;

public class main {
    public static void main(String[] args) {
        FirstBelief utconos = new FirstBelief();
        FirstBelief exidna = new FirstBelief();
        exidna.setAge(3);
        exidna.setName("Exidna");
        FirstBelief proExidna = new FirstBelief();

        HeightBeast human = new HeightBeast();
        human.setAge(24);
        human.setName("Alex");

        FirstBelief[] simpleArray = {utconos, exidna, proExidna};

        Animal[] complexArray = {exidna, human};

        for(Animal animal : complexArray){
            animal.doVoice();
            System.out.println(animal);
        }
        for (FirstBelief firstBelief : simpleArray){
            firstBelief.doVoice();
            System.out.println(firstBelief);
        }
        System.out.println(exidna);
    }
}
