package Lecture_01;

public class Bird extends Animal {
    String color;

    Bird(int age,double weight,double height,String color){
        super(age,weight,height);
        this.color=color;
    }
    @Override
    public void eat(){
        System.out.println("Insects! ");
    }
    @Override

    public void makeSound(){

        System.out.println("Chirping! ");
    }


}
