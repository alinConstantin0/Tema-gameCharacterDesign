package com.company;

public abstract class Character {
    private int life;
    private int attack;

    public Character(int life,int attack){
        this.life= life;
        this.attack=attack;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
}
