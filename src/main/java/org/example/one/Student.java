package org.example.one;

import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

@SuperBuilder
@ToString(callSuper = true)
public class Student extends User {
    private int middleMark;
    private List<Integer> grades;
}
