// ! File deletion
import java.io.File;
public class FileFolderDemo2 {
    public static void main(String[] args) {
        File file=new File("E:\\Programming\\2.Java Programming\\Resources\\00.Basic\\20.File handling\\testFolder\\1.txt");
        file.delete();
        boolean present=file.exists();
        System.out.println("File present and Deleted Successfully " + present);
    }
}
