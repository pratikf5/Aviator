
public class LargestPallindromeofThreedigitnumbers {

	public static void main(String[] args) {
		int largestNumber=0;
		
		for(int i=100;i<=999;i++)
		{
			for(int j=i;j<=999;j++)
			{
				int product=i*j;
				StringBuilder sb=new StringBuilder(""+product);//appends to the next number and goes on in a series
				String sb1=""+product;
				sb.reverse();
				if(sb1.equals(sb.toString()) && largestNumber<product)//toString returns the instance of the object.Usually @hexadecimal number
				{
					largestNumber=product;
				}
				
			}
		}
		System.out.println(largestNumber);
	}
	
}
