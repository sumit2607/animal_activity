package com.example.animal_activity;

public class Animal {


    private String name;
    private String sound;
    private int image;

    public Animal(String name, String sound, int image) {
        this.name = name;
        this.sound = sound;
        this.image = image;
    }


    public String getName() {
        return name;
    }

    public String getSound() {
        return sound;
    }

    public int getImage() {
        return image;
    }
}
