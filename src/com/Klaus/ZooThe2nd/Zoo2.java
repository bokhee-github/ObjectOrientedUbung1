package com.Klaus.ZooThe2nd;

import java.util.Vector;
import java.util.function.Predicate;

public class Zoo2 {
    private String name;
    private Vector<Cage> cages;
    private Vector<Zookeeper> zookeepers;
    private Veterinarian vet;

    public Zoo2(String name) {
        this.name = name;
        this.cages = new Vector<>();
        this.zookeepers = new Vector<>();
        this.vet = null;
    }

    public void addCage(Cage c){
        cages.add(c);
    }

    public void addZookeeper(Zookeeper z){
        zookeepers.add(z);
    }

    public void addVet (Veterinarian v){
        vet = v;
    }

    public void startWorkday(){
        for (Zookeeper zookeeper :
                zookeepers) {
            zookeeper.startToWork();
        }
    }


    public void printStructure(String prefix){
        System.out.println("Zoo: " + name);
        for (Cage cage :
                cages) {
            cage.printStructure("  " + prefix);
        }
        System.out.println("Pfleger: ");
        for (Zookeeper zookeeper :
                zookeepers) {
            zookeeper.printStructure("  " + prefix);
        }

        System.out.println("Tierarzt: ");
        vet.printStructure("  " + prefix);

    }
}
