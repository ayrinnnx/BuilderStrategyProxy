package org.example.one;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        User user = Student.builder().name("Iryna").age(18)
                .gender("w").weight(50.0).height(169.2).middleMark(90).grades(Arrays.asList(93, 98, 72)).build();
        System.out.println(user);
    }
}
