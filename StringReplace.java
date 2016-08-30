
public class StringReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="Hello, How r u? r u ok?";
int i=0;
while(i< s1.length())
{
	char ch= s1.charAt(i);//Read each character in the string
	if(ch =='?' || ch==',')
	{
		String beforeReplacement=s1.substring(0, i);//It will return to that particular string
		String afterReplacement=s1.substring(i + 1);//skipped the characters ,goes to the next string
	    s1=beforeReplacement +afterReplacement;//Merge it down
		}
	
	else
	{
		i++;
	}
	System.out.println(s1);
}
	}

}
