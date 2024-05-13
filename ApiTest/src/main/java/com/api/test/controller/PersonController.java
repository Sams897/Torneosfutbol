package com.api.test.controller;

import org.springframework.web.bind.annotation.*;
import jakarta.servlet.http.HttpServletRequest;
import java.util.List;
import com.api.test.data.PersonData;
import com.api.test.model.Person;

/**
 * @author cramos
 */
@RestController
@RequestMapping("/api/person")
public class PersonController
{
    @GetMapping
    public List<Person> getTest(HttpServletRequest request)
    {
        PersonData personData = new PersonData();
        List<Person> data = personData.GetData();
        return data;
    }    
}
