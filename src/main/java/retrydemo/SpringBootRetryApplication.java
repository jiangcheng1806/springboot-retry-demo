package retrydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;

@EnableRetry   //开启重试机制
//@EnableAutoConfiguration //开启自动配置
@SpringBootApplication
public class SpringBootRetryApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootRetryApplication.class,args);
    }
}
