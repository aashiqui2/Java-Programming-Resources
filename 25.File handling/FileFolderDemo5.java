
// ! Displaying the list of files and folder 
import java.io.File;

public class FileFolderDemo5 {

    public static void main(String[] args) {
        File file = new File("E:\\Programming\\2.Java Programming\\Resources\\00.Basic\\20.File handling");

        // !return an array of string whcihc contains only filename and folder name
        // without the whole pathname
        String[] listOfFilesFolder = file.list();

        // ?only file names and folder name
        for (int i = 0; i < listOfFilesFolder.length; i++) {
            System.out.println(listOfFilesFolder[i]);
            
            // ? we cannot do like this here because its is string
            // if(file.isFile()){
            // System.out.println(listOfFilesFolder[i]);
            // }
        }
    }
}
