package org.example.two;

import lombok.Getter;

public class Client {
    private static int counter = 0; //for id
    @Getter
    private int id;
    @Getter
    private String name;
    @Getter
    private int age;
    @Getter
    private String sex;


    public Client(String client, int age, String sex) {
        this.id = counter++;
        this.name = client;
        this.age = age;
        this.sex = sex;
    }
}
