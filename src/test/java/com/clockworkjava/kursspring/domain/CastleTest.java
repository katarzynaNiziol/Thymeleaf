package com.clockworkjava.kursspring.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CastleTest {

    Knight knight = new Knight();

    @Test
    public void castleToStringMessage() {
        Quest quest = new Quest();
        Knight knight = new Knight();
        knight.setQuest(quest);
        Castle castle = new Castle(knight, "Castle Black");
        String except = "Castle Black. It's flat of knight Knight Lancelot 29 QUEST Save the Queen";
        assertEquals(except, castle.toString());
    }
}
