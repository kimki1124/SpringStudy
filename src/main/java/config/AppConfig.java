package config;

import com.example.study.dao.PlayerDaoImpl;
import com.example.study.service.PlayerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.study.*")
public class AppConfig {

    @Bean
    public PlayerServiceImpl playerService(){
        return new PlayerServiceImpl();
    }

    @Bean
    public PlayerDaoImpl playerDao(){
        return new PlayerDaoImpl();
    }

    @Bean
    public CustomEventListener customEventListener(){
        return new CustomEventListener();
    }
}
