import java.util.Scanner;
import java.util.function.Function;

class CubeCalculator
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        Function<Integer, Integer> cubeFunction = n -> n * n * n;
        int result = cubeFunction.apply(number);

        System.out.println("The cube of " + number + " is: " + result);
    }
}

