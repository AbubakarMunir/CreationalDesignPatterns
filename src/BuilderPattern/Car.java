/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuilderPattern;

/**
 *17L-4545
 * Manufcturing a car and mandatory params in car are engine tyres cc bodytype
 * optional params are NOS hood scoops rearAC and DriverAssistanceProgram
 * and that is why builder pattern is used here to accomodate optional params on demand
 */
public class Car {
    //tyres engine cc and bodytype are a must in every car
    private String engine;           //engine will have a separate class in real world scearios which 
                                     //will be passed in buillderconstructor but here its kept as a string to implement the pattern only
    private String Tyres;
    private String cc;
    private String bodyType;
    
    //optional parameters 
    private Boolean NOS;            //nitrous is optional
    private Boolean Hood_Scoop;
    private Boolean Rear_AirConditioner;
    private Boolean DriverAssistanceProgram;
    
    
    private Car(CarBuilder builder)
    {
        engine=builder.engine;
        Tyres=builder.Tyres;
        cc=builder.cc;
        bodyType=builder.bodyType;
        NOS=builder.NOS;
        Hood_Scoop=builder.Hood_Scoop;
        Rear_AirConditioner=builder.Rear_AirConditioner;
        DriverAssistanceProgram=builder.DriverAssistanceProgram;
                
    }
    
    
    public void PrintCarIno()
    {
        System.out.println("Engine: "+engine);
        System.out.println("Tyres: "+Tyres);
        System.out.println("CC: "+cc);
        System.out.println("Body Type: "+bodyType);
        if(NOS!=null)
        {
            System.out.println("NOS present");
        }
        if(Hood_Scoop!=null)
        {
            System.out.println("Hood Scoop present");
        }
        if(Rear_AirConditioner!=null)
        {
            System.out.println("Rear Air conditioner present");
        }
        if(DriverAssistanceProgram!=null)
        {
            System.out.println("DriverAssistanceProgram present");
        }
        
    }
    
    
    //Static inner class car builder which helps in setting params separately and its build function returns car object at th end
    public static class CarBuilder{
            private String engine;           
            private String Tyres;
            private String cc;
            private String bodyType;
            private Boolean NOS;            
            private Boolean Hood_Scoop;
            private Boolean Rear_AirConditioner;
            private Boolean DriverAssistanceProgram;
            
            public CarBuilder(String e,String t,String c,String b)
            {
                engine=e;
                Tyres=t;
                cc=c;
                bodyType=b;
            }
            
            public CarBuilder NOS(Boolean val)
            {
                NOS=val;
                return this;
            }
            
            public CarBuilder HoodScoop(Boolean val)
            {
                Hood_Scoop=val;
                return this;
            }
            
            public CarBuilder RearAirConditioner(Boolean val)
            {
                Rear_AirConditioner=val;
                return this;
            }
            
            public CarBuilder DriverAssistanceProgram(Boolean val)
            {
                DriverAssistanceProgram=val;
                return this;
            }
            
            //Returns car object
            public Car build()
            {
                return new Car(this);
            }
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
