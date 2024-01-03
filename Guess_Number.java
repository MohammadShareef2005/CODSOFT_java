import java .util.*;
public class Guess_Number{
    static void levels(int min,int max)
    {
        Scanner s=new Scanner(System.in);
        Random r= new Random();
        int correct_guess=0;
        int chances;
        int cha_left;
        int rounds=0;
        int gnum;
        int random;
        while(true){
            System.out.println("---------ROund 1---------");
            chances=1;
            while(true)
            {
                
                System.out.println("guess number between "+min+" and "+max+". Chance Number "+chances);
                cha_left =10-chances;
                gnum=s.nextInt();
                random=r.nextInt(max)+1;
                if(gnum > random){
                System.out.println("too heigh ");}
                else if(gnum < random){
                System.out.println("too low");}
                else{
                System.out.println("Correct guess");
                correct_guess++;
                }
                System.out.println("Chance Left = "+ cha_left);
                chances++;
                if(chances>10){break;}
            }

        if(correct_guess>=2)
        {
            System.out.println("Congratulations you have entered Round 2 ");
            System.out.println("-----ROund 2-----");
            rounds++;
            correct_guess=0;
            chances=0;
            while(true)
            {
                
                while(true)
                {
                    System.out.println("guess number between "+min+" and "+max+". Chance Number "+(chances+1));
                    cha_left =10-chances;
                    gnum=s.nextInt();
                    random=r.nextInt(max)+1;
                    if(gnum > random){
                    System.out.println("too heigh ");}
                    else if(gnum < random){
                    System.out.println("too low");}
                    else{
                    System.out.println("Correct guess");
                    correct_guess++;}
                    System.out.println("Chance Left = "+ cha_left);
                    chances++;
                    if(chances>=10){break;}
                }
                    if(correct_guess>=6)
                    {
                        System.out.println("Congratulations you have entered Round 3 ");
                        System.out.println("---------ROund 3---------");
                        rounds++;
                        correct_guess=0;
                        chances=1;
                        while(true)
                        {
                            System.out.println("Guess the number between "+min+" and "+max+". Chance Number "+(chances+1));
                             cha_left =10-chances;
                            gnum=s.nextInt();
                            random=r.nextInt(max)+1;
                            if(gnum > random){
                            System.out.println("too heigh ");}
                            else if(gnum < random){
                            System.out.println("too low");}
                            else{
                            System.out.println("Correct guess");
                            correct_guess++;}
                            System.out.println("Chance Left = "+ cha_left);
                            chances++;
                            if(chances>10)
                            {
                                if(correct_guess==6){rounds++;}
                                break;}
                        }
                    }
                   
            if(true)
              {break;}       
            }  

        }
        System.out.println("Do you want to continue the game yes or no");
        String str = s.next();

        if (str.equals("yes")) {
            
        } else {
            break; 
        }
   
    
}if(rounds==3)
{
    System.out.println("Congratulations, your score is 100.");
    System.out.println("Number Of Rounds Completed: "+rounds);
    System.out.println("Thank you for playing ");
}
else if(rounds== 2)
{
    System.out.println("Congratulations, your score is 75.");
    System.out.println("Number of Rounds completed: "+rounds);
    System.out.println("Thank you for playing ");

}
else if(rounds==1)
{
    System.out.println("Congratulations, your score is 50.");
    System.out.println("Number of Rounds completed: "+rounds);
    System.out.println("Thank you for playing ");
}
else
{
    System.out.println("Better Luck Next Time");
    System.out.println("Number of Rounds completed: "+rounds);
    System.out.println("Thank you for playing ");

}

s.close();
    }




    public static void main(String[]args)
    {
        int level;
        Scanner sc=new Scanner(System.in);
        System.out.println("-----------NUMBER GAME-----------");
        System.out.println("Game Information");
        System.out.println("Here the player will have 10 chance of guessing for each round.");
        System.out.println("Total 3 Round");
        System.out.println("To win Round 1, Two guesses have to be corrected");
        System.out.println("To win Round 2, FOur guesses have to be corrected");
        System.out.println("To win Round 3, Six guesses have to be corrected");
      
        System.out.println("Choose the level");
        System.out.println("Easy         1");  
        System.out.println("Medium       2"); 
        System.out.println("hard         3");
        level=sc.nextInt();

        switch (level) {
            case 1:
            levels(1,5);
                break;
            case 2:
            levels(1,10);
                break;
            case 3:
            levels(1,20);
                break; 
            default:
            System.out.println("Choose the correct level");
                break;
        } 

        
       
        
sc.close();
    }
}