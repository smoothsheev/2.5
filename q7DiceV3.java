import java.util.Scanner;

class q7DiceV3 {

    public static void main (String[] args) {
        //1. declare variables
        Scanner sc = new Scanner(System.in);
        //... other variables go here
        int dice, sides;
        int roll = 0;
        int total = 0;
        String x = "y";
        //2. get user input
        
        while (x.equals("y")) {
        System.out.println("How many dices do you want to roll?");
        dice = sc.nextInt();
        System.out.println("How sides do these dice have?");
        sides = sc.nextInt();
        
        
        while (dice > 0) {
          roll = rollDie(sides);
          total += roll;
          dice --;
          System.out.println("You rolled a " + roll);
        }
        System.out.println("Total:" + total);
        
        System.out.println("Again?  [y,n]");
        x = sc.next();
    }
        
        
        //3. calculate and display answer
        
}
public static int rollDie(int sides) {
        return (int) (Math.random()* sides) + 1;  
    }
}