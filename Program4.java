//Youre on your own!
//Jk ask for help if you need it (but also look at previous programs!!)
import java.util.Scanner;
public class Program4{
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        int x = S.nextInt();
        int y = S.nextInt();
        int z = S.nextInt();
        int a = S.nextInt();
        int sum = x + y + z + a;
        double mean = sum/4.0;
        System.out.println("The sum of the four numbers is " + sum);
        System.out.println();
        System.out.println("The average of the four numbers is " + mean);
    }
}


//Paste console output below:
/*
475
821
369
562
The sum of the four numbers is 2227

The average of the four numbers is 556.75
*/
