import java.util.Scanner;

public class Uppgift_6
{
    public static void main (String[] args)
    {
        int positivaTal = 0;
        int negativaTal = 0;
        int antalNollTal = 0;
        int indata[][] = new int[2][3];
        for (int row = 0; row < indata.length; row++)
        {
            for (int col = 0; col < indata[row].length; col++)
            {
            Scanner scan = new Scanner(System.in);
            System.out.println("Mata in ett tal");
            indata[row][col] = scan.nextInt();
            System.out.printf("%4d", + indata[row][col]);
            if (indata[row][col] >= 1)
            {
                positivaTal += 1;
            }
            if (indata[row][col] < 0)
            {
                negativaTal += 1;
            }
            if (indata[row][col] == 0)
            {
                antalNollTal += 1;
            }
            System.out.printf("\n" + "Antal positiva tal: " + positivaTal + "\n" + "Antal negativa tal: " + negativaTal + "\n" + "Antal förekomster av 0: " + antalNollTal + "\n");
            }
            System.out.println();
        }
    }
}
