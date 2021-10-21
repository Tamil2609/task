import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.io.File;
import java.util.Scanner;

public class Fileconcepts
 {
 public void FileCreate()
  {
  try
   {
   File f1=new File("new.txt");
   if(f1.createNewFile())
    {
    System.out.println(f1.getName()+"is created successfully");
   }
   else
    {
    System.out.println("Already exist");
   }
  }
  catch(IOException exception)
   {
   System.out.println("Error");
   exception.printStackTrace();
  }
 }
 
public void FileWriter(int guess)
{
try 
{
 FileWriter fwrite=new FileWriter("new.txt");
 fwrite.write("Guessed Random number -->"+guess);
 fwrite.close();
 System.out.println("Do you wanna see the output--> go th new.txt file");
}
catch(IOException e) 
{
 System.out.println("error");
 e.printStackTrace();
}
}

public void FileReader()
{
 try
  {
  File f2 =new File("new.txt");
  Scanner dataReader=new Scanner (f2);
  while(dataReader.hasNextLine())
  {
   String filedata=dataReader.nextLine();
   System.out.println(filedata);
  }
  dataReader.close();
 }
 catch(FileNotFoundException exception) 
 {
  System.out.println("error");
  exception.printStackTrace();
 }
}
}