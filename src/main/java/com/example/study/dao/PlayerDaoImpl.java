package com.example.study.dao;

import com.example.study.model.Player;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

public class PlayerDaoImpl implements PlayerDao{
    private Map<String, Player> storage = new HashMap<String, Player>();

    public PlayerDaoImpl(){
        System.out.println("PlayerDaoImpl object create");
    }

    public void addPlayer(Player player) {
        storage.put(player.getName(), player);
    }

    public Player findByPlayerName(String name) {
        return storage.get(name);
    }
}
