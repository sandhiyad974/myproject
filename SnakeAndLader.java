package newTEam;
import java.io.*; 

public class SnakesAndLadders{  
	public static void main (String [] args) throws IOException{        
        BufferedReader input1 = new BufferedReader (new InputStreamReader (System.in));
        int count= 100;
        int iteration=-1;         
        while (count > 0){
            if (count%10 == 0 && count != 100){
                if(iteration==-1)
                {
                    count-=9;
                    iteration=1;
                }
                else
                {
                    System.out.print(count+"\t");
                    count-=10;
                    iteration=-1;
                }
                if(count!=0)
                System.out.print("\n" + count + "\t"); 
            }
            else
            System.out.print(count + "\t"); 
            count+=iteration;
        }
        System.out.println();       
        String startgame = "y";       
        System.out.print ("Do you want to play? Y or N : ");
        startgame = input1.readLine ();
        while (startgame.equals ("y") || startgame.equals ("Y"))
        {
            startgame = startGame(startgame);
        }
        System.out.println ("Please Enter the correct input");
        System.out.println("See you again! Bye!!!!!");
    } 
    public static String startGame (String start) throws IOException{        
        BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
        int userPosition = 1;
        int compPosition = 1;
        int dice1 = 0;
        int dice2 = 0;
        int user = 1;
        int computer = 1;
        String play = "y";
        int snakesLaddersArray [] = new int [6]; 
        snakesLaddersArray [0] = 54;
        snakesLaddersArray [1] = 90;
        snakesLaddersArray [2] = 99;
        snakesLaddersArray [3] = 9;
        snakesLaddersArray [4] = 40;
        snakesLaddersArray [5] = 67;
        while (play.equals ("y") || play.equals ("Y")){           
            user =  getDice(dice1, dice2); 
            computer=  getDice(dice1, dice2); 
            System.out.println ("You Rolled a " + user ); 
            System.out.println ("Computer Rolled a " + computer);            
            userPosition = userPosition + user;            
            compPosition = compPosition + computer;          
            userPosition = getP(userPosition, user, snakesLaddersArray);           
            compPosition = compgetP(compPosition, computer, snakesLaddersArray, userPosition);            
            System.out.println ("You : " + userPosition);
            System.out.println ("The Computer : " + compPosition);           
                System.out.print ("Do you want to play? Y or N : ");
                play = input.readLine ();        
        }        
        return play;
    }

    public static int getP (int userPosition, int user, int snakesLaddersArray []) throws IOException{
        if(userPosition == snakesLaddersArray[0]){
            userPosition = 19;          
        }
        else if (userPosition == snakesLaddersArray[1]){
            userPosition = 48;            
        }
        else if (userPosition == snakesLaddersArray[2]){
            userPosition = 77;
        }
        else if (userPosition == snakesLaddersArray[3]){
            userPosition = 34;            
        }
        else if (userPosition == snakesLaddersArray[4]){
            userPosition = 64;            
        }
        else if (userPosition == snakesLaddersArray[5]){           
            userPosition = 86; 
        }
        else if (userPosition > 100){
            userPosition = userPosition - user;            
        }
        else if (userPosition == 100){
            System.out.println ("YOU WON, GOOD JOB!!!"); 
        }       
        return userPosition; 
    } 
    
    public static int compgetP (int compPosition, int computer, int snakesLaddersArray [], int userPosition) throws IOException{
        if(compPosition == snakesLaddersArray[0]){
            compPosition = 19;           
        }
        else if (compPosition == snakesLaddersArray[1]){
            compPosition = 48;
        }
        else if (compPosition == snakesLaddersArray[2]){
            compPosition = 77;
        }
        else if (compPosition == snakesLaddersArray[3]){
            compPosition = 34;
        }
        else if (compPosition == snakesLaddersArray[4]){
            compPosition = 64;           
        }
        else if (compPosition == snakesLaddersArray[5]){
            compPosition = 86;
        }        
        else if (compPosition > 100){
            compPosition = compPosition - computer;           
        }
        else if (compPosition == 100 && userPosition != 100){
            System.out.println ("YOU FAILED!!!");
        }
        return compPosition; 
    }
    
    public static int getDice (int dice1, int dice2){
        dice1 = (int)(Math.random()*6 )+1 ;
        dice2 = (int)(Math.random()*6 )+1 ;
        int move = dice1 + dice2; 
        return move; 
    }
   
    
}