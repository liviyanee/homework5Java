package com.company;

public class Main {

    public static void main(String[] args) {
        Boss a1 = new Boss();
        a1.setHealth(700);
        a1.setDamage(50);
        a1.setTypeOfProtection("Magical");
        System.out.println("Boss health: " + a1.getHealth() +
                "  " + "Boss damage:" + a1.getDamage() + "  " + "Boss type of protection:" +
                " " + a1.getTypeOfProtection());

        for (Hero hero: createHeroes()) {
            System.out.println(hero.getHealth() + " " + hero.getDamage() + " " + hero.getSuperpower());
        }
    }


    public static Hero[] createHeroes() {
        Hero witch = new Hero(20, 250);
        Hero kinetic = new Hero(30, 260, "telepathic");
        Hero warrior = new Hero(45, 275);
        return new Hero[]{witch, kinetic, warrior};
    }

}
