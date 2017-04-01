package abstractFactory;

/**
 * Created by Jean-Paul D on 2017-04-01.
 */
public class PreFaceLift implements CarEngine {

    public PreFaceLift(){}
    public String getEngineName() {
        return "V6";
    }
}
