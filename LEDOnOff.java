import TI.*;

public class LEDOnOff extends LED
{
    public LEDOnOff(int redPin, int greenPin, int bluePin)
    {
        super(redPin, greenPin, bluePin);
    }

    public void turnOn()
    {
        red.update(5);
        blue.update(5);
        green.update(5);
    }

    public void turnOff()
    {
        red.update(255);
        blue.update(255);
        green.update(255);
    }
}
