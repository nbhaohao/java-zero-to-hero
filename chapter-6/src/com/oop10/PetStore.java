package com.oop10;

public class PetStore {

    public static Animal getAnimal(String petName) {
        Animal animal = null;
        if ("猫".equals(petName)) {
            animal = new Cat();
        } else if ("狗".equals(petName)) {
            animal = new Dog();
        }
        return animal;
    }
}
