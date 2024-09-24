public class HomeInterface{
    private HomeService light;
    private HomeService aircon;
    private HomeService tv;

    public HomeInterface(){
        this.light = new Light();
        this.aircon = new AirConditioning();
        this.tv = new TV();
    }

    public void turnOnAll(){
        System.out.println("All appliances are on.");
        light.turnOn();
        aircon.turnOn();
        tv.turnOn();
        System.out.println();
    }

    public void turnOffAll(){
        System.out.println("All appliances are off.");
        light.turnOff();
        aircon.turnOff();
        tv.turnOff();
    }
}