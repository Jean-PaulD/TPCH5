package adapter;

/**
 * Created by Jean-Paul D on 2017-04-01.
 */
public class ScrewObjectAdapter implements ScrewAdapter {

    private Screw screw = new Screw();

    @Override
    public ScrewDriver getPhillips() {
        return screw.getScrewDriver();
    }

    @Override
    public ScrewDriver getFlat() {
        return screw.getScrewDriver();
    }
}
