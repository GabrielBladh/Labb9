public class Uppgift_2
{
    public static void main (String[] args)
    {
        int[] nummer = {19, 42, 56, 78, 13, 45, 57, 34, 78, 2};
        int MinstVärde = 0;
        int PosArray = 0;
        for (int i = 0; i < nummer.length; i++ )
        {
            if(i == 0)
            {
                PosArray = i;
                MinstVärde = nummer[i];
                System.out.println(MinstVärde + " " + PosArray);
            }
            else if (nummer[i] < MinstVärde)
            {
                PosArray = i;
                MinstVärde = nummer[i];
                System.out.println(MinstVärde + " " + PosArray);
            }
        }
        System.out.println("Final " + MinstVärde + " " + PosArray );
    }
}
