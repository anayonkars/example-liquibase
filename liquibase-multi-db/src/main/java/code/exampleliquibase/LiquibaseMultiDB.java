package code.exampleliquibase;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import static org.springframework.boot.WebApplicationType.NONE;

@SpringBootApplication
public class LiquibaseMultiDB {
    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .web(NONE)
                .sources(LiquibaseMultiDB.class)
                .build()
                .run();
    }
}
