import java.io.*;
import java.util.*;

class Program558
{
    public static void main(String A[])throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        String FileName = null;
        System.out.println("Enter the name of file :");
        FileName = sobj.nextLine();

        File fobj = new File(FileName);
        boolean bret = fobj.createNewFile();

        if(bret == true)
        {
            System.out.println("File gets created succesfully");
        }
        else
        {
            System.out.println("Unable to create file");
        }

        sobj.close();
    }
}