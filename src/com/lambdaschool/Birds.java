package com.lambdaschool;

public class Birds extends AbstractAnimal implements Animal
{
    private int num;
    private String name;
    private int year;


    public Birds(int num, String name, int year, String eat)
    {
        super(eat);
        this.name = name;
        this.num = num;
        this.year = year;
    }

    public Birds(int num, String name, int year)
    {
        this.num = num;
        this.name = name;
        this.year = year;
    }

    @Override
    public int getYear()
    {
        return year;
    }

    @Override
    public int getNum()
    {
        return num;
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public String move()
    {
        return "Flight";
    }

    @Override
    public String breath()
    {
        return "Lungs";
    }

    @Override
    public String reproduce()
    {
        return "Eggs";
    }

    @Override
    public String toString()
    {
        return "Birds{" +
                "num='" + num + '\'' +
                ", name='" + name + '\'' +
                ", year='" + year + '\'' +
                ", eat=" + eat +
                '}';
    }
}
