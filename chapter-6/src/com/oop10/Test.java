package com.oop10;

public class Test {
    public static void main(String[] args) {
        Girl girl = new Girl();
        girl.play(PetStore.getAnimal("猫"));
        girl.play(PetStore.getAnimal("狗"));
    }
}
