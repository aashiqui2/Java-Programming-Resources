import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class FileFolderDemo13 {
    public static void main(String[] args) {
        File file=new File("E:\\Programming\\2.Java Programming\\Resources\\00.Basic\\20.File handling\\testFolder\\test.txt");
        try{
            file.createNewFile();
            // FileWriter writer=new FileWriter(file,true);
            FileWriter writer=new FileWriter(file,true);
            writer.write("I am TCS");
            writer.flush();
            writer.close();

            FileReader fileread=new FileReader(file);
            // ? file.length() return long so type casted
            char[] ch=new char[(int)file.length()];
            // System.out.println(ch.length);
            fileread.read(ch);
            for(char c:ch){
                System.out.print(c);
            }
            fileread.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
