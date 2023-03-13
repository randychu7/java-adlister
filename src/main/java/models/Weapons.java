package models;

public class Weapons {
    private String name;
    private int damage;
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Weapons(String name, int damage, String type) {
        this.name = name;
        this.damage = damage;
        this.type = type;
    }
}