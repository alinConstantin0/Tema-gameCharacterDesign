package com.company;

public class Enemy extends Character implements Attack, DecreaseLife {
    public Enemy(int life, int attack) {
        super(life, attack);
    }

    @Override
    public void attacks(Character character) {
        System.out.println("I'm attacking you!");
        character.setLife(decreaseLife(super.getAttack()));
    }

    @Override
    public int decreaseLife(int hp) {
        int life = super.getLife();
        return life-hp;
    }
}
