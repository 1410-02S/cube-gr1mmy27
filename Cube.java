import java.util.Scanner;

//Missing most of the funcitonality, An ok start though.

public class Cube {

	public static void main(final String[] args) {
		
        /*
         * Green = 1
         * White = 2
         * Blue = 3
         * Yellow = 4
         * Orange = 5
         * Red = 6
         */
	

         //User input for the Cube
         int Cube_colors[][] = new int[6][9];
         Cube_colors = getColors();
	}
    public static int[][] getColors() {
        int input[][] = new int[6][9];
        int counter_0 = 0;
        int counter_1 = 0;

        Scanner in = new Scanner(System.in);
        
        // Get data for green side
    System.out.println("Enter the colors for the green side"
        + " \n1 = GREEN\n2 = WHITE\n3 = BLUE\n4 = YELLOW\n5 = ORANGE\n6 = RED\n"
        + " The orange side should be on top\n"
        + " The red side is on the bottom\n"
        + " The white side to the right\n"
        + " And the yellow side to the left");
    while(counter_0 <= 8) {
        input[0][counter_0] = Integer.parseInt(in.nextLine());
        counter_0++;
}
System.out.println("Turn the cube clockwise 90 degrees");    

//Enter the colors for the white side
System.out.println("Enter the colors for the white side"
        + " \n1 = GREEN\n2 = WHITE\n3 = BLUE\n4 = YELLOW\n5 = ORANGE\n6 = RED\n"
        + " The orange side should be on top\n"
        + " The red side is on the bottom\n"
        + " The blue side to the right\n"
        + " And the green side to the left");
    while(counter_0 <= 8) {
        input[1][counter_0] = Integer.parseInt(in.nextLine());
        counter_0++;
}  

//Enter the colors for the blue side  
System.out.println("Enter the colors for the blue side"
+ " \n1 = GREEN\n2 = WHITE\n3 = BLUE\n4 = YELLOW\n5 = ORANGE\n6 = RED\n"
+ " The orange side should be on top\n"
+ " The red side is on the bottom\n"
+ " Yellow to the right\n"
+ " And Red on bottom");
while(counter_0 <= 8) {
input[2][counter_0] = Integer.parseInt(in.nextLine());
counter_0++;    
}  

// Entering the colors for the yellow side
System.out.println("Enter the colors for the yellow side"
+ " \n1 = GREEN\n2 = WHITE\n3 = BLUE\n4 = YELLOW\n5 = ORANGE\n6 = RED\n"
+ " The orange is on top\n"
+ " red on bottom\n"
+ " green to right\n"
+ " blue to left");
while(counter_0 <= 8) {
input[3][counter_0] = Integer.parseInt(in.nextLine());
counter_0++;    
} 

// Entering the colors for the orange side
System.out.println("Enter the colors for the orange side"
+ " \n1 = GREEN\n2 = WHITE\n3 = BLUE\n4 = YELLOW\n5 = ORANGE\n6 = RED\n");
while(counter_0 <= 8) {
input[4][counter_0] = Integer.parseInt(in.nextLine());
counter_0++;    
}   

// Entering the colors for the red side
System.out.println("Enter the colors for the red side"
+ " \n1 = GREEN\n2 = WHITE\n3 = BLUE\n4 = YELLOW\n5 = ORANGE\n6 = RED\n");
while(counter_0 <= 8) {
input[5][counter_0] = Integer.parseInt(in.nextLine());
counter_0++;    
} 
return input;
    


}
}