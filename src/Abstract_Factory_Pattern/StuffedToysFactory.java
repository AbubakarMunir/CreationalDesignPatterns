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
public class StuffedToysFactory extends AbstractFactory {
    
        @Override
        public StuffedToy getStuffedToys(String tname)
        {
            if(tname=="WinnieThePooh")
            {
                return new Pooh();
            }

            return null;

        }
        
        public ToyCar getToyCars(String cname)
        {
            return null;
        }


}
