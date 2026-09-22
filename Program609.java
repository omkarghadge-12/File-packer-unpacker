//Unpacking code

import java.io.*;
import java.util.*;
                                
class Program609
{
    public static void main(String A[])throws Exception
    {
        //Variable creation
        Scanner sobj = null;
        String FileName = null;
        File fpackobj = null;
        FileInputStream fiobj = null;
        byte bHeader[] = new byte[100];
        String Header = null;
        String Tokens[] = null;

        sobj = new Scanner(System.in);

        System.out.println("Enter the name of Packed file :");
        FileName = sobj.nextLine();

        fpackobj = new File(FileName);

        if(! fpackobj.exists())
        {
            System.out.println("Error : There is no such packed file");
            return;
        }

        fiobj = new FileInputStream(fpackobj);

        //read the header
        fiobj.read(bHeader , 0 , 100);

        Header = new String(bHeader);

        Header = Header.trim();

        Tokens = Header.split(" ");

        System.out.println("File name :"+Tokens[0]);
        System.out.println("File size :"+Tokens[1]);
    }
}