package Lecture_01;

public abstract class Animal {
    int age;
    double weight;
    double height;

    Animal(int age,double weight,double height){
        this.age=age;
        this.weight=weight;
        this.height=height;
    }
    public abstract void eat();
    public abstract  void makeSound();

}
