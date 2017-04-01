package ChainOfResponsibility;

/**
 * Created by Jean-Paul D on 2017-04-01.
 */
public class AClass  implements Merc{

    String subModel;

    public String getSubModel() {
        return subModel;
    }

    public void setSubModel(String subModel) {
        this.subModel = subModel;
    }

    @Override
    public void setModel(String model) {

    }

    @Override
    public String getModel() {
        return "A Class";
    }
}
