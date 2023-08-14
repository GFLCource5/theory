package com.gmail.yukotsiuba.factory;

import com.gmail.yukotsiuba.abstractfactory.JavaFactory;
import com.gmail.yukotsiuba.abstractfactory.PythonFactory;

public class Domain {

    public static void main(String[] args) {
        AnimalFactory factory = createFactory(Animals.CAT.getKind());
        Animal cat = factory.createAnimal();
        cat.say();
    }

    private static AnimalFactory createFactory(String animal) {
        switch (animal) {
            case "cat":
                return new CatFactory();
            case  "dog":
                return new DogFactory();
            default:
                throw new UnsupportedOperationException("No such animal " + animal);
        }
    }
}
