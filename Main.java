import TI.*;

public class Main
{
    //private Servo servoLinks = new Servo(15);
    //private Servo servoRechts = new Servo(14);
    //private int totaal;
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
            int pulseLen = BoeBot.pulseIn(15,false,6000);
            int totaal = 0;
            if(pulseLen < 2000)
            {
                for(int i = 0; i < 7; i++)
                {
                    if(BoeBot.pulseIn(15, false, 200000) >= 1000)
                    {
                        totaal += Math.pow(2,i);
                    }

                }
                System.out.println(totaal);
            }
            switch(infrared.getTotaal())
            {
                case 0:
                aandrijving.turnDegree(-45);
                break;

                case 1:
                aandrijving.forward(200);
                break;

                case 2:
                aandrijving.turnDegree(45);
                break;

                case 3:
                aandrijving.turnDegree(-90);
                break;

                case 4:
                aandrijving.stop();
                break;

                case 5:
                aandrijving.turnDegree(90);
                break;

                case 6:
                aandrijving.turnDegree(45);
                break;

                case 7:
                aandrijving.backwards(200);
                break;

                case 8:
                aandrijving.turnDegree(-45);
                break;

                default:
                aandrijving.forward(100);
                break;

            }
            BoeBot.wait(1);
        }
    }
}
