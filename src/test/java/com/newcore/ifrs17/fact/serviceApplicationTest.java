package com.newcore.ifrs17.fact;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.junit.Test;
import org.junit.platform.commons.util.StringUtils;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

/**
 * @author ：launcher
 * @date ：Created in 2021/3/10
 * @description：
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = serviceApplicationTest.class)
public class serviceApplicationTest {

    @Test
    public void contextLoads() {
        String s = "";

        System.out.println(StringUtils.isNotBlank(s));
    }
}
