import java.util.*;
public class third {
	public static void main(String args[]) {
		 ArrayList<String> list=new ArrayList<String>();  
         list.add("A");  
         list.add("DA");  
         list.add("dfad");
         
         HashSet<String> lis = new HashSet(list);
         lis.add("Gaurav");  
         Iterator<String> i=lis.iterator();  
         while(i.hasNext())  
         {  
         System.out.println(i.next());  
         } 
    HashSet<String> set=new HashSet();  
    set.add("One");    
    set.add("Two");    
    set.add("Three");  
    set.remove("Three");
    Iterator<String> itr=set.iterator();  
    while(i.hasNext())  
    {  
    System.out.println(itr.next());  
    }  
    
    //tree set
    TreeSet<String> ts= new TreeSet<String>();
    ts.add("first");
    ts.add("sec");
    System.out.println("Traversing");
    Iterator iter=ts.descendingIterator();  
    while(iter.hasNext()) {
    	System.out.println(iter.next());
    }
    
    System.out.println("Reverse Set: "+ts.descendingSet()); 
    
    System.out.println("Reverse Set: "+ts.ascendingSet()); 
    
}
}
