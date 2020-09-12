package com.company;


public class Kia implements Car
{
    private KiaModel model;
    private Color color;
    private double engine;

    public Kia(){
        this.model = null;
        this.color = null;
        this.engine = 0;
    }

    public Kia(KiaBuilder item){
        this.model = item.model;
        this.color = item.color;
        this.engine = item.engine;
    }


    public void setModel(KiaModel model){
        this.model = model;
    }

    public KiaModel getModel(){
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
        return "Kia "+model.toString()+" "+color.toString()+" "+engine;
    }

    public static class KiaBuilder{
        private KiaModel model;
        private Color color;
        private double engine;

        public KiaBuilder (KiaModel model){
            this.model = model;
        }
        public KiaBuilder withColor(Color color){
            this.color = color;
            return this;
        }
        public KiaBuilder withEngine(double engine){
            this.engine = engine;
            return this;
        }

        public Kia build(){
            return new Kia(this);
        }

    }
}