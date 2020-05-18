import java.util.PriorityQueue;
import java.util.*;
public class fourth {
	public static void main(String args[]) {
		
		PriorityQueue<String> queue=new PriorityQueue<String>();  
		queue.add("Amit");  
		queue.add("Vijay");  
		queue.add("Karan");  
		System.out.println("head:"+queue.element());  
		System.out.println("head:"+queue.peek());  
		System.out.println("iterating the queue elements:");  
		queue.remove();  
		queue.poll();  
	
	//map interface
	Map map = new HashMap();
	map.put(1,"A");
	map.put(6,"S");
	Set set= map.entrySet();
    Iterator iters=set.iterator();  
    while(iters.hasNext()){  
    Map.Entry entry=(Map.Entry)iters.next();  
    System.out.println(entry.getKey()+" "+entry.getValue());  
    }
    map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
	
    //hashmap implementation
    HashMap<Integer,String> hm=new HashMap<Integer,String>();    
    System.out.println("Initial list of elements: "+hm);  
      hm.put(100,"Amit");    
      hm.put(101,"Vijay");    
      hm.put(102,"Rahul");   
      hm.remove(100);
       
      System.out.println("After invoking put() method ");  
      for(Map.Entry m:hm.entrySet()){    
       System.out.println(m.getKey()+" "+m.getValue());    
      }  
      
      //linked hashmap
      LinkedHashMap<Integer, String> maplink = new LinkedHashMap<Integer, String>();           
      maplink.put(10001,"tdalk");    
      maplink.put(101121,"ffa");    
      maplink.put(102,"sfscf");    
       //Fetching key  
       System.out.println("Keys: "+maplink.keySet());  
       //Fetching value  
       System.out.println("Values: "+maplink.values());  
       //Fetching key-value pair  
       System.out.println("Key-Value pairs: "+maplink.entrySet()); 
	
	}
}
