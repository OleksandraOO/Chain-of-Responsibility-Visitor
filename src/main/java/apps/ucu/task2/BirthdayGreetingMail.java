package apps.ucu.task2;

public class BirthdayGreetingMail implements MailStrategy {
    @Override
    public void send(MailInfo mailInfo) {
        System.out.println("Sending Birthday Greeting to: " + mailInfo.getClient().getName());
    }
}
