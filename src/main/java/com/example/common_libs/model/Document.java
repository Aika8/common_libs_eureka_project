package com.example.common_libs.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.io.Serializable;


@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor

@JsonIgnoreProperties(ignoreUnknown = true)
public class Document implements Serializable {

    private Integer id;

    private String harvardDoc;

    private String columbiaDoc;

    private Participant participant;

}
