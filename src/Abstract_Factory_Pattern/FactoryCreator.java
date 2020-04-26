/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract_Factory_Pattern;

/**
 *
 * @author hp
 */
public class FactoryCreator {
    public static AbstractFactory getFactory(String fname)
    {
        if(fname=="ToyCars")
        {
            return new ToyCarsFactory();
        }
        else if( fname=="StuffedToys")
        {
            return new StuffedToysFactory();
        }
        return null;
    }
    
}
