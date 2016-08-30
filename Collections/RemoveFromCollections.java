package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveFromCollections {

	public static void main(String[] args) {
		
		String r1="sds";
List<String> l1=new ArrayList<>();
l1.add("sds");l1.add("sdfsdf");
System.out.println(l1);
System.out.println(Arrays.asList(l1));
Iterator i1=l1.iterator();
while(i1.hasNext())
{
	if(r1.equals(i1.next()))
		i1.remove();
	System.out.println(i1.next());
}
System.out.println("After removing the element is" + l1);
	}

}
