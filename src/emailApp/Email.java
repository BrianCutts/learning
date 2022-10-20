package emailApp;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String department;
    private String password;
    private String alternateEmail;
    private int mailboxCapacity;


    //Generate email with firstname.lastname@department.company.com
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED " + this.firstName + "." + this.lastName);

        // Call a method asking for the department return the department
        this.department = setDepartment();
        System.out.println("Department: " + department);

    }

    //Determine the department (sales, development, accounting) leave blank if none
    private String setDepartment(){

        System.out.print("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code:");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1){
            return "sales";
        } else if (depChoice == 2) {
            return "dev";
        } else if (depChoice == 3) {
            return "acct";
        }else {
            return "";
        }
    }

    //Generate random String for password

    //Change password

    //Set mailbox capacity

    //Define alternate email address

    //Get methods to display name, email and mailbox capacity
}
