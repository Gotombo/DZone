package com.company;

public class Animal {
    private int age=2;
    private color_enum color=color_enum.BLACK;



    public int getAge() {
        return age;
    }

    public color_enum getColor() {
        return color;
    }
    public String getInfo(){
        return"Age: "+getAge()+"\nColor: "+ color;
    }

}

