import java.io.File;
public class FileFolderDemo11 {
    public static void main(String[] args) {
        File file =new File("E:\\Programming\\2.Java Programming\\Resources\\00.Basic\\20.File handling\\testFolder");
        File[] fileFolderArray=file.listFiles();
        for(File ff:fileFolderArray){
            if(ff.isFile()){
                String filename=ff.getName();
                int lastDot=filename.lastIndexOf(".");
                String extension=filename.substring(lastDot+1);
                if(extension.equals("md")){
                    ff.delete();
                }
            }
        }
    }
}
