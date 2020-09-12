package com.company;


public class Mazda implements Car
{
    private MazdaModel model;
    private Color color;
    private double engine;

    public Mazda(){
        this.model = null;
        this.color = null;
        this.engine = 0;
    }

    public Mazda(MazdaBuilder item){
        this.model = item.model;
        this.color = item.color;
        this.engine = item.engine;
    }


    public void setModel(MazdaModel model){
        this.model = model;
    }

    public MazdaModel getModel(){
        return model;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public void setEngine(double engine) {
        this.engine = engine;
    }

    @Override
    public double getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "Mazda "+model.toString()+" "+color.toString()+" "+engine;
    }

    public static class MazdaBuilder{
        private MazdaModel model;
        private Color color;
        private double engine;

        public MazdaBuilder (MazdaModel model){
            this.model = model;
        }
        public MazdaBuilder withColor(Color color){
            this.color = color;
            return this;
        }
        public MazdaBuilder withEngine(double engine){
            this.engine = engine;
            return this;
        }

        public Mazda build(){
            return new Mazda(this);
        }

    }
}