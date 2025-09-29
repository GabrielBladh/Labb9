public class Uppgift_3
{
    public static void main (String[] args)
    {
        String[][] Results = {{"Adam","Ason","661122","35","U"},{"Beata","Bson","770111","38","G"},{"Calle","Ceson","880222","23","U"},{"Dorotea","Deson","990311","44","VG"},{"Eivar","Eson","550423","40","G"}};
        for (int i = 0; i < Results.length; i++)
        {
            if(Results[i][4] == "G" || Results[i][4] == "VG")
            {
                System.out.println(Results[i][1] + " " + Results[i][3]);
            }
        }
    }
}
