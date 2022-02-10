public class ArrayCopy {

    public static void main (String[] argv)
    {
        int[][] A = {
            {1},
            {2, 1},
            {3, 2, 1},
            {4, 3, 2, 1},
            {5, 4, 3, 2, 1}
        };
        print (A);

        int[][] B = copy (A);
        print (B);
    }

    static void print (int[][] X)
    {
        for (int i=0; i<X.length; i++) {
            for (int j=0; j < X[i].length; j++) {
                System.out.print (" " + X[i][j]);
            }
            System.out.println ();
        }
    }
    
    // INSERT YOUR CODE HERE.
    //loop through to find the number of rows which is the length of A
 public static int[][] copy (int[][] A){
   int numRowsA = A.length;
   int [][] Q = new int[numRowsA][];
   //find the number of columns with each row's length
    for (int i = 0; i < numRowsA; i++){
      int numColsA = A[i].length;
      
      //Q will be A at each index
      Q[i] = new int[numColsA];
	   for (int j = 0; j < numColsA; j++){
	      Q[i][j] = A[i][j];
	   }
 //return Q
   }
	return Q;	  
 }
}
