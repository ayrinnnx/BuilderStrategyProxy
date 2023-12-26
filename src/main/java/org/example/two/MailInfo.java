package org.example.two;

import lombok.Getter;

public class MailInfo {
    @Getter
    private Client client;
    @Getter
    private String mail;

    public MailInfo(Client client, String mail) {
        this.client = client;
        this.mail = mail;
    }


}
