package com.company;

public class Main {

    public static void main(String[] args) {
        Hero hero = new Hero(100, 10);
        Enemy enemy = new Enemy(100, 2);
        enemy.attacks(hero);
        hero.attacks(enemy);
        System.out.println(hero.getLife());
        System.out.println(enemy.getLife());
        enemy.attacks(hero);
        hero.attacks(enemy);
        System.out.println(hero.getLife());
        System.out.println(enemy.getLife());
    }
}
