package config;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.web.context.support.RequestHandledEvent;

public class CustomEventListener implements ApplicationListener {
    public void onApplicationEvent(ApplicationEvent event) {
        if(event instanceof ContextRefreshedEvent){
            // ContextRefreshedEvent - Bean 라이프사이클 초기화 이후 발생
            System.out.println("ContextRefreshedEvent Event fire");
        }else if(event instanceof ContextStartedEvent){
            // ContextStartedEvent - ApplicationContext 시작 시 발생
            System.out.println("ContextStartedEvent Event fire");
        }else if(event instanceof ContextStoppedEvent){
            // ContextStoppedEvent - ApplicationContext 정지 시 발생
            System.out.println("ContextStoppedEvent Event fire");
        }else if(event instanceof ContextClosedEvent){
            // ContextClosedEvent - ApplicationContext의 close 메서드 호출 시 발생
            System.out.println("ContextClosedEvent Event fire");
        }else if(event instanceof RequestHandledEvent){
            // RequestHandledEvent - http 요청이 들어올 때마다 발생
            System.out.println("RequestHandledEvent Event fire");
        }
    }
}
