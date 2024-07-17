// ? Writting to the file by using FileWriter
import java.io.File;
import java.io.FileWriter;

public class FileFolderDemo10 {
    public static void main(String[] args) throws Exception {
        File file = new File("E:\\Programming\\2.Java Programming\\Resources\\00.Basic\\20.File handling\\testFolder\\test.txt");
        file.createNewFile();
           
        
        FileWriter pen = new FileWriter(file, true); 
        pen.write("🎈");
        pen.write("aashiqui");
        pen.flush();
        pen.close();
    }
}

