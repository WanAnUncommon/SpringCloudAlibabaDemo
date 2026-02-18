package com.example;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    // 将方法标记为Sentinel的资源，起名为"HelloWorld"，提供限流降级处理方法handleBlock
    @SentinelResource(value = "HelloWorld", blockHandler = "handleBlock")
    public void helloWorld() {
        System.out.println("hello world - " + System.currentTimeMillis());
    }

    // 限流后的处理方法（必须与原方法签名一致，加上 BlockException 参数）
    public void handleBlock(BlockException ex) {
        System.out.println("被限流了！" + ex.getMessage());
    }
}