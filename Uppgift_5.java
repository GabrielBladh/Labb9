public class Uppgift_5
{
    public static void main (String[] args)
    {
        int[] mätdata1 = {3, 6, 8, 2, 9};
        int[] mätdata2 = {2, 6, 3, 9, 9};
        int MätdataInteLika = 0;
        int StörstaSkillnaden = 0;
        int SubMätdata = 0;
        for (int i = 0; i < mätdata1.length; i++)
        {
            if (mätdata1[i] != mätdata2[i])
            {
                System.out.printf("Mätdatan är inte likadana på denna plats " + i + " " + mätdata1[i] + " " + mätdata2[i] + "\n");
                MätdataInteLika += 1;
                System.out.printf("Vi har mätt ut " + MätdataInteLika + " värden som inte är lika" + "\n");
                if (mätdata1[i] > mätdata2[i])
                {
                    SubMätdata = mätdata1[i] -= mätdata2[i];
                    System.out.printf("Subtraktionen av båda mätta värdena blir" + SubMätdata + "\n");
                    if (SubMätdata > StörstaSkillnaden)
                    {
                        StörstaSkillnaden = SubMätdata;
                        System.out.printf("Största skillanden är just nu " + StörstaSkillnaden + "\n");
                    }
                }
                else if (mätdata2[i] > mätdata1[i])
                {
                    SubMätdata = mätdata2[i] -= mätdata1[i];
                    System.out.printf("Subtraktionen av båda mätta värdena blir " + SubMätdata + "\n");
                    if (SubMätdata > StörstaSkillnaden)
                    {
                        StörstaSkillnaden = SubMätdata;
                        System.out.printf("Största skillanden är just nu " + StörstaSkillnaden + "\n");
                    }
                }
            }
        }
    }
}
