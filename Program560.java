import java.io.*;
import java.util.*;

class Program560
{
    public static void main(String A[])throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        boolean bret = false;
        File fobj = null;
        String FileName = null;


        System.out.println("Enter the name of file :");
        FileName = sobj.nextLine();

        fobj = new File(FileName);

        bret = fobj.exists();

        if(bret == true)
        {
            fobj.delete();
            System.out.println("File gets deleted");
        }
        else
        {
           System.out.println("There is no such file");
        }
        
        sobj.close();
    }
}