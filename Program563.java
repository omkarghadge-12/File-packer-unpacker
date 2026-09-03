import java.io.*;
import java.util.*;

class Program563
{
    public static void main(String A[])throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        boolean bret = false;
        String FileName = null;

        System.out.println("Enter the name of file :");
        FileName = sobj.nextLine();

        FileReader frobj = new FileReader(FileName);

        frobj.close();
        sobj.close();
    }
}