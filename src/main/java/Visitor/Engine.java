package Visitor;

/**
 * Created by Jean-Paul D on 2017-04-02.
 */
public class Engine implements CarPart {

    @Override
    public void accept(CarPartVisitor carPartVisitor) {
        carPartVisitor.visit(this);
    }
}
