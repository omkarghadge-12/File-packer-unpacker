import java.io.*;
import java.util.*;
                                
class Program591 
{
    public static void main(String A[])throws Exception
    {
        byte key = 0x11;
        int iRet = 0;
        int i = 0 , j = 0;
        byte Buffer[] = new byte[1024];
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of folder :");
        String FolderName = sobj.nextLine();
        
        System.out.println("Enter the name of packed file :");
        String PackName = sobj.nextLine();

        File fobj = new File(FolderName);

        if((fobj.exists()) && (fobj.isDirectory()))
        {
            File packobj = new File(PackName);
            packobj.createNewFile();

            FileOutputStream foobj = new FileOutputStream(packobj);

            FileInputStream fiobj = null;
    
            System.out.println("Folder is present");
            File fArr[] = fobj.listFiles();
            System.out.println("Number of files in Folder are :"+fArr.length);

            for(i = 0; i < fArr.length; i++)
            {
                fiobj = new FileInputStream(fArr[i]);

                System.out.println("File Name :"+fArr[i].getName()+"   File Size :"+fArr[i].length()+" bytes");

                if(fArr[i].getName().endsWith(".txt"))
                {
                    while((iRet = fiobj.read(Buffer)) != -1)
                    {
                        for(j = 0; j < iRet; j++)
                        {
                            Buffer[j] = (byte)(Buffer[j] ^ key);
                        }

                        foobj.write(Buffer , 0 , iRet);
                    }
                }
             
                fiobj.close();
            }
            foobj.close();
        }
        else
        {
            System.out.println("There is no such folder");
        }
        sobj.close();
    }
}