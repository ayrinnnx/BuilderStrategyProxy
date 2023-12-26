package org.example.one;

import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@ToString
public class User {
    private String name;
    private int age;
    private String gender;
    private double weight;
    private double height;
}
