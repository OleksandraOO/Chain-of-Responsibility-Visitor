package apps.ucu.task1;

public class Main {
    public static void main(String[] args) {
        User user = User.builder()
                .name("OLYAUA")
                .age(25)
                .gender(apps.ucu.task1.Gender.FEMALE)
                .weight(60.5)
                .height(165.0)
                .build();

        System.out.println(user);
    }
}
