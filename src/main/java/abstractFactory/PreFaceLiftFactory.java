package abstractFactory;

/**
 * Created by Jean-Paul D on 2017-04-01.
 */
public class PreFaceLiftFactory implements  CarEngineFactory{

    @Override
    public CarEngine getEngineName(String engineCode) {
        if (engineCode == "V6") return new PreFaceLift();
        else return new PostFaceLift();
    }
}
