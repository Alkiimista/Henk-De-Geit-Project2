import TI.*;
import java.awt.Color;

public class LEDAllColor extends LED
{
    private float hue;
    private Timer t1;
    private boolean activated;
    public LEDAllColor(int redPin, int greenPin, int bluePin)
    {
        super(redPin, greenPin, bluePin);
        hue = 0;
        activated = false;
        t1 = new Timer(100);
    }

    /*
     * If led is turned on this will update the color and shift the hue up by 0.01f
     */
    public void update()
    {
        if(activated)
        {
            if(t1.timeout())
            {
                hue += 0.01f;
                hue = hue % 1.0f;
                updateColor(hue);
            }
        }
    }

    /*
     * Starts the color shifting
     */
    public void turnOn()
    {
        t1.mark();
        activated = true;
        
        hue = 0;
        updateColor(hue);
    }

    /*
     * Parameter: hue, hue element of hsb color to update color
     * This function will update the color of the led with the given hue parameter
     */
    private void updateColor(float hue)
    {
        Color color = Color.getHSBColor(hue, 1, 1);
        red.update(255 - color.getRed());
        blue.update(255 - color.getBlue());
        green.update(255 - color.getGreen());
    }

    /*
     * Stops the color shifting and turns off the led
     */
    public void turnOff()
    {
        red.update(255);
        blue.update(255);
        green.update(255);
        activated = false;
    }
}
