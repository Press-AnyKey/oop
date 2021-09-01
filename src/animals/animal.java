package animals;
//implements BirthOfChildren

abstract class Animal  {
    public String name;
    //protected int age;

    public String getName(){
        return name;
    }
    /*public int getAge(){
        return age;
    }*/

    public Animal(String name){
        this.name = name;
    }

    //public abstract void display();


}


class FirstBeliefs extends Animal implements LayEggs {
    public FirstBeliefs (String name){
        super(name);
    }
    public void giveBirth(){
        System.out.println("оно откладывает яйца");
    }

    public String breastZones = "У самок вместо сосков есть зоны молочных желёз, " +
            "с которых потомство слизывает молоко";

    public String breastZones(){
        return breastZones;
    }
}
class LowerBeasts extends Animal implements WearInBag{
    public LowerBeasts (String name){
        super(name);
    }

    public void giveBirth(){
        System.out.println("оно носит детей в сумке");
    }
}
class HigherBeasts extends Animal implements GiveBirth{
    public HigherBeasts (String name){
        super(name);
    }

    private String detachment; //отряд //заполнять должны сами
    ///грызуны, хоботовые, ....

    public String getDetachment(){
        return detachment;
    }

    public void giveBirth(){
        System.out.println("оно живородящее");
    }
}

class Rodents extends HigherBeasts{ //грызуны
    public Rodents (String name){
        super(name);
    }
    public int enlargedIncisors = 2;
    public int enlargedIncisors(){
        return enlargedIncisors;
    }

}