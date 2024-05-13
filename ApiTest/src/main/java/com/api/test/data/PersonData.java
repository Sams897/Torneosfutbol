package com.api.test.data;

import com.api.test.model.Person;
import java.util.ArrayList;
import java.util.List;


public class PersonData {

    public PersonData()
    {}

    public List<Person> GetData()
    {
        //"Get Data"
        List<Person> data = new ArrayList<>();
        data.add(new Person(14, "Bayern Munich", "1", "Harry Kane", "Minuto 90"));
        data.add(new Person(4, "Bayern Munich", "2", "Thomas Muller", "Minuto 60"));
        data.add(new Person(7, "PSG", "2", "Mbappe", "Minuto 30"));
        data.add(new Person(11, "PSG", "3", "Lucas", "Minuto 70"));

        return data;
    }
}