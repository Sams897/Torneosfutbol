package com.api.test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.api.test.data.PersonData;
import com.api.test.model.Person;

@SpringBootTest
class TestApplicationTests {

    @Test
    void contextLoads() {
        PersonData personData = new PersonData();
        List<Person> data = personData.GetData();
        assertNotNull(data);
    }
}
