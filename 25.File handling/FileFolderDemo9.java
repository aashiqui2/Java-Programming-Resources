// ? Listing files size greater then > 5mb
import java.io.File;
public class FileFolderDemo9 {
    public static void main(String[] args) {
        File file = new File("E:\\Programming\\2.Java Programming\\Resources\\00.Basic\\20.File handling//testFolder");
        File[] files = file.listFiles();
        for (File ff : files) {
            if (ff.isFile()) {
                String fileName = ff.getName();
                if(ff.length()>=4) {
                    System.out.println(fileName + " Size is " + ff.length());//!size will be in bytes
                }
            }
        }
    }
}