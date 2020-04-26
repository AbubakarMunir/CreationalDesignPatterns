/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract_Factory_Pattern;


public class ToyCarsFactory extends AbstractFactory {
    
    @Override
    public ToyCar getToyCars(String cname)        //This method is used to return distinct car objects wrt model of car provided
    {
        if(cname=="Ambulance")
        {
            return new Ambulance();
        }
        
        else if(cname=="BMWZ4")
        {
            return new BMWZ4();
        }
        return null;
    }
    @Override
    public StuffedToy getStuffedToys(String tname)      //bcz this method needed to be implemented as above class is abstract
    {
        return null;
    }
    
}
