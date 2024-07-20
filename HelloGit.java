import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloGit {
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to Git Distributed VCS");

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your name: ");
        String name = input.readLine();

        System.out.println("Your name is: " + name);
    }
}