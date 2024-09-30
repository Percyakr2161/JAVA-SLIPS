class Reverse { 

	public static void main(String[] args){ 
		
		int a[] = new int[]{1,2,3,4,5 },i;
		 { 
		 
		 	System.out.println("Original array");
			for(i=0;i<a.length;i++)
				{ 
				
					System.out.println(a[i]);
				}
			System.out.println("Reverse array");
			for(i=a.length-1;i>=0;i--)
				{ 
				
					System.out.println(a[i]);
				}
		 }
	}

}
