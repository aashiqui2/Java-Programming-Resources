import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileFolderDemo16 {
    public static void main(String[] args) {
        // ! Inputstream is abstract class so we cannot create object
        try{
            InputStream input = new FileInputStream("E:\\Programming\\2.Java Programming\\Resources\\00.Basic\\ascii table.png");
            OutputStream output=new FileOutputStream("E:\\Programming\\2.Java Programming\\Resources\\00.Basic\\20.File handling\\ASCII.png");
           int content= input.read();//return int value or -1
            while(content!=-1){
                output.write(content);
                content=input.read();
            }
            output.flush();
            input.close();
            output.close();
          
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
