import TI.*;

public abstract class LED
{
    protected PWM red, green, blue;
    //Hoi
	
    /*
     * Corresponding pins need to be given as parameter, first red, than green and finaly blue
     */
    public LED(int redPin, int greenPin, int bluePin)
    {
        red = new PWM(redPin, 0);
        green = new PWM(greenPin, 0);
        blue = new PWM(bluePin, 0);
    }
    
    public abstract void turnOn();
    public abstract void turnOff();
    public void update(){}
    
    
}
