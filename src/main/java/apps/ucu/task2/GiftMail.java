package apps.ucu.task2;

public class GiftMail implements MailStrategy {
    @Override
    public void send(MailInfo mailInfo) {
        System.out.println("Sending Gift Mail to: " + mailInfo.getClient().getName());
    }
}
