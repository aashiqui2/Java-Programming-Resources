// ? read the file using bufferedReader and bufferedReader by line by line.
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileFolderDemo14 {
    public static void main(String[] args) {
        File file = new File(
                "E:\\Programming\\2.Java Programming\\Resources\\00.Basic\\20.File handling\\testFolder\\test.txt");

        // ? we are using try with Resources so no need to close the bwriter.close()
        try (FileWriter writer = new FileWriter(file)) {
            // ! we cannot pass the pathname here like this in BufferedReader
            // BufferedWriter bwriter=new BufferedWriter("E:\\Programming\\2.Java Programming\\Resources\\00.Basic\\20.File handling\\testFolder\\test.txt");

            BufferedWriter bwriter = new BufferedWriter(writer);
            bwriter.write("Tamil");
            bwriter.newLine();
            bwriter.write("English");
            bwriter.flush();

            FileReader freader=new FileReader(file);
            BufferedReader bReader=new BufferedReader(freader);
            //? this will read the file line by line but if it reaches end return null
            String line=bReader.readLine();
            int lineCount=0;
            while (line!=null){
                System.out.println(line);
                line=bReader.readLine();
                lineCount++;
            }
            System.out.println("No Of lines "+ lineCount);
            bReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
