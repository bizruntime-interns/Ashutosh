package nio;

import java.io.FileOutputStream;  
import java.io.FileInputStream;  
import java.nio.ByteBuffer;  
import java.nio.channels.FileChannel;  
import java.nio.channels.ScatteringByteChannel;  
import java.nio.channels.GatheringByteChannel;  
public class scatter
{  
public static void main(String params[])   
    {  
        String data = "Scattering and Gatherinh";  
         gatherBytes(data);  
        scatterBytes();  
    }   
    public static void gatherBytes(String data)   
    {  
        ByteBuffer buffer1 = ByteBuffer.allocate(8);    
        ByteBuffer buffer2 = ByteBuffer.allocate(400);  
        buffer1.asIntBuffer().put(420);  
        buffer2.asCharBuffer().put(data);  
        GatheringByteChannel gatherer = createChannelInstance("D:\\testout.txt", true);   
        try  
        { gatherer.write(new ByteBuffer[] { buffer1, buffer2 });  
        }   
        catch (Exception e)   
        { e.printStackTrace();  
        }  
    }  
   
    public static void scatterBytes()   
    {  
        ByteBuffer buffer1 = ByteBuffer.allocate(8);    
        ByteBuffer buffer2 = ByteBuffer.allocate(400);  
        ScatteringByteChannel scatter = createChannelInstance("E:\\testout.txt", false);  
        try  
        { scatter.read(new ByteBuffer[] { buffer1, buffer2 });  
        }   
        catch (Exception e)   
        { e.printStackTrace();  
        }  
        buffer1.rewind();  
        buffer2.rewind();  
   
        int bufferOne = buffer1.asIntBuffer().get();  
        String bufferTwo = buffer2.asCharBuffer().toString();   
        System.out.println(bufferOne);  
        System.out.println(bufferTwo);  
    }  
     public static FileChannel createChannelInstance(String file, boolean isOutput)   
    {  
        FileChannel FChannel = null;  
        try  
        {  
            if (isOutput) {  
                FChannel = new FileOutputStream(file).getChannel();  
            } else {  
                FChannel = new FileInputStream(file).getChannel();  
            }  
        }   
        catch (Exception e) {  
            e.printStackTrace();  
        }  
        return FChannel;  
    }  
}  