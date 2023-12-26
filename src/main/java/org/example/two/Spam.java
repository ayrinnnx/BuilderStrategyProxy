package org.example.two;

public class Spam implements MailStrategy{

    @Override
    public String generateMessage(MailInfo mailInfo) {
        return "We sell this..., buy that..., subscribe..., and that's it...";
    }
}
