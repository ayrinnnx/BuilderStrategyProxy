package org.example.two;

import java.util.ArrayList;
import java.util.List;

public class MailBox {
    private List<MailInfo> infos;

    public void addMailInfo(MailInfo mailInfo) {
        infos.add(mailInfo);
    }

    public void sendAll() {
        for (MailInfo info : infos) {
            MailSender mailSender = new MailSender(MailStrategySender.getMailStrategy(info.getMail()));
            mailSender.sendMail(info);
        }
    }
}
