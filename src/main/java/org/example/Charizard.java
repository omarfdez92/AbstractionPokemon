package org.example;

public class Charizard extends Pokemon {

    public Charizard (String name, int number, int hp){
        super(name, number, hp);
    }

    @Override
    public void attack(Pokemon target){
        System.out.println(getName() + " use Fire Blast!");
        int damage = 20;//Simulate fire blast damage
        target.setHp(target.getHp() - damage);
        System.out.println("It's super effective! " + target.getName() +  " took " + damage + " points of damage!");
    }
}
