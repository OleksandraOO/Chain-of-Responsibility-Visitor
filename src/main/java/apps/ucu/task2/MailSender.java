package apps.ucu.task2;

public class MailSender {
    public void sendMail(MailInfo mailInfo) {
        mailInfo.getMailStrategy().send(mailInfo);
    }
}
