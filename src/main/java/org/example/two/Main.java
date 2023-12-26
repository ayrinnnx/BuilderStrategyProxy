package org.example.two;

public class Main {
    public static void main(String[] args) {
        Client someone = new Client("Someone", 45, "m");

        MailInfo mailInfo = new MailInfo(someone, "spam");
        MailBox mailBox = new MailBox();
        mailBox.addMailInfo(mailInfo);
        mailBox.sendAll();

    }
}
