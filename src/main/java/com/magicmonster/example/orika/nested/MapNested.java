package com.magicmonster.example.orika.nested;

import ma.glasnost.orika.CustomMapper;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.MappingContext;
import ma.glasnost.orika.impl.DefaultMapperFactory;

public class MapNested {
    public static void main(String[] args) {
        MapperFacade facade = createMapper();

        Plant plant = new Plant();
        plant.setLocation("by the window");
        Chilli chilli = new Chilli();
        chilli.setName("habanero");
        chilli.setScoville(400444);
        plant.setFruit(chilli);

        PlantDTO plantDTO = new PlantDTO();

        facade.map(plant, plantDTO);

        // missing chilli fields
        System.out.println(plantDTO);

        // map again.
        facade.map(plant.getFruit(), plantDTO);
        System.out.println(plantDTO);

    }

    private static MapperFacade createMapper() {
        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();

        mapperFactory.classMap(Chilli.class, PlantDTO.class)
                .byDefault()
                .register();
        mapperFactory.classMap(Plant.class, PlantDTO.class)
//                .field("fruit", ".")
                .byDefault()
                .register();

        MapperFacade mapperFacade = mapperFactory.getMapperFacade();

        return mapperFacade;
    }
}
