import java.util.Scanner;
public class Phuongtrinh {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Choose the type of equation to solve:");
System.out.println("1. First-degree equation");
System.out.println("2. System of first-degree equations with two variables");
System.out.println("3. Second-degree equation");
System.out.print("Enter your choice: ");
int choice = scanner.nextInt();
switch (choice) {
case 1:
FirstDegreeEquation(scanner);
break;
case 2:
SystemOfEquations(scanner);
break;
case 3:
SecondDegreeEquation(scanner);
break;
default:
System.out.println("Invalid choice. Choose again!");
break;
}
scanner.close();
}
public static void FirstDegreeEquation(Scanner scanner) {
System.out.println("Solving linear equation ax + b = 0");
System.out.print("Enter a: ");
double a = scanner.nextDouble();
System.out.print("Enter b: ");
double b = scanner.nextDouble();
if (a == 0) {
if (b == 0) {
System.out.println("The equation has infinitely many solutions.");
} else {
System.out.println("The equation has no solution.");
}
} else{
double x = -b / a;
System.out.println("The solution is x = " + x);
}
}
public static void SystemOfEquations(Scanner scanner) {
System.out.println("Solving system of linear equations:");
System.out.println("a11*x + a12*y = b1");
System.out.println("a21*x + a22*y = b2");
System.out.print("Enter a11: ");
double a11 = scanner.nextDouble();
System.out.print("Enter a12: ");
double a12 = scanner.nextDouble();
System.out.print("Enter b1: ");
double b1 = scanner.nextDouble();
System.out.print("Enter a21: ");
double a21 = scanner.nextDouble();
System.out.print("Enter a22: ");
double a22 = scanner.nextDouble();
System.out.print("Enter b2: ");
double b2 = scanner.nextDouble();
double D = a11 * a22 - a21 * a12;
double Dx = b1 * a22 - b2 * a12;
double Dy = a11 * b2 - a21 * b1;
if (D == 0) {
if (Dx == 0 && Dy == 0) {
System.out.println("The system has infinitely many solutions.");
} else {
System.out.println("The system has no solution.");
}
} else {
double x = Dx / D;
double y = Dy / D;
System.out.println("The solution is x = " + x + ", y = " + y);
}
}
public static void SecondDegreeEquation(Scanner scanner) {
System.out.println("Solving quadratic equation ax^2 + bx + c = 0");
System.out.print("Enter a: ");
double a = scanner.nextDouble();
System.out.print("Enter b: ");
double b = scanner.nextDouble();
System.out.print("Enter c: ");
double c = scanner.nextDouble();
if (a == 0) {
System.out.println("This is not a quadratic equation.");
} else {
double delta = b * b - 4 * a * c;
if (delta > 0) {
double x1 = (-b + Math.sqrt(delta)) / (2 * a);
double x2 = (-b - Math.sqrt(delta)) / (2 * a);
System.out.println("The equation has two distinct roots: x1 = " + x1 + ", x2 = " + x2);
} else if (delta == 0) {
double x = -b / (2 * a);
System.out.println("The equation has a double root: x = " + x);
} else {
System.out.println("The equation has no real roots.");
}
}
}
}
