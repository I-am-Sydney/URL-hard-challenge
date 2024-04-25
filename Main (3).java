import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a URL:");
    String url = scanner.nextLine();
    
    if (url.charAt(0) == 'g') {
        System.out.println("You get access to a special level.");
    } else {
        System.out.println("No special level for you.");
    }
       
System.out.println("Enter the exit:");
    String exit = scanner.nextLine();

    if (exit.equals("Home")) {
        System.out.println("You are home.");
    } else {
        System.out.println("Try again.");
    }
  }
}
