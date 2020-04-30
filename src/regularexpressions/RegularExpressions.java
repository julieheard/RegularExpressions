package regularexpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("please type in something, no spaces allowed");
        String userInput = input.next();
        
        /*Email validation:
        
        ^           At the start of the token
        \\w         words
        +           one or more of
        @           the @ sybmol
        [a-zA-Z_]+  any lower case, upper case or underscore chars
        ?           0 or one of
        .           full stop
        [a-zA-Z]    any lower or upper case chars
        {2,3}       the previous bit must be either 2 or 3 characters long
        
        Matches joe@aol.com | ssmith@aspalliance.com | a@b.cc
        Non-Matches joe@123aspx.com | joe@web.info | joe@company.co.uk
        
        */

        Pattern RegExStr = Pattern.compile("^\\w+@[a-zA-Z_]+?.[a-zA-Z]{2,3}");

        Matcher m = RegExStr.matcher(userInput);

        //if input matches pattern
        if(m.matches()){
            System.out.println("that is a match");
        }
        else{
            System.out.println("no match");
        }
        
    }

}
