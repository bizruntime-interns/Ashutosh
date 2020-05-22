package nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;

public class basics {

			public static void main(String[] args) {
			try {
				FileInputStream input = new FileInputStream ("E:\\input.txt");
		        ReadableByteChannel source = input.getChannel();  
		        FileOutputStream output = new FileOutputStream ("E:\\output.txt"); 
		        WritableByteChannel destination = output.getChannel();  
		        copyData(source, destination);  
		        source.close();  
		        destination.close();
				
			}
			catch(Exception e){
				System.out.println(e);
				
			}
			
	}
	
	private static void copyData(ReadableByteChannel src, WritableByteChannel dest) throws IOException   
    {  
        ByteBuffer buffer = ByteBuffer.allocateDirect(20 * 1024);  
   while (src.read(buffer) != -1)   
        {  
            // The buffer is used to drained  
            buffer.flip();  
            // keep sure that buffer was fully drained  
            while (buffer.hasRemaining())   
            {  
                dest.write(buffer);  
            }  
            buffer.clear(); // Now the buffer is empty, ready for the filling  
        }  

    }
	
}
