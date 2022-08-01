public class numberpattern {
    public static void main(String[] args) {
        int  n = 4;
         int temp = 1;
       for (int i = 0; i<n; i++) {
 
         for (int j = 0; j<n; j++)
         {
               if(temp!=0)
               {
                 System.out.print(temp);
               }
               else{
                 System.out.print(" ");
               }
         }
   temp++;
         System.out.println();
        }
    }
}
