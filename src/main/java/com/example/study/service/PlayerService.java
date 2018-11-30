package com.example.study.service;

import com.example.study.model.Player;

public interface PlayerService {
    public void addPlayer(Player player);

    public Player findByPlayerName(String name);
}
