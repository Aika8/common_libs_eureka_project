package com.example.common_libs.feigns;


import com.example.common_libs.model.Document;
import com.example.common_libs.model.Participant;
import com.example.common_libs.model.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "participant-app")
public interface ParticipantFeign {

    @GetMapping(value = "api/participants/by-name/{name}")
    List<Participant> getByName(@PathVariable String name);

    @PostMapping(value = "api/participants")
    Participant save(@RequestBody Participant participant);

    @GetMapping(value = "api/participants")
    List<Participant> get();

    @DeleteMapping(value = "api/participants/{id}")
    void delete(@PathVariable Integer id );

    @GetMapping(value = "api/participants/documents/{id}")
    List<Document> getDocuments(@PathVariable Integer id);

    @PostMapping(value = "api/students")
    Student save(@RequestBody Student student);

    @PostMapping(value = "api/participants//documents")
    Document saveDoc(@RequestBody Document document);

}
