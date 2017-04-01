package adapter;

/**
 * Created by Jean-Paul D on 2017-04-01.
 */
public class ScrewClassAdapter extends Screw implements ScrewAdapter {


    @Override
    public ScrewDriver getPhillips() {
        return getScrewDriver();
    }

    @Override
    public ScrewDriver getFlat() {
        ScrewDriver s = getScrewDriver() ;
        return null;
    }

    private ScrewDriver convertScrewDriver(ScrewDriver s, String adapt){
        adapt = "adapted";
        return new ScrewDriver(s.getType()+" "+adapt);
    }

}
