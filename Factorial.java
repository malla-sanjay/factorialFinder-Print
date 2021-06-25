import java.util.Scanner;

public class Factorial
{
    private static int N;
    private static String contd;
    
    public static void Main(String[] args) {
        do{
            setnumber(); // inputs a valid number from user to be factorized
            
            //some instance variables and array used by the factorial process
            int array[] = new int[N];
            int tempN = N;
            int ans = 1;
            int counter = 0;
            
            //performs the factorial process to find the answer and store the factorial components
             while(tempN >= 1){
                ans = ans * tempN;
                array[counter] = tempN;
                tempN = tempN - 1;
                counter ++;
            }
            
            //prints the factorial components in proper format
            System.out.println("Following is the factorial for " + N);
            
            //for loop to print the individual factorial components with * at end except the last component
            for (int i = 0; i < (N-1) ; i ++){
                System.out.print(array[i] + "*");
            }
            System.out.print("1");
            
            System.out.print(" = " + ans );
            System.out.println();
            
            System.out.println("would you like to perform another calculation? (press any key to continue!) (N = exit)");
            Scanner scan1 = new Scanner(System.in);
            contd = scan1.next();
            
        } while(contd.equalsIgnoreCase("y"));
        System.out.println("Thank-you for using this program you can exit");
    }
    
    //method to set the number for factorial 
    public static void setnumber() {
        Scanner scan = new Scanner(System.in);
        
        try{
                System.out.println("Please Enter the number to find it's factorial");
                N = scan.nextInt();
            }
            catch (Exception e) {
                System.out.println("Refrain from using Characters and symbols & try again");
                System.exit(0);
            }
        
        while (N <= 0) {
                System.out.println("Please Enter a non-Negative, non-zero number since, this program is not capable to do so");
                N = scan.nextInt();
        }
    }
}

