package prodArr;

public class Main {
	public static void main(String[] args) {
		int[] arr = new int[]{12,4,14,4};
		int i = arr.length-1;
		System.out.println(f14(arr, i));
		System.out.println(f15(arr, i));
		System.out.println(f16(arr, i, 2));
		System.out.println(f17(arr, i));
		System.out.println(f18(arr, i));// if there is not prime num in the arr, return true.
	
		
	}

   
   public static int f14( int arr[], int i) {
	   if (i==-1)
		   return 0;
	   return f14(arr, i-1)+arr[i];
   }
   
   public static int f15( int arr[], int i) {
	   if (i==-1)
		   return 0;
	   if (arr[i]>0)
		   return f15(arr, i-1)+1;
	   return f15(arr, i-1);
   }
   
   public static int f16( int arr[], int i, int n) {
	   if (i==-1)
		   return -1;
	   if (arr[i]==n)
		   return i;
	   return f16(arr, i-1, n);
   }
   
   public static boolean f17( int arr[], int i) {
	   if (i==0)
		   return true;
	   if (arr[i]<arr[i-1])
		   return false;
	   return f17(arr, i-1);
   }
   
   public static boolean f18( int arr[], int i) {
	   if (i==0)
		   return true;
	   if (isPrime(arr[i],2)==true)
		   return false;
	   return f18(arr, i-1);
   }
   
   public static boolean isPrime(int n, int divisor) {
	   if (divisor==n)
		   return true;
	   if (n % divisor == 0) 
		   return false;
	   
		   
	   return isPrime(n,divisor+1);
   }

}
