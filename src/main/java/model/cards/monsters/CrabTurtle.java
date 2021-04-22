package model.cards.monsters;

import model.cards.MonsterAttribute;
import model.cards.KindOfMonster;

import static model.cards.MonsterAttribute.*;
import static model.cards.KindOfMonster.*;

public class CrabTurtle {

    private String name = "Crab Turtle";
    private int level = 8;
    private MonsterAttribute attribute = WATER;
    private String monsterType = "Aqua";
    private KindOfMonster kindOfMonster = Ritual;
    private int atk = 2550;
    private int def = 2500;
    private static final String description = "This monster can only be Ritual Summoned with the Ritual Spell Card, "Turtle Oath". You must also offer monsters whose total Level Stars equal 8 or more as a Tribute from the field or your hand.";
    private int price = 10200;


}
