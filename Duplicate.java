
public class Duplicate {
	public static void main(String[] args) 
    {
		//Declare array and getting input
        String[] arr = {"kolkata", "delhi", "mumbai", "kolkata", "rajasthan", "delhi", "panjab"};
 
        for (int i = 0; i < arr.length-1; i++)
        {
            for (int j = i+1; j < arr.length; j++)
            {
                if( (arr[i].equals(arr[j])) && (i != j) )//checking duplicate string
                {
                    System.out.println("Duplicate Element is : "+arr[j]);//print this
                }
            }
        }
    }    

}
