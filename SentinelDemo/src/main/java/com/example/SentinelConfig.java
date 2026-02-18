package com.example;

import com.alibaba.csp.sentinel.slots.block.RuleConstant;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;
import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class SentinelConfig {

    @PostConstruct
    public void initFlowRules() {
        List<FlowRule> rules = new ArrayList<>();
        FlowRule rule = new FlowRule();
        rule.setResource("HelloWorld");  // 与 @SentinelResource 的 value 一致
        rule.setGrade(RuleConstant.FLOW_GRADE_QPS);
        rule.setCount(1);  // QPS 阈值为 1
        rules.add(rule);
        FlowRuleManager.loadRules(rules);
        System.out.println("Sentinel 限流规则已加载");
    }
}