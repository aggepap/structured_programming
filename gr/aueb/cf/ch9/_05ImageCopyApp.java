package gr.aueb.cf.ch9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _05ImageCopyApp {
    public static void main(String[] args) {

        try(FileInputStream fis = new FileInputStream("C:/temp/1.psd");
        FileOutputStream fos = new FileOutputStream("C:/temp/1-out.psd")){
    int b;
        int count = 0;
        long start =0;
        long end = 0;
        double elapsedtime =0;
start = System.currentTimeMillis();
            while ((b = fis.read()) != -1) {
                fos.write(b);
                count++;
            }
            end = System.currentTimeMillis();
            elapsedtime = (end-start) / 1000.0;
            System.out.printf("Succes. File with size %d kb (%d bytes) was copied succesfully", count/1024, count);
            System.out.println("Elapsed time " + elapsedtime);
    }catch (IOException e){
        e.printStackTrace();}
    }
}
