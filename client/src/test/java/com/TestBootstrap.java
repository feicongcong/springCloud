package com;

import com.SpringCloudAll.client.ClientBootstrap;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * @Description:
 * @Author: CC.F
 * @Date: 22:38 2019/3/8
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {ClientBootstrap.class, TestBootstrap.class})
public class TestBootstrap {
//    @Autowired
//    private BusinessFeign businessFeign;
//
//    @Test
//    public void test() {
//        businessFeign.businessTest();
//    }
}
