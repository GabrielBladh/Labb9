public class Uppgift_1
{
    public static void main (String[] args)
    {
        int[] nummer = {13, 42, 56, 78, 19, 45, 57, 34, 77, 2};
        int SöktVärde = 57;
        for (int i = 0; i < nummer.length; i++ )
        {
            if (nummer[i] == SöktVärde)
            {
                System.out.printf("Nummer " + nummer[i] + " finns på raden " +i+1);
                break;
            }
        }
    }
}
