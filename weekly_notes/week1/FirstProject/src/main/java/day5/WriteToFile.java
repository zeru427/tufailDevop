package day5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteToFile {

    public static void main(String[] args) throws IOException {
        //FileReader rdr = new FileReader("h:\\revature.txt");          //character stream
        FileOutputStream rdr = new FileOutputStream("h:\\reva.txt");          //byte stream

        rdr.write(97);

        //closing the file
        rdr.close();
    }
}
