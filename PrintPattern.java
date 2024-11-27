package codingTest;
// print the pattern 
//1
//22
//333
//4444
//55555
public class PrintPattern {
	public static void printPattern( int n) {
		        //outer loop
		   for (int i = 1; i <= n; i++) {
			   //inner loop
	            for (int j = 0; j < i; j++) {
	                System.out.print(i + " ");
	            }
	            System.out.println();
	        }
	    }	
   public static void main ( String [] args) {
	   printPattern(5);
   }}
