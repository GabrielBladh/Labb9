import java.util.Scanner;

public class Uppgift_14
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int Spelplan[][] = new int[5][4];
        int SpelPosition = 0;
        int SpelarePosX = 0;
        int SpelarePosY = 0;
        for (int row = 0; row < Spelplan.length; row++)
        {
            for (int col = 0; col < Spelplan[row].length; col++)
            {
            System.out.println("Mata in ett tal mellan 1-3");
            while (true)
            {
                SpelPosition = scan.nextInt();
                if (SpelPosition >= 1 && SpelPosition <= 3)
                {
                    Spelplan[row][col] = SpelPosition;
                    System.out.printf("%4d", + Spelplan[row][col]);
                    break;
                }
                else
                {
                    System.out.println("Du har inte skrivit in ett värde mellan 1-3, försök igen");
                }
            }
            }
            System.out.println();
        }
        while (true)
        {
        System.out.println("Skriv ut vart du vill att din gubbe ska vara i position X, mellan 0-4");
        SpelarePosX = scan.nextInt();
        System.out.println("Skriv ut vart du vill att din gubbe ska vara i position y, mellan 0-3");
        SpelarePosY = scan.nextInt();
        if (SpelarePosX >= 0 && SpelarePosX <= 4 && SpelarePosY >= 0 && SpelarePosY <= 3)
        {
            if (Spelplan[SpelarePosX][SpelarePosY] == 3)
            {
                System.out.println("Du har satt dig på en farlig position, du dog");
                break;
            }
            else if (Spelplan[SpelarePosX+1][SpelarePosY] + Spelplan[SpelarePosX-1][SpelarePosY] + Spelplan[SpelarePosX][SpelarePosY+1] + Spelplan[SpelarePosX][SpelarePosY-1] >= 15)
            {
                System.out.println("Du har satt dig på en farlig position, du dog");
                break;
            }
            else 
            {
                System.out.println("Du har satt dig på en fridfull position, du överlevde!");
                break;
            }
        }
        }
        
    }
}
