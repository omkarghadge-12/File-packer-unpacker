import java.io.*;
import java.util.*;

class Program562
{
    public static void main(String A[])throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        boolean bret = false;
        String FileName = null;

        System.out.println("Enter the name of file :");
        FileName = sobj.nextLine();

        FileWriter fwobj = new FileWriter(FileName);

        fwobj.write("Jay Ganesh...");

        fwobj.close();
        sobj.close();
    }
}