package animals.classes;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
//базовый класс Animal нужен для того, чтобы в каждом наследуемом классе не писать поля name и age и получать к ним доступ
public abstract class Animal {
    //поле имени
    private String name;
    //поле возраст
    private int age;

    public void doVoice(){
        System.out.println("Animal");
    }
}