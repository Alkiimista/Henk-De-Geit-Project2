------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE:
PURPOSE OF PROJECT:
VERSION or DATE:
HOW TO START THIS PROJECT:
AUTHORS:
USER INSTRUCTIONS:

int pulseLen = BoeBot.pulseIn(0 , false, 20000);
        if(pulseLen > 2000)
        {
            ArrayList<Integer> lengtes = new ArrayList<Integer>();

            for(int i = 0; i < 12; i++)
            {
                lengtes.add(BoeBot.pulseIn(0, false, 20000));
            }
            Collections.reverse(lengtes);

            int fullNumber = 0;
            for(int i = 0; i < 12; i++)
            {   
                if(lengtes.get(i) < 1000)
                {
                    fullNumber = fullNumber << 1;
                }
                else
                {
                    fullNumber = fullNumber | 1;
                    fullNumber = fullNumber << 1;
                }
            }
            fullNumber = fullNumber >> 1;

            int deviceCode = fullNumber >> 7;
            int programCode = fullNumber & 127;

            System.out.println("\nBinary fullNumber: " + Integer.toBinaryString(fullNumber));
            if(programCode == links)
            {
                System.out.println("Links is ingedrukt");
                turnLeft();
            }
            else if(programCode == rechts)
            {
                System.out.println("Rechts is ingedrukt");
                turnRight();
            }
            else if(programCode == onder)
            {
                System.out.println("Boven is ingedrukt");
                driveBackward();
            }
            else if (programCode == boven)
            {
                System.out.println("Onder is ingedrukt");
                driveForward();
            }
            else if(programCode == aanUit)
            {
                System.out.println("Aan, uit is ingedrukt");
                stop();
            }
            else if(programCode == muteRandom)
            {
                random();
            }
        }
        BoeBot.wait(1);
    }
