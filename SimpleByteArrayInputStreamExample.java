package IO;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class SimpleByteArrayInputStreamExample {
    
    public static void main(String[] a) throws IOException
    {
        byte[] byteArray = { 1, 2, 3, 4, 5 };

        // ByteArrayInputStream obj = new ByteArrayInputStream(byteArray);

        InputStream obj = new ByteArrayInputStream(byteArray, 0, byteArray.length);

        System.out.println("All the elements in the buffer:");

        int num = obj.read();

        System.out.println(num);

        /*
         * while ((num = obj.read()) != -1) { System.out.println(num); }
         */
        
   
    }
  
}