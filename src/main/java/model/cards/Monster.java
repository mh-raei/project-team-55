package model.cards;

import model.cards.cardfeaturesenums.CardType;
import model.cards.cardfeaturesenums.MonsterAttribute;
import model.cards.cardfeaturesenums.MonsterType;

public abstract class Monster extends Card {

    private int atk;
    private int def;
    private int level;
    private MonsterAttribute attribute;
    private MonsterType monsterType;
    private CardType cardType;

    protected Monster(String cardName, String description, int price, int atk, int def, int level,
                      MonsterAttribute attribute, MonsterType monsterType, CardType cardType) {
        super(cardName, description, price);
        this.atk = atk;
        this.def = def;
        this.level = level;
        this.attribute = attribute;
        this.monsterType = monsterType;
        this.cardType = cardType;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public MonsterAttribute getAttribute() {
        return attribute;
    }

    public void setAttribute(MonsterAttribute attribute) {
        this.attribute = attribute;
    }

    public MonsterType getMonsterType() {
        return monsterType;
    }

    public void setMonsterType(MonsterType monsterType) {
        this.monsterType = monsterType;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

}