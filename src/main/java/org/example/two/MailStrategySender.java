package org.example.two;

public class MailStrategySender {
    public static MailStrategy getMailStrategy(String mail) {
        if ("spam".equals(mail)) {
            return new Spam();
        } else if ("university".equals(mail)) {
            return new UniversityMail();
        } else {
            return new Default();
        }
    }
}
