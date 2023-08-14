package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.springframework.core.io.ClassPathResource;

public class UserDaoTest {
    @BeforeEach
    void setUp() {
        ResourceDatabasePopulator populator = new ResuorceDatabasePopulator();
        populator.addScript(new ClassPathResource("d"))
    }
}