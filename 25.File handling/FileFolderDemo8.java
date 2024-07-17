// ? Listing only specific files and size
import java.io.File;
public class FileFolderDemo8 {
    public static void main(String[] args) {
        File file = new File("E:\\Programming\\2.Java Programming\\Resources\\00.Basic\\20.File handling//testFolder");
        File[] files = file.listFiles();
        for (File ff : files) 
        {
            if (ff.isFile()) {
                String fileName = ff.getName();
                if (fileName.endsWith(".txt")) {
                    System.out.println(fileName +" size is "+ff.length());
                }
            }
        }
    }
}
