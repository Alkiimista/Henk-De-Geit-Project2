import TI.*;

public class Main
{
    private static Servo servoLinks = new Servo(15);
    private static Servo servoRechts = new Servo(14);
    //private int totaal;
    public Main()
    {

    }

    public static void main(String[] args)
    {
        Aandrijving aandrijving = new Aandrijving();

        while(true)
        {
            //aandrijving.forward(200);
            //aandrijving.acceleration(0);
            //servoLinks.update(1700);
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
            switch(totaal)
            {
                case 0:
                aandrijving.stop();
                break;
                
                case 4:
                int i = 0;
                aandrijving.acceleration(i);
                i += 10;
                break;

                default:
                aandrijving.forward(100);
                break;
                
            }
            BoeBot.wait(1);
        }

    }
}
