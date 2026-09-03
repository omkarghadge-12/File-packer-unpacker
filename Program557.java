import java.io.*;
import java.util.*;

class Program557
{
    public static void main(String A[])throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        File fobj = new File("Demo.txt");
        boolean bret = fobj.createNewFile();

        if(bret == true)
        {
            System.out.println("File gets created succesfully");
        }
        else
        {
            System.out.println("Unable to create file");
        }
    }
}