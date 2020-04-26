/*
These methods are implemented by ToyCarFactory and StuffedToysFactory respectively
 */
package Abstract_Factory_Pattern;



public abstract class AbstractFactory {
    public abstract ToyCar getToyCars(String n);
    public abstract StuffedToy getStuffedToys(String n);
}
