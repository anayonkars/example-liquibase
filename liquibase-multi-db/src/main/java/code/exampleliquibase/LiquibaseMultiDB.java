package code.exampleliquibase;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
public class LiquibaseMultiDB {
    public static void main(String[] args) {
        run(LiquibaseMultiDB.class, args);
    }
}
