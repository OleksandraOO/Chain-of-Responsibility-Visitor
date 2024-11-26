package apps.ucu.task2;

public class Main {
    public static void main(String[] args) {
        // Creating clients using Builder
        Client client1 = Client.builder()
                .name("Alice")
                .age(25)
                .sex("Female")
                .build();

        Client client2 = Client.builder()
                .name("Bob")
                .age(30)
                .sex("Male")
                .build();

        // Creating mail strategies
        MailStrategy birthdayGreeting = new BirthdayGreetingMail();
        MailStrategy giftMail = new GiftMail();

        // Creating mail information using Builder
        MailInfo info1 = MailInfo.builder()
                .client(client1)
                .mailStrategy(birthdayGreeting)
                .build();

        MailInfo info2 = MailInfo.builder()
                .client(client2)
                .mailStrategy(giftMail)
                .build();

        // Sending mails directly
        sendMail(info1);
        sendMail(info2);
    }

    public static void sendMail(MailInfo mailInfo) {
        System.out.println("Sending mail to: " + mailInfo.getClient().getName());
        mailInfo.getMailStrategy().send(mailInfo);
    }
}
