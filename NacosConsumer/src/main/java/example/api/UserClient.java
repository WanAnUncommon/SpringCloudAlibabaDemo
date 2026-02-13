package example.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

// value 对应 Nacos 中的服务名
@FeignClient(value = "NacosProvider", path = "/provider")
public interface UserClient {

    @GetMapping("/hello")
    String hello();
}