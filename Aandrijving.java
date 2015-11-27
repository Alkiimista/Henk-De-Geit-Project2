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

    public void backwards(int speed)
    {
        motorLeft.turnLeft(-speed);
        motorRight.turnRight(-speed);
        currentSpeed = speed;
    }

    public void stop()
    {
        motorLeft.stop();
        motorRight.stop();
    }

    public void turnDegree(int degrees)
    {
        switch(degrees)
        {
            case 45:
            motorLeft.turnLeft(50);
            motorRight.turnRight(-50);
            BoeBot.wait(200);
            break;

            case 90:
            motorLeft.turnLeft(50);
            motorRight.turnRight(-50);
            BoeBot.wait(375);
            break;

            case 180:
            motorLeft.turnLeft(50);
            motorRight.turnRight(-50);
            BoeBot.wait(1400);
            break;

            case -45:
            motorLeft.turnLeft(-50);
            motorRight.turnRight(50);
            BoeBot.wait(200);
            break;

            case -90:
            motorLeft.turnLeft(-50);
            motorRight.turnRight(50);
            BoeBot.wait(375);
            break;

            case -180:
            motorLeft.turnLeft(-50);
            motorRight.turnRight(50);
            BoeBot.wait(1400);
            break;

            default:
            motorLeft.turnLeft(50);
            motorRight.turnRight(-50);
            BoeBot.wait(2800);
            break;
        }
    }

    public void acceleration(int speed)
    {
        for(currentSpeed = 0; currentSpeed < 200; currentSpeed += 20)
        {
            speed += 20;           //accelleration speed
            motorLeft.turnLeft(speed);
            motorRight.turnRight(speed);
            BoeBot.wait(500);
        }

    }

    public void decceleration(int speed)
    {
        for(currentSpeed = 200; currentSpeed > 0; currentSpeed -= 20)
        {
            speed -= 20;
            motorLeft.turnLeft(speed);
            motorRight.turnRight(speed);
            BoeBot.wait(500);
        }

    }
}
