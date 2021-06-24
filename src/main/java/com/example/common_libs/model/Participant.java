package com.example.common_libs.model;


import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.io.Serializable;
import java.util.List;


@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Participant implements Serializable {

    private Integer id;
    @JsonAlias("name")
    private String name;

    @JsonAlias("age")
    private int age;

    private int LASTScore;

    private List<Document> documents;

}
