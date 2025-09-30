public class Uppgift_8
{
    public static void main (String[] args)
    {
        int MaskinArbete[] = {12, 13, 14, 13, 0, 0, 15, 15, 0, 13};
        int index = 0;
        int NyMaskinArbete[] = new int[10];
        for (int i = 0; i < MaskinArbete.length; i++)
        {
            if (MaskinArbete[i] != 0)
            {
                NyMaskinArbete[index] = MaskinArbete[i];
                System.out.println(NyMaskinArbete[index]);
                index++;
            }
        }
    }
}
