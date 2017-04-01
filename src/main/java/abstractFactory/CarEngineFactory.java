package abstractFactory;

/**
 * Created by Jean-Paul D on 2017-04-01.
 */
public interface CarEngineFactory {
    public abstract CarEngine  getEngineName(String engineCode);
}
