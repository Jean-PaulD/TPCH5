package adapter;

/**
 * Created by Jean-Paul D on 2017-04-01.
 */
public class Screw {

    public ScrewDriver getScrewDriver(){
        return new ScrewDriver("Phillips");
    }
}
