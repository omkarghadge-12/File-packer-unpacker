import java.io.*;
import java.util.*;

class Program559
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
            System.out.println("File is already present");
        }
        else
        {
            bret = fobj.createNewFile();

            if(bret == true)
            {
                System.out.println("File gets created succesfully");
            }
            else
            {
                System.out.println("Unable to create file");
            }
        }
        
        sobj.close();
    }
}