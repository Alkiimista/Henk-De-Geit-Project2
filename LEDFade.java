import TI.*;
import java.awt.Color;

public class LEDFade extends LED
{
    private Timer t1;
    private int fadeValue;

    public LEDFade(int redPin, int greenPin, int bluePin)
    {
        super(redPin, greenPin, bluePin);

        t1 = new Timer(15);
        fadeValue = 0;
    }

    public void update()
    {
        if(fadeValue > 0)
        {
            if(t1.timeout())
            {
                updateColor();
                fadeValue--;
            }
        }
        else
        {
            fadeValue = 0;
        }

    }

    public void turnOn()
    {
        if(fadeValue == 0)
        {
            t1.mark();
            fadeValue = 250;
            updateColor();
        }
    }

    public void turnOff()
    {
        red.update(255);
        blue.update(255);
        green.update(255);
        fadeValue = 0;
    }

    private void updateColor()
    {
        red.update(255 - fadeValue);
        green.update(255 - fadeValue);
        blue.update(255 - fadeValue);
    }
}
