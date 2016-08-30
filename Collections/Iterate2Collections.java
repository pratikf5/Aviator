package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Iterate2Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l1= new ArrayList<String>();
		l1.add("pratik");
		l1.add("rahul");
		l1.add("java");
		System.out.println(l1);
		System.out.println(Arrays.asList(l1));
		Iterator i1=l1.iterator(); 
			while(i1.hasNext())
			{
				System.out.println(i1.next());
			}
			
		}

}
