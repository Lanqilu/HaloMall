package com.halo.mall.product;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.halo.mall.product.entity.BrandEntity;
import com.halo.mall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class HalomallProductApplicationTests {

    @Autowired
    BrandService brandService;



    @Test
    public void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("华为");
        brandService.save(brandEntity);
        System.out.println("保存成功");
    }

    @Test
    public void updateTest() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setBrandId(1L);
        brandEntity.setDescript("华为");
        brandService.updateById(brandEntity);
    }

    @Test
    public void queryTest() {
        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        list.forEach(System.out::println);
    }

//    @Test
//    public void uploadTest() throws FileNotFoundException {
//        String endpoint = "oss-cn-hangzhou.aliyuncs.com";
//        // 云账号AccessKey有所有API访问权限，建议遵循阿里云安全最佳实践，创建并使用RAM子账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建。
//        String accessKeyId = "LTAI5tRGm2omTeKzKcFfUwW9";
//        String accessKeySecret = "NIhOLnPOnNFEWyiOkIUyTf5SiiSyHT";
//
//        // 创建OSSClient实例。
//        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
//
//        // 上传文件流。
//        InputStream inputStream = new FileInputStream("E:\\OneDrive - lanqilu\\我的图片库\\头像\\wallhaven-5wodp1 (3).jpg");
//        ossClient.putObject("halomall", "头像.jpg", inputStream);
//
//        // 关闭OSSClient。
//        ossClient.shutdown();
//    }
}
