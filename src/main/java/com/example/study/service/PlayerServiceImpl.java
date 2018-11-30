package com.example.study.service;

import com.example.study.dao.PlayerDao;
import com.example.study.model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class PlayerServiceImpl implements PlayerService{

    @Autowired
    private PlayerDao playerDao;

    public PlayerServiceImpl(){
        System.out.println("PlayerServiceImpl object create");
    }

    public void addPlayer(Player player) {
        playerDao.addPlayer(player);
    }

    public Player findByPlayerName(String name) {
        return playerDao.findByPlayerName(name);
    }
}
