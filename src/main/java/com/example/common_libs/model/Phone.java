package com.example.common_libs.model;

import lombok.*;


@Getter
@Setter
@Data
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor
public class Phone {

    private String number;

    private Person person;

}
