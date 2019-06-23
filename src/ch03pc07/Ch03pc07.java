package ch03pc07;
import java.util.Scanner;
/**
 *
 * @author FRANK.OLSON
 * date: 11/1/2017
 * purpose: to sort names in ascending order
 */
public class Ch03pc07 {

    public static void main(String[] args) {
        //variables
        int i, j;
        String temp;
        String names[] = new String[3];
        
        //create keyboard input
        Scanner keyboard = new Scanner(System.in);
        
        //Request input
        for(i = 0; i < 3; i++)
        {
            System.out.println("Please enter a name: ");
            names[i] = keyboard.nextLine();
        }
        
        //sort
        for (i = 0; i < 3; i++)
        {
            for (j = 1; j < 3; j++)
            {
                if(names[j-1].compareTo(names[j])>0)
                {
                    temp = names[j-1];
                    names[j-1] = names[j];
                    names[j] = temp;
                }
            }
        }
        
        System.out.println("Names sorted in Alphabetical order:");
        for (i = 0; i < 3; i++)
        {
            System.out.println(names[i]);
        }
    }
    
}
