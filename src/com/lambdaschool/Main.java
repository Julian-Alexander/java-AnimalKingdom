package com.lambdaschool;

import java.util.ArrayList;
import java.util.Collections;

public class Main
{
    public static void printAnimals(ArrayList<AbstractAnimal> animals, CheckAnimal tester)
    {
        for(AbstractAnimal v: animals)
        {
            if(tester.test(v))
            {
                System.out.println(v.getName());
            }
        }
    }

    public static void main(String[] args)
    {
        // Mammals
        ArrayList<AbstractAnimal> myList = new ArrayList<AbstractAnimal>();
        myList.add(new Mammals(1,"Panda", 1869));
        myList.add(new Mammals(2,"Zebra", 1778));
        myList.add(new Mammals(3,"Koala", 1816));
        myList.add(new Mammals(4,"Sloth", 1804));
        myList.add(new Mammals(5,"Armadillo", 1758));
        myList.add(new Mammals(6,"Raccoon", 1758));
        myList.add(new Mammals(7,"BigFoot", 2021));
        // Birds
        myList.add(new Birds(8,"Pigeon", 1837));
        myList.add(new Birds(9,"Peacock", 1821));
        myList.add(new Birds(10,"Toucan", 1758));
        myList.add(new Birds(11,"Parrot", 1824));
        myList.add(new Birds(12,"Swan", 1758));
        // Fish
        myList.add(new Fish(13,"Salmon", 1758));
        myList.add(new Fish(14,"Catfish", 1817));
        myList.add(new Fish(15,"Perch", 1758));

        // Lambda expressions
        System.out.println("\n***Animals in descending order by year***");
        myList.sort((v1, v2) -> (v2.getYear() - v1.getYear()));
        myList.forEach((v) -> System.out.println(v.getNum()+ ") " + v.getName() + "(" + v.getYear() + ") "));

        System.out.println("\n***Animals in alphabetical order***");
        myList.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
        myList.forEach((v) -> System.out.println(v.getNum()+ ") " + v.getName() + "(" + v.getYear() + ") "));

        System.out.println("\n***Animals ordered by how they move***");
        myList.sort((v1, v2) -> v2.move().compareToIgnoreCase(v1.move()));
        myList.forEach((v -> System.out.println(v.getName() + " - " + v.move())));
        //printAnimals(myList, v -> v.move().equals("Walk"));
        //printAnimals(myList, v -> v.move().equals("Swim"));
        //printAnimals(myList, v -> v.move().equals("Flight"));

        System.out.println("\n***Animals that breath with lungs***");
        printAnimals(myList, v -> v.breath().equals("Lungs"));

        System.out.println("\n***Animals that breath with lungs discovered in 1758***");
        printAnimals(myList, v -> v.breath().equals("Lungs") && v.getYear() == 1758);

        System.out.println("\n***Animals that breath with lungs and lay eggs***");
        printAnimals(myList, v -> v.breath().equals("Lungs") && v.reproduce().equals("Eggs"));

        System.out.println("\n***Animals that were discovered in 1758 alphabetically***");
        myList.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
        printAnimals(myList, v -> v.getYear() == 1758);

    }




}
