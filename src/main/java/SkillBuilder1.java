import java.util.Scanner;

/**
 * Skill Builder 0
 *
 * @author (You)
 * @version (2.1, 2.2)
 */
public class SkillBuilder1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("You're Jane's friend!");
        System.out.println("\"What's your name?\"");
        String name = input.nextLine();
        System.out.println("Enter a floating-point number:");
        double spice = input.nextDouble();
        double exponent = Math.sqrt(5) / Math.pow(spice, 3);
        double result = (4.0 / 3.0) * Math.pow(2, exponent);
        System.out.printf("Well %s, the spice value resulted in %.4f\n", name, result);
        double convertedValue = (int) (result * 100) / 100.0;
        System.out.println("Well " + name + ", the spice value resulted in " + result);
        System.out.println("And the converted value is " + convertedValue);
    }

    public static void calcWallPaint() {
        Scanner input = new Scanner(System.in);
        final double squareFeetPerGallons = 350.0;
        final double gallonsPerCan = 1.0;
        System.out.println("Enter wall height (feet):");
        double wallHeight = input.nextDouble();
        System.out.println("Enter wall width (feet):");
        double wallWidth = input.nextDouble();
        double wallArea = wallHeight * wallWidth;
        System.out.println("Wall area: " + (int) wallArea + " square feet");
        double gallonsNeeded = wallArea / squareFeetPerGallons;
        System.out.printf("Paint needed: %.2f gallons\n", gallonsNeeded);
        int cansNeeded = (int) Math.ceil(gallonsNeeded/  gallonsPerCan);
        System.out.println("Cans needed: " + cansNeeded + " can(s)");
        //hello
    }
}
