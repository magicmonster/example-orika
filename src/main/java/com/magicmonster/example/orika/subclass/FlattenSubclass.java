package com.magicmonster.example.orika.subclass;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

public class FlattenSubclass {
    public static void main(String[] args) {
        MapperFacade facade = createMapper();

        Apple apple = new Apple();
        apple.setVariety("red delicious");
        apple.setColour("red");

        Fruit fruit = apple;


        FruitDTO fruitDTO = new FruitDTO();
        facade.map(fruit, fruitDTO);

        System.out.println(fruitDTO);

    }

    private static MapperFacade createMapper() {
        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();

        mapperFactory.classMap(Apple.class, FruitDTO.class)
                .byDefault()
                .register();

        MapperFacade mapperFacade = mapperFactory.getMapperFacade();

        return mapperFacade;
    }
}
