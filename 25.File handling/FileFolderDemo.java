// ! Folder and sub folder creation
import java.io.File;
public class FileFolderDemo {
    public static void main(String[] args) {
        File file=new File("E:\\Programming\\2.Java Programming\\Resources\\00.Basic\\20.File handling\\testFolder");
        // ! create sub folder
        // File file=new File("E:\\Programming\\2.Java Programming\\Resources\\String\\File handling\\testFile\\notes\\dubakur");
        boolean present=file.exists();
        System.out.println("Foler present : "+ present);
        if(present == false){
            file.mkdirs();//? folder creation
        }
        present=file.exists();
        System.out.println("Folder already Exist : "+ present);

    }
}
