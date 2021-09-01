package animals.classes;

//базовый класс Animal нужен для того, чтобы в каждом наследуемом классе не писать поля name и age и получать к ним доступ
public abstract class Animal {
    //поле имени
    private String name;
    //поле возраст
    protected int age;

    //геттер name
    public String getName() {
        return name;
    }

    //геттер age
    public int getAge() {
        return age;
    }

    //сеттер name
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
}