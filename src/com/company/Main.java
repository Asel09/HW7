package com.company;

public class Main {

    public static void main(String[] args) {
        Medic medic = new Medic(19, 77,"vostonovleniya zdoroviya");
        Magic magic = new Magic(19, 77,"invisible");
        Warrior warrior = new Warrior(19, 77,"CRITICAL DAMAGE");
        Hero[] heroes = new Hero[]{magic, medic, warrior};

        for (Hero i:heroes) {

        }



    }
}
