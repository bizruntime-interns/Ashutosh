import java.util.*;
enum days {sun,mon,tue,wed,thu,fri,sat};
public class fifth {

	public static void main(String[] args) { 
			   TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
			      map.put(1,"Amit");    
			      map.put(2,"Ravi");    
			      map.put(3,"Vijay");    
			      map.put(4,"Rahul");    
			        
			      for(Map.Entry m:map.entrySet()){    
			       System.out.println(m.getKey()+" "+m.getValue());    
			      }
			      //enumset
			      
			      Set<days> set = EnumSet.of(days.tue, days.wed);  
			      Iterator<days> iter = set.iterator();  
			      while (iter.hasNext())  
			        System.out.println(iter.next());  
			      
			      //sorting collection class
			      ArrayList<emp> empal=new ArrayList<emp>();    
			      empal.add(new emp(101,"Vijay",23));    
			      empal.add(new emp(106,"Ajay",27));    
			      empal.add(new emp(105,"Jai",21));    
			          
			      Collections.sort(empal);    
			      for(emp st:empal){    
			      System.out.println(st.rollno+" "+st.name+" "+st.age);    

	}
			      class emp implements Comparable<Student>{    
			    	  int rollno;    
			    	  String name;    
			    	  int age;    
			    	  emp(int rollno,String name,int age){    
			    	  this.rollno=rollno;    
			    	  this.name=name;    
			    	  this.age=age;    
			    	  } 

}
