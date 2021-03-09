package com.company;

public class Hero extends Character implements Attack,DecreaseLife {

    public Hero(int life, int attack) {
        super(life, attack);
    }

    @Override
    public void attacks(Character character) {
        character.setLife(decreaseLife(super.getAttack())+2);

    }

    @Override
    public int decreaseLife(int hp) {
        int life = super.getLife();
        return life-hp;
    }
}
