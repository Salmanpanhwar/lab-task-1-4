import java.util.Scanner;

class Main {

public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

System.out.print("Enter marks in Matriculation: ");

int matriculationMarks = scanner.nextInt();

System.out.print("Enter marks in Intermediate: ");

int intermediateMarks = scanner.nextInt();

System.out.print("Enter marks in Test: ");

int testMarks = scanner.nextInt();

double cpn = ((matriculationMarks + intermediateMarks + testMarks) / 300) * 100;

System.out.println("Your CPN is: " + cpn);

}

}