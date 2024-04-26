package org.example;

public class Bulbasaur extends Pokemon{

    public Bulbasaur (String name, int number, int hp){
        super(name, number, hp);
    }

    @Override
    public void attack(Pokemon target){
        System.out.println(getName() + " use Vine Whip!");
        int damage = 10;//Simulate Vine Whip damage
        target.setHp(target.getHp() - damage);
        System.out.println("It's super effective! " + target.getName() +  " took " + damage + " points of damage!");
    }
}
