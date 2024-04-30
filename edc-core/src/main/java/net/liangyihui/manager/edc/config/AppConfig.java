package net.liangyihui.manager.edc.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.redisson.config.SingleServerConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author seweide
 */
@Configuration
public class AppConfig {

    @Value("${net.liangyihui.edc.redis.url}")
    private String redisUrl;
    @Value("${net.liangyihui.edc.redis.database}")
    private int dataBase;

    @Bean
    public RedissonClient redissonClient() {
        Config config = new Config();
        SingleServerConfig singleServerConfig = config.useSingleServer();
        singleServerConfig.setAddress(redisUrl);
        singleServerConfig.setDatabase(dataBase);
        // 其他配置项都先采用默认值
        return Redisson.create(config);
    }


    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
