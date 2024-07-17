// ! printing file name
import java.io.File;
public class FileFolderDemo4 {
    public static void main(String[] args) {
        File file=new File("E:\\Programming\\2.Java Programming\\Resources\\00.Basic\\20.File handling\\testFolder\\2.txt");
        System.out.println("File name is "+ file.getName());
        // ? for checking the file property like readonly,editable,etc.
        System.out.println(file.canExecute());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        
        // ? Checking folder or file
        File file1 = new File("E:\\Programming\\2.Java Programming\\Resources\\00.Basic\\20.File handling\\testFolder\\2.txt");
		System.out.println(file1.isDirectory());
		System.out.println(file1.isFile());
    }
}