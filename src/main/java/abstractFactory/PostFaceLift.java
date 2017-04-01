package abstractFactory;

/**
 * Created by Jean-Paul D on 2017-04-01.
 */
public class PostFaceLift implements CarEngine{

    public PostFaceLift(){}

    public String getEngineName() {
        return "V6 turbo";
    }
}
