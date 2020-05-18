
import java.util.*;
//class objects of array list
class student{
	int roll;
	String name;
	student(int roll,String name){
		this.roll=roll;
		this.name=name;
	}
}
class ArrayList1 {
public static void main(String args[]) {
	ArrayList<String>list= new ArrayList<String>();
	 list.add("dqa");
	 list.add("dqaa");
	 for(String obj:list)  
		 System.out.println(obj);  
	 System.out.println(list);
	 
	 student s1 =new student(101,"anlada");
	 student s2 =new student(1001,"adaanlada");

	 ArrayList<student>al = new ArrayList<student>();
	 al.add(s1);
	 al.add(s2);  
	  //Getting Iterator  
	  Iterator itr=al.iterator();  
	  //traversing elements of ArrayList object  
	  while(itr.hasNext()){  
	    student st=(student)itr.next();  
	    System.out.println(st.roll+" "+st.name+" ");  
}
}
}