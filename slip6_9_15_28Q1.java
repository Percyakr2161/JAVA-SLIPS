import java.io.*;
import java.lang.ArrayIndexOutOfBoundsException;

class Sort
{
 public static void main(String[] args)throws IOException

	 {
		 int i;
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 
          int[] arr = new int[5];

        
	  for(i=0;i<5;i++)
		  {
		   arr[i] = Integer.parseInt(br.readLine());
		  }
	  int temp = 0,j;
	  for(i=0;i<5;i++)
		  {
		   for(j=i+1;j<5;j++)
			   {
			    if(arr[i]>arr[j])
				    {
				     temp = arr[i];
				     arr[i] = arr[j];
				     arr[j] = temp;
				    }
			   }
		  }

	  System.out.println();
	  System.out.println("Elements of array sorted in ascending order:");
	  for(i=0;i<5;i++)
		  System.out.print(arr[i]+"");
	 }
}
