package de.moritz.cs2gsi.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class GameInfo {
    private String roundPhase;
    private int playerHP;

    public GameInfo(String roundPhase, int playerHP) {
        this.roundPhase = roundPhase;
        this.playerHP = playerHP;
    }

    public String getRoundPhase() {
        return roundPhase;
    }

    public void setRoundPhase(String roundPhase) {
        this.roundPhase = roundPhase;
    }

    public int getPlayerHP() {
        return playerHP;
    }

    public void setPlayerHP(int playerHP) {
        this.playerHP = playerHP;
    }

    @JsonProperty("round")
    private void unpackRoundPhase(Map<String,Object> round) {
        this.roundPhase = (String)round.get("phase");
    }

    @SuppressWarnings("unchecked")
    @JsonProperty("player")
    private void unpackPlayerHp(Map<String,Object> player) {
        Map<String,Integer> state = (Map<String,Integer>)player.get("state");
        this.playerHP = state.get("health");
    }
}
