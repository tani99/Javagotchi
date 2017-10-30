package main;

/**
 * Created by k1764098 on 30/10/17.
 */
public class Creature {

    int energy,fullness,happiness;
    String name;

    public Creature(String name)
    {
        energy=15;
        fullness=15;
        happiness=15;

        this.name=name;
    }

    public void print(String s)
    {
        System.out.println(s);
    }

    public void eat()
    {
        if(fullness>=12)
        {
          print("Woops"+this.getName()+"is already full!");
        }
        else {
            fullness += 8;
            happiness -=6;
            energy -=4;

            print("Yum!");
        }
        if(fullness>15){fullness=15;}
    }
    public void sleep()
    {
        if(energy>=12)
        {
            print("Woops"+this.getName()+"is not that sleepy!");
        }
        else {
            fullness -=5;
            happiness -=5;
            energy +=8;

            print("Yawn, that was a good nap");

        }
        if(energy>15){energy=15;}


    }
    public void play()
    {

            fullness -= 4;
            happiness +=8;
            energy -=6;

        print("This was so fun! Let's do this again!");

        if(happiness>15){happiness=15;}

    }

    public String getName() {
        return name;
    }

    public String checkStatus(){
        String status = "";

        if(happiness<=0||energy<=0||fullness<=0){
            print(this.getName()+"has died! You're a bad owner");
            System.exit(status:0);
        }

        if (happiness<=6){
            status+="Oh"+this.getName+"is feeling sad!\n";

        }
        if (fullness<=6){
            status+="Hmm"+this.getName+"is super hungry!\n";

        }
        if (energy<=6){
            status+="Woops"+this.getName+"is really tired!\n";

        }



        return status;
    }
}
