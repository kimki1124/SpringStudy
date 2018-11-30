package com.example.study;

import com.example.study.model.Player;
import com.example.study.service.PlayerService;
import config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {

    public static void main(String[] args){
        TestMain testMain = new TestMain();
        testMain.execute();
    }

    @SuppressWarnings("resource")
    private void execute() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        PlayerService playerService = ctx.getBean(PlayerService.class);
        playerService.addPlayer(new Player("1", "양의지"));
        Player player = playerService.findByPlayerName("양의지");
        System.out.println(player.getName());
    }


}
