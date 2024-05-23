package gr.aueb.cf.ch9;

import java.io.*;

public class _06ImageBufferedCopyApp {

    public static void main(String[] args) {

        try(BufferedInputStream bis = new BufferedInputStream( new FileInputStream("C:/temp/1.psd"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:/temp/1-out.psd"))){
            int b;
            int count = 0;
            long start =0;
            long end = 0;
            double elapsedtime =0;
            byte[] buf = new byte[4096];
            start = System.currentTimeMillis();
            while ((b = bis.read(buf, 0, buf.length)) != -1) {
                bos.write(buf, 0, b);
                count+=b;
            }
            end = System.currentTimeMillis();
            elapsedtime = (end-start) / 1000.0;
            System.out.printf("Succes. File with size %d kb (%d bytes) was copied succesfully\n", count/1024, count);
            System.out.println("Elapsed time " + elapsedtime);
        }catch (IOException e){
            e.printStackTrace();}
    }
}
