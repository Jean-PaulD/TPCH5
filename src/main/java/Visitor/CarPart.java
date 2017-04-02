package Visitor;

/**
 * Created by Jean-Paul D on 2017-04-02.
 */
public interface CarPart {

    public void accept(CarPartVisitor carPartVisitor);
}
