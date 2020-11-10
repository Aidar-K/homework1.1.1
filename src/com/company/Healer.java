package com.company;

public final class Healer extends AntiMage {
    private int height;
    private Shelter shelter;

    public Healer(int health, int damage, MagicalAttack magicalAttack, int protection, int height, Shelter shelter) {
        super(health, damage, magicalAttack, protection, height, shelter);
        this.height = height;
        this.shelter = shelter;
    }

    private int getHeight() {
        return height;
    }

    public String getInfo() {
        return "Healer = " +
                "\nHeight = " + height +
                "\nMagicalAttack = " + getMagicalAttack() +
                "\nProtection = " + protection() +
                "\nHealth = " + getHealth() +
                "\nHealth = " + getDamage() +
                "\nShelter = " + shelter.getDoubleShot();
    }
}
