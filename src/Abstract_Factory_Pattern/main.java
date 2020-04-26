/*
In this Abstratc Factory Pattern we have two factories ToyCarFactory and StuffedToysFactory
Both factories extend AbstractFactory
*/



package Abstract_Factory_Pattern;

public class main {
    public static void main(String[] args) {
        AbstractFactory abstractfactory= FactoryCreator.getFactory("ToyCars");
        if( abstractfactory!=null)
        {
           System.out.println(abstractfactory.getToyCars("BMWZ4").getCarModel());
        }
        
        AbstractFactory abstractfactory2= FactoryCreator.getFactory("StuffedToys");
        if( abstractfactory2!=null)
        {
           System.out.println(abstractfactory2.getStuffedToys("WinnieThePooh").getToyName());
        }
    }
    
    
}

//PURPOSE OF USING ABSTRACT FACTORY PATTERN HERE
/*We have two different types of factories here ie Stuffedtoyfactory and toyCarFactory so abstract factory pattern is used 
to give the factory through FactoryCreator of which the product is required. Then that specific factory has its own specific
function to create its product eg getToyCar() or getStuffedToy and in real world scenarios these can be more complex so this 
pattern is needed
*/