package day5;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFromFile_Buffered {

    public static void main(String[] args) throws IOException {
        //FileReader rdr = new FileReader("h:\\revature.txt");          //character stream
        FileInputStream rdr = new FileInputStream("h:\\revature.txt");          //byte stream
        BufferedInputStream bufferedInputStream = new BufferedInputStream(rdr);

        int i=0;
        while((i= bufferedInputStream.read()) != -1){
            System.out.print((char)i);
        }

        //closing the file
        bufferedInputStream.close();
        rdr.close();
    }
}
