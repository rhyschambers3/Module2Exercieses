public class PointerCopyProblem {

    public static void main (String[] argv)
    {
        // Make a 3 x 2 array.
        int[][] A = {
            {1, 2},
            {3, 4},
            {5, 6}
        };
        
	
	//make a new copy as a deep copy.
   //create dimensions of original array
   int numRowsA = A.length;
   int numColsA = A[0].length;
	int [][] B = new int [numRowsA][numColsA];
   
	for (int i = 0; i < numRowsA; i++){
	   for (int j = 0; j < numColsA; j++){
	    B[i][j] = A[i][j];
	   }
   }

        print (A, B);
        
        // Make a change in B.
        B[0][0] = 9;
        
        print (A, B);
    }

    static void print (int[][] A, int[][] B)
    {
        System.out.println ("\nArray A: ");
        for (int i=0; i<A.length; i++) {
            for (int j=0; j<A[i].length; j++) {
                System.out.print (" " + A[i][j]);
            }
            System.out.println ();
        }
        
        System.out.println ("Array B: ");
        for (int i=0; i<B.length; i++) {
            for (int j=0; j<B[i].length; j++) {
                System.out.print (" " + B[i][j]);
            }
            System.out.println ();
        }
    }
    
}