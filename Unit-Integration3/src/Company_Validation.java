import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Company_Validation {
    void Checkforcompany()
    {
        String[] Array={"knoldus","tcs","wipro","ibm","coginzent","infosys"};
        //i am using array at the place of database

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your company name to search:");
        String mail=sc.next();
        boolean flag=false;
        for(int i=0;i<5;i++)
        {
            if (Array[i].equals(mail)) {
                flag=true;
                break;
            }

        }
        if (flag)
        {
            System.out.println("company Exist in DB");
        }
        else System.out.println("company Does Not Exist in DB");
    }
    void validateformail()
    {
        final String regex = "^(.+)@(.+)$";
        Scanner sc=new Scanner(System.in);
        List<String> emails = new ArrayList<String>();
        // valid email addresses
        for (int i=0;i<4;i++)
        {
            String mail=sc.next();
            emails.add(mail);
            Pattern pattern = Pattern.compile(regex);
            for (String value : emails) {
                Matcher matcher = pattern.matcher(value);

                System.out.println("The Email address " + value + " is " + (matcher.matches() ? "valid" : "invalid"));
            }
        }
    }
}
