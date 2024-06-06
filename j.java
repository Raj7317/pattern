public class j {
    public static void main(String[] args) {
        int rows = 5; 
  
        // first loop for printing all rows 
        for (int i = 0; i < rows; i++) { 
      
            // first inner loop for printing leading white 
            // spaces 
            for (int j = 0; j < 2 * i; j++) { 
                System.out.print(" "); 
            } 
      
            // second inner loop for printing alphabets 
            for (int k = 0; k < 2 * (rows - i) - 1; k++) { 
                System.out.print(k); 
            } 
            System.out.println(); 
        } 
    }
    }

