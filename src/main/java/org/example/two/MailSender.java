package org.example.two;

public class MailSender {
    private MailStrategy mailStrategy;

    public MailSender(MailStrategy mailStrategy) {
        this.mailStrategy = mailStrategy;
    }

    public void sendMail(MailInfo mailInfo) {
        String message = mailStrategy.generateMessage(mailInfo);
        System.out.println(message + " For " + mailInfo.getClient().getName() + "; " +mailInfo.getClient().getId());
    }
}
