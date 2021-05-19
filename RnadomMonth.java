/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Welcome;

/**
 *
 * @author shreya
 */
public class RnadomMonth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = (int)(1+Math.random()*13);
        switch(n)
        {
            case 1:System.out.print("January");
                   break;
            case 2:System.out.print("February");
                   break;
            case 3:System.out.print("March");
                   break;
            case 4:System.out.print("April");
                   break;
            case 5:System.out.print("May");
                   break;
            case 6:System.out.print("June");
                   break;
            case 7:System.out.print("July");
                   break;
            case 8:System.out.print("August");
                   break;
            case 9:System.out.print("September");
                   break;
            case 10:System.out.print("October");
                   break;
            case 11:System.out.print("November");
                   break;
            case 12:System.out.print("December");
                   break;
        }
        // TODO code application logic here
    }
    
}
