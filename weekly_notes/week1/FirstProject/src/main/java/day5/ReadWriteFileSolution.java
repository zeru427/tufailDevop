package day5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReadWriteFileSolution {

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
        Scanner input = new Scanner(System.in);

        //1. Asking the user to input read file name
        System.out.println("Please enter the full name of the file to be copied:");
        String file = input.nextLine();
        File readFile = new File(file);

        //2. checking the existence of the read file
        if (!readFile.exists()) {
            //if file is not there , then exiting
            System.out.println("File does not exists, hence cannot continue");
            System.exit(0);
        }else{

            //3. continue
            System.out.println("Please enter the full name of the file to be pasted:");
            String writeFileName = input.nextLine();
            File writeFile = new File(writeFileName);
            FileInputStream readStream = new FileInputStream(readFile);          //byte stream
            FileOutputStream writeStream = new FileOutputStream(writeFile);
            int i = 0;
            while ((i = readStream.read()) != -1) {
                writeStream.write(i);
            }

            //closing the file
            readStream.close();
            writeStream.close();

            System.out.println("Successfully copied");
        }
    }
}