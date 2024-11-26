package apps.ucu.task2;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Client {
    private static int idCounter = 0;
    private final int id;
    private final String name;
    private final int age;
    private final String sex;

    public Client(String name, int age, String sex) {
        this.id = idCounter++;
        this.age = age;
        this.sex = sex;
    }
}
