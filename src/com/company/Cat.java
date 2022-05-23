package com.company;

public class Cat extends Animal implements Movable {
    private int age;

    public Cat() {
    }

    public Cat(String name, int age) {
        super(name);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    void eat() {
        System.out.println("Cat eats mouses");
    }

    @Override
    public void move() {
        System.out.println("Cat can move faster then domestic animals");
    }

    @Override
    public String toString() {
        return super.toString() +
                " age=" + age;
    }
}
