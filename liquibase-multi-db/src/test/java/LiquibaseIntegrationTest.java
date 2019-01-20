import code.exampleliquibase.LiquibaseMultiDB;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = LiquibaseMultiDB.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class LiquibaseIntegrationTest {
    @Test
    public void noOpTest() {
        //no-op test
    }
}
