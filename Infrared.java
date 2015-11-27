import TI.*;

public class Infrared
{
    private int totaal;
    public Infrared()
    {
            /*int pulseLen = BoeBot.pulseIn(15,false,6000);
            totaal = 0;
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
            }*/
    }
    
    public int getTotaal()
    {
        return totaal;
    }

}
