package retrydemo.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import retrydemo.BaseTest;

public class RetryServiceTest extends BaseTest {
    @Autowired
    private RetryService retryService;

    @Test
    public void retry(){
        int count = retryService.retry(-1);
        System.out.println("库存为 : " + count);
    }
}
