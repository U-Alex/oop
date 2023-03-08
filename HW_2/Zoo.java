package HW_2;

import java.util.Map;
import java.util.TreeMap;

import HW_2.Animals.*;;

public class Zoo {
    private TreeMap<Integer, Animal> tmap;// = new TreeMap<>(Collections.reverseOrder());

    public Zoo() {
        tmap = new TreeMap<>();
        //чтото внесли
        tmap.put(1, new Cat(1., 2., "red", "Васька", "свинкс", false, "red", "11.11.2000", true));
        tmap.put(2, new Tiger(2., 3., "green", "лес", "11.12.2020"));
        tmap.put(3, new Dog(10., 2., "red", "Тузик", "такса", false, "red", "11.11.2000", false));
        tmap.put(4, new Wolf(20., 3., "green", "лес", "11.12.2020", true));
        tmap.put(5, new Chicken(25., 3., "black", 1.));
        tmap.put(6, new Stork(2., 3., "black", 100.));
    }

    //public void addAnimal(Animal ob) {
    //    tmap.put(ob.getId(), ob);
    //}
        // проверять валидность введенных данных не стал,т.к. предполагается, 
        // что они уже должны прийти валидные откуданибудь с формы, итд.
    public void addAnimal(int num, String[] p) {
        Animal ob = null;
        if (num == 1)
            ob = new Cat(Double.parseDouble(p[0]), Double.parseDouble(p[1]), p[2], p[3], p[4],
                                         (p[5].equals("да")) ? true : false, p[6], p[7],
                                         (p[8].equals("да")) ? true : false);
        if (num == 2)
            ob = new Tiger(Double.parseDouble(p[0]), Double.parseDouble(p[1]), p[2], p[3], p[4]);
        if (num == 3)
            ob = new Dog(Double.parseDouble(p[0]), Double.parseDouble(p[1]), p[2], p[3], p[4],
                                         (p[5].equals("да")) ? true : false, p[6], p[7],
                                         (p[8].equals("да")) ? true : false);
        if (num == 4)
            ob = new Wolf(Double.parseDouble(p[0]), Double.parseDouble(p[1]), p[2], p[3], p[4],
                                         (p[5].equals("да")) ? true : false);
        if (num == 5)
            ob = new Chicken(Double.parseDouble(p[0]), Double.parseDouble(p[1]), p[2], Double.parseDouble(p[3]));
        if (num == 6)
            ob = new Stork(Double.parseDouble(p[0]), Double.parseDouble(p[1]), p[2], Double.parseDouble(p[3]));

        tmap.put(ob.getId(), ob);
    }

    public void delAnimal(int id) {
        tmap.remove(id);
    }

    public void infoAnimal(int id) {
        System.out.println(tmap.get(id));
    }

    public void infoAllAnimal() {
        for (Map.Entry<Integer, Animal> item : tmap.entrySet()) {
            Animal temp = item.getValue();
            System.out.printf("%d - %s\n", temp.getId(), temp);
        }
    }

    public void getSoundAnimal(int id) {
        tmap.get(id).makeSound();
    }

    public void getAllSoundAnimal() {
        for (Map.Entry<Integer, Animal> item : tmap.entrySet()) {
            item.getValue().makeSound();
        }
    }

    public void uniqueActions() {
        for (Map.Entry<Integer, Animal> item : tmap.entrySet()) {
            if (item.getValue() instanceof AnimalPet)   ((AnimalPet)(item.getValue())).ShowAffection();
            if (item.getValue() instanceof Dog)         ((Dog)(item.getValue())).Train();
            if (item.getValue() instanceof AnimalBird)  ((AnimalBird)(item.getValue())).Fly();
        }
    }

}
