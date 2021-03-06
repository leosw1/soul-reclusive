package soul.reclusive;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Hello world!
 */
@SpringBootApplication(scanBasePackages = "soul.reclusive")
@MapperScan(basePackages = "soul.reclusive")
@EnableSwagger2
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}
