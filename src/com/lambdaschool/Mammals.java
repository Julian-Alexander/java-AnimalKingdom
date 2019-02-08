package com.lambdaschool;

public class Mammals extends AbstractAnimal implements Animal
{
    private int num;
    private String name;
    private int year;

    public Mammals(int num, String name, int year, String eat)
    {
        super(eat);
        this.name = name;
        this.num = num;
    }


    public Mammals(int num, String name, int year)
    {
        this.num = num;
        this.name = name;
        this.year = year;
    }

    @Override
    public String getName()
    {
        return name;
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
    public String move()
    {
        return "Walk";
    }

    @Override
    public String breath()
    {
        return "Lungs";
    }

    @Override
    public String reproduce()
    {
        return "Live Birth";
    }

    @Override
    public String toString()
    {
        return "Mammals{" +
                "num='" + num + '\'' +
                ", name='" + name + '\'' +
                ", year='" + year + '\'' +
                ", eat=" + eat +
                '}';
    }
}
