import java.util.Scanner;

class q6DisplayBox {

    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int width = 0; 
        int height = 0;
        
        
        
        System.out.println("Enter your desired width.");
        width = sc.nextInt();
        System.out.println("Enter your desired height.");
        height = sc.nextInt();
        
        while (height > 0) {
           System.out.println(""); 
           
          for (int tempWidth = width; tempWidth > 0; tempWidth --) {  
            System.out.print("$");
            
            }
            height --;
        }
        
        
}
}
