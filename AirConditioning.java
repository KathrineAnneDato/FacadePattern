public class AirConditioning implements HomeService{
    
    public void turnOn(){
        System.out.println("The aircondition is on.");
    }
    @Override
    public void turnOff(){
        System.out.println("The aircondition is off.");
    }

}