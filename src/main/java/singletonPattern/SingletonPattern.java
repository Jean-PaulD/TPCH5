package singletonPattern;

/**
 * Created by Jean-Paul D on 2017-04-01.
 */
public class SingletonPattern {


    private static SingletonPattern userSingleton = null;

    private SingletonPattern(){}

    public static SingletonPattern getInstance(){
        if(userSingleton == null)
            userSingleton = new SingletonPattern();
        return userSingleton;
    }

    public String userNameSurname(String name, String surname){
        return name + " " + surname;
    }

    public double salaryAfterTax(double salary, double taxRate){
        double tax = taxRate / 100;
        double taxAmount = salary * tax;
        return salary - taxAmount;
    }
}
