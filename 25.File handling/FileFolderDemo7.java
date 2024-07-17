
//? Listing Only Folders 
import java.io.File;

public class FileFolderDemo7 {
    public static void main(String[] args) {

        File file = new File("E:\\Programming\\2.Java Programming\\Resources\\00.Basic\\20.File handling");
        // !return an array of abstact pathnames
        File[] files = file.listFiles();
        for (File ff : files) {
            if (ff.isDirectory())// ?for only folders
                System.out.println(ff);
        }
    }
}
