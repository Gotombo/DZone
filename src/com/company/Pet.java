package com.company;

public class Pet extends Animal{
    private String breed;

    public Pet(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public String getInfo() {
        System.out.println(getBreed());
        return super.getInfo();
    }
   public void Pet_num(int number1, int number2) { }
  public final   void Pet_final(int number1) { }
}

