// ? read file by char by char using FileReader
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileFolderDemo12 {
    public static void main(String[] args) {
        File file=new File("E:/Programming/2.Java Programming/Resources/00.Basic/20.File handling/testFolder/test.txt");
        try{
            boolean created=file.createNewFile();
            System.out.println("File created "+created);
            // ! we can use the like this also
            // FileWriter writter=new FileWriter("E:/Programming/2.Java Programming/Resources/00.Basic/20.File handling/testFolder\test.txt");

            // ? alternative way 
            //!there are two constructor for FileWriter()
            // FileWriter writer=new FileWriter(file);
            FileWriter writer=new FileWriter(file,true);
            writer.write(96);//! prints ascii values to the file
            writer.write("How are you?");
            writer.write("\n");
            writer.write("I am Fine");
            writer.flush();
            writer.close();
            
            FileReader filereader=new FileReader(file);
            int output=filereader.read();
            //? when it reaches the end it shows -1.
            while(output!=-1){
                System.out.print((char)output);
                output=filereader.read();
            }
            filereader.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
