import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Year;
import java.util.Scanner;

public class view_results {
    view_results(){
        System.out.println("----View Result----");
        System.out.println("Current GPA: ");
        System.out.println("No.of subjects: ");
        System.out.println("Total Credits: ");


        System.out.println("To view records:");
        System.out.println("1. Year 1");
        System.out.println("2. Year 2");
        System.out.println("3. Year 3");
        System.out.println("4. Year 4");
        System.out.println();
        System.out.println("0. Back");
        System.out.println();
        System.out.println("Enter your choice: ");

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();


        switch(number){
            case(1):/*print year 1 results*/ ;
            case(2):/*print year 2 results*/ ; 
            case(3):/*print year 3 results*/ ;
            case(4):/*print year 4 results*/ ;
        }
        input.close();

        System.out.println("To delete your records press d");
        System.out.println("To go back press 0");

        System.out.println("Enter your choice:");
        Scanner input2 = new Scanner(System.in);



    }
}


