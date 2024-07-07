package Lecture_01;

public abstract class Lion extends Animal{
    String forest;

    Lion(int age,double weight,double height,String forest){
        super(age, weight, height);
        this.forest=forest;
    }

    public void eat(){

        System.out.println("Raw meat! ");
    }


    public void makeSoud(){

        System.out.println("ROARRR!!!!");
    }

}
