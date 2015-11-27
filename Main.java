import TI.*;

public class Main
{
    //private Servo servoLinks = new Servo(15);
    //private Servo servoRechts = new Servo(14);
    //private int totaal;
    private static int totaal;
    private static int speed;
    public Main()
    {

    }

    public static void main(String[] args)
    {
        Aandrijving aandrijving = new Aandrijving();
        Infrared infrared = new Infrared();
        while(true)
        {
            //aandrijving.acceleration(0);
            //aandrijving.decceleration(200);
            int pulseLen = BoeBot.pulseIn(0,false,6000);

            if(pulseLen > 2000)
            {
                totaal = 0;
                for(int i = 0; i < 7; i++)
                {
                    if(BoeBot.pulseIn(0, false, 200000) >= 1000)
                    {
                        System.out.print("1");
                        totaal += Math.pow(2,i);
                    }
                    else
                        System.out.print("0");

                }
                System.out.println("");
                System.out.println(totaal);

                switch(totaal)
                {
                    case 0:
                    aandrijving.turnDegree(-45);
                    aandrijving.forward(50);
                    break;

                    case 1:
                    aandrijving.forward(200);
                    break;

                    case 2:
                    aandrijving.turnDegree(45);
                    aandrijving.forward(50);
                    break;

                    case 3:
                    aandrijving.turnDegree(-90);
                    aandrijving.forward(50);
                    break;

                    case 4:
                    aandrijving.stop();
                    break;

                    case 5:
                    aandrijving.turnDegree(90);
                    aandrijving.forward(50);
                    break;

                    case 6:
                    aandrijving.turnDegree(45);
                    aandrijving.backwards(50);
                    break;

                    case 7:
                    aandrijving.backwards(200);
                    break;

                    case 8:
                    aandrijving.turnDegree(-45);
                    aandrijving.backwards(50);
                    break;

                    case 88:
                    if (speed <= 200)
                    {
                        speed += 10;
                        aandrijving.forward(200);
                    }
                    break;

                    case 89:
                    if (speed >= -200)
                    {
                        speed -= 10;
                        aandrijving.forward(200);
                    }
                    break;

                    default:
                    aandrijving.forward(100);
                    break;

                }
                BoeBot.wait(1);
            }
        }
    }
}
