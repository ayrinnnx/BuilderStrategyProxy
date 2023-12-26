package org.example.two;

public class Default implements MailStrategy{
    @Override
    public String generateMessage(MailInfo mailInfo) {
        return "La-la-la";
    }
}
