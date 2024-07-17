import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class FileFolderDemo15
{
    public static void main(String[] args) {
        File file=new File("E:\\Programming\\2.Java Programming\\Resources\\00.Basic\\20.File handling\\testFolder\\test.txt");

        try{
            FileWriter writer = new FileWriter(file,true);
            BufferedWriter bWritter=new BufferedWriter(writer);
            bWritter.newLine();
            bWritter.write("Java Programming");
            bWritter.newLine();
            bWritter.write("C programming");
            bWritter.flush();
            bWritter.close();

            FileReader fReader=new FileReader(file);
            BufferedReader bReader=new BufferedReader(fReader);
            String line=bReader.readLine();
            // read line return string if the line has sequence of character or null if empty.
            int lineCount=0;
            int sentenceCount=0;
            int wordCount=0;
            int charCount=0;
            while(line!=null){
                String[] sentence=line.split("[.]");
                sentenceCount=sentenceCount+sentence.length;
                String[] words=line.split(" ");
                wordCount=wordCount+words.length;
                System.out.println(line);
                charCount=charCount+line.length();
                lineCount++;
                line=bReader.readLine();
            }
            System.out.println("No of Lines "+ lineCount);
            System.out.println("No of sentence "+ sentenceCount);
            System.out.println("No of words "+ wordCount);
            System.out.println("No of character Count "+charCount );
            bReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}