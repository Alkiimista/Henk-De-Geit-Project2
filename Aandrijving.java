import TI.*;

public class Aandrijving
{
    Motor motorLeft = new Motor();
    Motor motorRight = new Motor();
    private int currentSpeed;
    public Aandrijving()
    {

    }

    public void forward(int speed)
    {
        motorLeft.turnLeft(speed);
        motorRight.turnRight(speed);
        currentSpeed = speed;
    }

    public void stop()
    {
        motorLeft.stop();
        motorRight.stop();
    }

    public void turnDegree(int degrees)
    {

    }

    public void acceleration(int speed)
    {
        for(currentSpeed = 0; currentSpeed < 200; currentSpeed ++)
        {
            speed += 20;           //accelleration speed
            motorLeft.turnLeft(speed);
            motorRight.turnRight(speed);
        }

    }
}
