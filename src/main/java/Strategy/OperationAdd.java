package Strategy;

/**
 * Created by Jean-Paul D on 2017-04-02.
 */
public class OperationAdd implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}