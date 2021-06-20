package com.example.common_libs.feigns;


import com.example.common_libs.model.Person;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "person-app")
public interface PersonFeign {

    @GetMapping(value = "api/persons/by-name/{name}")
    List<Person> getByName(@PathVariable String name);
}
