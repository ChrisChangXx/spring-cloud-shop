package config;

import com.example.app.rule.LubanRule;
import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PowerRuleConfig {
    @Bean
    public IRule iRule() {
        return new LubanRule();
    }
}
