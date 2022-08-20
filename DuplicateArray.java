class  DuplicateArray
{
	public static void main(String[] args) 
	{
	     int arr[]={1,2,3,3,4,4,5};
		 System.out.println("Given Array"+arr);

		 for (int i=0;i<arr.length ;i++ )
		 {
			 for (int j=i+1;j<arr.length ;j++ )
			 {
				 if (arr[i]==arr[j])
				 {
					 System.out.println("DuplicateElements of an array is"+arr[i]);
				 }
			 }
		 }
	}
}