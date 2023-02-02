
public class Alternate {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10};//declare the array
		System.out.println("The sum of alternative numbers are :"+alternate(arr));//print sum
		
	}
	
	public static int alternate(int a1[])
	{
		//create a method to find & sum of alternative number
		int j=0,sum=0;//declare j & sum
		int b[]=new int[a1.length];
		for(int i=0;i<a1.length;i+=2)//for loop for find alternative number
		{
			b[j]=a1[i];
			sum+=b[j];//sum alternative number
			j++;	
		}
		return sum;
	}

}