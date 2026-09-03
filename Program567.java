import java.io.*;
import java.util.*;

class Program567
{
    public static void main(String A[])throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        boolean bret = false;
        String FileName = null;
        FileReader frobj  = null;
        
        System.out.println("Enter the name of file :");
        FileName = sobj.nextLine();

        File fobj = new File(FileName);

        if(fobj.exists())
        {
            frobj = new FileReader(FileName);

            char Buffer[] = new char[50];
            frobj.read(Buffer , 0 , 13);

            System.out.println("data from file :"+new String(Buffer));   
        }
        else
        {
            System.out.println("There is no such file");
        }

        if(frobj != null)
        {
            frobj.close();
        }
        
        sobj.close();
    }
}