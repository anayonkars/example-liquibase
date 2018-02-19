package code.exampleliquibase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiquibaseMultiDB {
    public static void main(String[] args) {
        SpringApplication.run(LiquibaseMultiDB.class, args);
    }
}
