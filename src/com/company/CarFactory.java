package com.company;

public class CarFactory
{
    public static Car buildCar(String type, Enum model, Color color, double engine)
    {
        Kia kia;
        Mazda mazda;
        if ("KIA".equals(type)) {
            return new Kia.KiaBuilder((KiaModel) model)
                    .withColor(color)
                    .withEngine(engine)
                    .build();
        } else if ("MAZDA".equals(type)) {
            return new Mazda.MazdaBuilder((MazdaModel) model)
                .withColor(color)
                .withEngine(engine)
                .build();
        }
        return null;
    }
}
