public class Uppgift_4
{
    public static void main (String[] args)
    {
        Double[] Temp = {5.6, 5.9, 6.7, 9.0, 10.2, 9.3, 7.5, 7.0, 6.3};
        Double Summa = 0.0;
        Double Medelvärde = 0.0;
        Double Högst = 0.0;
        Double Lägst = 0.0;
        for (int i = 0; i < Temp.length; i++)
        {
            Summa += Temp[i];
            Medelvärde = Summa/(i+1);
            if(i == 0)
            {
                Högst = Temp[i];
                Lägst = Temp[i];
            }
            else if (Temp[i] > Högst)
            {
                Högst = Temp[i];
            }
            else if (Temp[i] < Lägst)
            {
                Lägst = Temp[i];
            }
            System.out.printf("Medelvärdet: " + Medelvärde + "\n" + " Högsta temperatur: " + Högst + "\n" + " Lägsta temperatur: " + Lägst + "\n");
        }
    }
}
