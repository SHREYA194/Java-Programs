package javaapplication3;

import java.util.Scanner;
import static javafx.scene.input.KeyCode.T;

public class Tournament {
    
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner in = new Scanner(System.in);
    int T[][]; 
    String choice;
    do {
        System.out.println("\n1.) Build the tournament schedule. ");
        System.out.println("2.) Exit. ");
  
        System.out.print("\nChoose an Option: ");
        choice = in.next();
  
        switch(choice.charAt(0)) {
            case '1': //Case to print out the tournament schedule
                        System.out.print("\nHow many competitors? ");
                        int n = in.nextInt();
                        buildSchedule(n);
                        break;
            case '2': //Exit Code Case
                        System.out.println("\nGoodbye! ");
                        break;
            default:
                        System.out.println("\nInvalid Input! Try Again! ");
        }
    }while(choice.charAt(0) != '2');
    }

    private static void buildSchedule(int n) {
        int T[][] = null;
        if (n == 1) //Base case
                T[0][0] = 1;
        else {
            int players = n;
/*2D array code goes here, 
storing and printing the pattern of numbers up to n based on the test case for n = 8 above and the information that n is a 2's power and 
            each competitor must play exactly once against each possible opponent and must play exactly one match every day. 
            The solution may use a sort or reverse method since the array from day 4 to day 7 is the reversed version of players to day 4.*/
            
            if(n%2==0) {
                int day = n-1;
                for(int i=0; i<day; i++) {
                    for(int j=0; j<players; j++) {
                        
                    }
                }
            }
            
            else {
                int day = n;
                for(int i=0; i<day; i++) {
                    for(int j=0; j<players/2; j++) {
                        if(i==j) {
                            continue;
                        }
                        else {
                            T[i][j] = j+1;
                        }    
                    }
                    for(int k=(players/2+1); k<players; k++) {
                        T[i][j] = j-1;
                    }    
                }
            }
            
}
}
}
    
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.



