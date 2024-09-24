public class Light implements HomeService{
    
    public void turnOn(){
        System.out.println("The light is on.");
    }
    @Override
    public void turnOff(){
        System.out.println("The light is off.");
    }

}