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
public class Ambulance extends ToyCar{
    @Override
    public String getCarModel()         //this a toycar product
    {
        return "Ambulance";
    }
}
