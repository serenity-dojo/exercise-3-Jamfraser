package com.serenitydojo;

public class Dog {

    private String name;
    private String favoriteToy;
    private int age;
    private boolean isFed;
    
    public static final String DOG_NOISE = "Woof";

    public Dog(String name, String favoriteToy, int i)
    {
        this.name = name;
        this.favoriteToy = favoriteToy;
        this.age = i;
        this.isFed = false;
    }

    public String makeNoise()
    {
        System.out.println(DOG_NOISE);
        return DOG_NOISE;
    }

    public void feed()
    {
        isFed = true;
    }

    public String getName() { return name;}

    public void setName(String name) {this.name = name;}

    public String getFavoriteToy() {return favoriteToy;}

    public void setFavoriteToy() {this.favoriteToy = favoriteToy;}

    public int getAge() {return age;}

    public void setAge(int age) {this.age = age;}

    public boolean getFedStatus() {return isFed;}
}
