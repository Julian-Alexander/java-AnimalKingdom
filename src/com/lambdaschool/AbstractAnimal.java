package com.lambdaschool;

public abstract class AbstractAnimal
{
    String eat;

    public AbstractAnimal(String eat)
    {
        this.eat = eat;
    }

    public AbstractAnimal()
    {
       eat = "Common";
    }

    public abstract String getName();
    public abstract String move();
    public abstract String breath();
    public abstract String reproduce();
    public abstract int getNum();
    public abstract int getYear();
}
