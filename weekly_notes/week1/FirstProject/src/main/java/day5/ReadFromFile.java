package day5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {

    public static void main(String[] args) throws IOException {
        //FileReader rdr = new FileReader("h:\\revature.txt");          //character stream
        FileInputStream rdr = new FileInputStream("h:\\revature.txt");          //byte stream
        int i=0;
        while((i= rdr.read()) != -1){
            System.out.print((char)i);
        }

        //closing the file
        rdr.close();
    }
}
