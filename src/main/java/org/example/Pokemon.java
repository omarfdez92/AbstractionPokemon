package org.example;

public abstract class Pokemon {
    private String name;
    private int number;
    private int hp;

    public Pokemon(String name, int number, int hp){
        this.name = name;
        this.number = number;
        this.hp = hp;
    }

    public String getName(){
        return name;
    }

    public int getNumber(){
        return number;
    }

    public int getHp(){
        return hp;
    }
    public void setHp(int hp){
        this.hp = hp;
    }

    //Abstract method no implementation here
    public abstract void attack(Pokemon target);
}
