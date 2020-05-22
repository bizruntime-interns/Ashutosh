package nio;
import java.io.IOException;  
import java.nio.ByteBuffer;  
import java.nio.channels.Pipe; 
public class pipes {

	public static void main(String[] args) throws IOException {  
	      Pipe pipe = Pipe.open();   
	      Pipe.SinkChannel skChannel = pipe.sink();  
	      String td = "Data is successfully sent for check.";  
	      ByteBuffer bb = ByteBuffer.allocate(512);  
	      bb.clear();  
	      bb.put(td.getBytes());  
	      bb.flip();  
	      while(bb.hasRemaining()) {  
	      skChannel.write(bb);  
	      }  
	      Pipe.SourceChannel sourceChannel = pipe.source();  
	      bb = ByteBuffer.allocate(512);      
	      while(sourceChannel.read(bb) > 0){  
	          bb.flip();  
	          while(bb.hasRemaining()){  
	            char TestData = (char) bb.get();  
	            System.out.print(TestData);  
	          }  
	          bb.clear();  
	      }  
	  }  
}
