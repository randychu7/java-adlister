package models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Fighter implements Serializable {
    private int id;
    private String name;
    private int maxDamage;
    private int hitPoints;
    private ArrayList<Weapons> weapons;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public ArrayList<Weapons> getWeapons() {
        return weapons;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMaxDamage(int maxDamage) {
        this.maxDamage = maxDamage;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setWeapons(ArrayList<Weapons> weapons) {
        this.weapons = weapons;
    }

    public Fighter() {

    }

    public Fighter(String name, int maxDamage, int hitPoints, ArrayList<Weapons> weapons) {
        this.name = name;
        this.maxDamage = maxDamage;
        this.hitPoints = hitPoints;
        this.weapons = weapons;
    }
}