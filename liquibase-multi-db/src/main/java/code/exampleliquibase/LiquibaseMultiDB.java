package code.exampleliquibase;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class LiquibaseMultiDB {
    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .sources(LiquibaseMultiDB.class)
                .build()
                .run(args);
    }
}
