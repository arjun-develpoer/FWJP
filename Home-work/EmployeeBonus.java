import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter years of experience: ");
        int exp = sc.nextInt();
        
        double bonus = (exp > 20) ? salary * 0.20 : salary * 0.10;
        System.out.println("Bonus: " + bonus);
    }
}
