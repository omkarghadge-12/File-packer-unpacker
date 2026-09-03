import java.io.*;
import java.util.*;

class Program575

{
    public static void main(String A[])throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        boolean bret = false;
        String FileName = null;
        byte Buffer[] = new byte[100];
        int iRet = 0;
        
        System.out.println("Enter the name of file :");
        FileName = sobj.nextLine();

        File fobj = new File(FileName);

        if(fobj.exists())
        {
            String str = null;

            FileInputStream fiobj = new FileInputStream(fobj);

            while((iRet = fiobj.read(Buffer)) != -1)
            {
                str = new String(Buffer);
                System.out.print(str);
                str = null;
            }
            System.out.println();
        }
        else
        {
            System.out.println("There is no such file");
        }

    
        
        sobj.close();
    }
}