package com.oop8;

public class Girl {
    String name;
    double weight;
    Mom mom;

    public void work(Boy boy) {
        System.out.println("colleague's name is" + boy.name + "age is" + boy.age);
        boy.buy();
    }

    public Girl(String name, double weight, Mom mom) {
        this.name = name;
        this.weight = weight;
        this.mom = mom;
    }

    public void talk() {
        mom.say();
    }

}
