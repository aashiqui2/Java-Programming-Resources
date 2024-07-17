import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;

public class TryWithResources {
    public static void main(String[] args) throws Exception {
        File f=new File("E:\\Programming\\2.Java Programming\\Resources\\00.Basic\\19.Exception Handling\\final,finally,finalize().md");
        FileReader fr=new FileReader(f);
        // BufferedReader br=new BufferedReader(fr);
        // try{
        //     br.read();
        // }
        // catch(Exception e){

        // }
        // finally{
        //     br.close();
        // }
        //? Instead of doing all these we can do like the below
        try(BufferedReader br=new BufferedReader(fr); Demo d=new Demo()){
            br.read();
        }
        //? jvm will automatically close the bufferedReader.
    }
}

class Demo implements AutoCloseable{
    @Override
   public void close() throws Exception
   {

   }
}
