package com.example.gamesapp;

public class GameModel {
    private int gameImage;
    private String gameName;

    public GameModel(int gameImage, String gameName) {
        this.gameImage = gameImage;
        this.gameName = gameName;
    }

    public int getGameImage() {
        return gameImage;
    }

    public String getGameName() {
        return gameName;
    }
}
