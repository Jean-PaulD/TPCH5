package Prototype;

/**
 * Created by Jean-Paul D on 2017-04-01.
 */
public class Audi implements CloneObject {

    public String model;

    public Audi(String model){
        this.model = model;
    }

    @Override
    public CloneObject makeCopy() {
        return new Audi(model);
    }

    @Override
    public String toString( ){

        return model;
    }
}
