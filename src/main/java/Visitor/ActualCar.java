package Visitor;

/**
 * Created by Jean-Paul D on 2017-04-02.
 */
public class ActualCar implements CarPart {


    CarPart[] parts;

    public ActualCar() {

        parts = new CarPart[]{new Engine()};
    }


    @Override
    public void accept(CarPartVisitor carPartVisitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(carPartVisitor);
        }
        //  carPartVisitor.visit(this);
        }


    public String engine() {
        return "engine";
    }


}
