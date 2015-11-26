import TI.*;

public class Motor
{
    private Servo servoLeftMotor = new Servo(15);
    private Servo servoRightMotor = new Servo(14);
    
    
    public Motor()
    {
    
    }
    
    public void turnLeft(int speed)
    {
        servoLeftMotor.update(1500 + speed);
        BoeBot.wait(1);
    }
    
    public void  turnRight(int speed)
    {
        servoRightMotor.update(1500 - speed);
        BoeBot.wait(1);
    }
    
    public void stop()
    {
        servoLeftMotor.update(1500);
        servoRightMotor.update(1500);
    }
}
