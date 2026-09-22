//Unpacking code

import java.io.*;
import java.util.*;
                                
class Program607
{
    public static void main(String A[])throws Exception
    {
        //Variable creation
        Scanner sobj = null;
        String FileName = null;

        sobj = new Scanner(System.in);

        System.out.println("Enter the name of Packed file :");
        FileName = sobj.nextLine();

        File fpackobj = new File(FileName);

        if(! fpackobj.exists())
        {
            System.out.println("Error : There is no such packed file");
            return;
        }

    }
}