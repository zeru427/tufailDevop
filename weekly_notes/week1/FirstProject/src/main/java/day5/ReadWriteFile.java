package day5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWriteFile {

    public static void main(String[] args) throws IOException {

        //user to input read file and write name ?
        /* Please enter the full file name of the file to be copied
        h:\\ah.txt
            System.exit(0);
            h:\\ah.txt does not exist, Hence cannot continue

            Please enter the full file name where this to be copied
            h:\\jj.txt
         */
        //create complete program
       File readFile = new File("h:\\about.txt");
        File writeFile = new File("h:\\aa.txt");


        FileInputStream readStream = new FileInputStream(readFile);          //byte stream
        FileOutputStream writeStream = new FileOutputStream(writeFile);
        int i=0;
        while((i= readStream.read()) != -1){
            writeStream.write(i);
        }

        //closing the file
        readStream.close();
        writeStream.close();

        System.out.println("Successfully copied");
    }
}
