package com.halo.mall.thirdparty;


import com.aliyun.oss.OSSClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@SpringBootTest
@RunWith(SpringRunner.class)
public class HalomallThirdPartyApplicationTests {

    @Resource
    OSSClient ossClient;

    @Test
   public void uploadTestByCloud() throws FileNotFoundException {
        // 上传文件流。
        InputStream inputStream = new FileInputStream("E:\\OneDrive - lanqilu\\我的图片库\\头像\\wallhaven-5wodp1 (3).jpg");
        ossClient.putObject("halomall", "头像4.jpg", inputStream);

        // 关闭OSSClient。
        ossClient.shutdown();
    }
}
