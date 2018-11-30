package com.example.study.dao;

import com.example.study.model.Player;

public interface PlayerDao {
    public void addPlayer(Player player);

    public Player findByPlayerName(String name);
}
