// ! file renaming
import java.io.*;
public class FileFolderDemo3 {
    public static void main(String[] args) {
        File file=new File("E:\\Programming\\2.Java Programming\\Resources\\00.Basic\\20.File handling\\testFolder\\1.txt");
        try {
            //? if the path is secured (access Denied) throws IOException
            file.createNewFile();
        } catch (IOException e) {
            System.out.println(e);
            e.printStackTrace();
            System.out.println("An IOException occurred: " + e.getMessage());
        }
            File newName=new File("E:\\Programming\\2.Java Programming\\Resources\\00.Basic\\20.File handling\\testFolder\\2.txt");
       boolean renameSuccess= file.renameTo(newName);
       System.out.println("File renamed "+ renameSuccess);

    }
}
