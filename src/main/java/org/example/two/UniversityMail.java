package org.example.two;

public class UniversityMail implements MailStrategy{
    @Override
    public String generateMessage(MailInfo mailInfo) {
        return "Dear " + mailInfo.getClient().getName() + ", are expelled from the university, come and collect your documents!";
    }
}
