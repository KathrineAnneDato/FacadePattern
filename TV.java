public class TV implements HomeService{
    
    public void turnOn(){
        System.out.println("The television is on.");
    }
    @Override
    public void turnOff(){
        System.out.println("The television is off.");
    }

}