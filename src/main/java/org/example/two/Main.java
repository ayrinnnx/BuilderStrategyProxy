package org.example.two;

public class Main {
    public static void main(String[] args) {
        Client someone = new Client("Someone", 45, "m");
        Client someoneTwo = new Client("SomeoneTwo", 37, "w");

        MailInfo mailInfo = new MailInfo(someoneTwo, "spam");
        MailBox mailBox = new MailBox();
        mailBox.addMailInfo(mailInfo);
        mailBox.sendAll();

    }
}
