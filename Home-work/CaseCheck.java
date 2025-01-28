import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter character: ");
        char ch = sc.next().charAt(0);
        
        String result = (ch >= 'a' && ch <= 'z') ? "Lower case" : (ch >= 'A' && ch <= 'Z') ? "Upper case" : "Not a letter";
        System.out.println(result);
    }
}
