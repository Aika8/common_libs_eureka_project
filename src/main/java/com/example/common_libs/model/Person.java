package com.example.common_libs.model;


import lombok.*;

import java.util.List;


@Getter
@Setter
@Data
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor
public class Person {

    private String name;

    private int age;

    private List<Phone> phones;

}
