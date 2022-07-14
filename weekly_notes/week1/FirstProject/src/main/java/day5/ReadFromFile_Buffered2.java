package day5;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFromFile_Buffered2 {

    public static void main(String[] args) throws IOException {
        BufferedInputStream bufferedInputStream =
                new BufferedInputStream(new FileInputStream("h:\\revature.txt"));

        int i=0;
        while((i= bufferedInputStream.read()) != -1){
            System.out.print((char)i);
        }

        //closing the file
        bufferedInputStream.close();

    }
}
