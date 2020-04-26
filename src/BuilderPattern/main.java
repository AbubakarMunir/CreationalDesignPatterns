/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuilderPattern;

/**
 *
 * @author hp
 */
public class main {
    
    public static void main(String[] args) {
        
    //In S class other than the mandatory params only rear air cond and driverassistance prog is added
    Car SClass=new Car.CarBuilder("chasis123","yokohama","2500","Sedan").DriverAssistanceProgram(true).RearAirConditioner(true).build();
    SClass.PrintCarIno(); 
    
    //In Ford other than the mandatory params hoood scoops ,rear air cond and driverassistance prog is added
    Car Ford=new Car.CarBuilder("chasis456","BridgeStone","2500","Sedan").DriverAssistanceProgram(true).RearAirConditioner(true).HoodScoop(true).build();
    SClass.PrintCarIno(); 
    System.out.println();
    Ford.PrintCarIno();
    
    
    
      }
}
