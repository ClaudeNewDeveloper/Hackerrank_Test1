/*
 Task 
Write a Person class with an instance variable, age, and a constructor that takes an integer,initialAge, as a parameter. 
The constructor must assign initialAge to age after confirming the argument passed as initialAge is not negative; if a 
negative argument is passed as , the constructor should set  to  and print . In addition, you must write the following 
instance methods:

yearPasses() should increases the  instance variable by 1.
amIOld() should perform the following conditional actions:
If age < 13 , print "You are young..."
If  age >= 13 and age < 18, print "You are a teenager..."
Otherwise, print "You are old"
 */

package hackerranktest4;

import java.util.Scanner;

/**
 *
 * @author besthon1
 */
public class Person {
    
    public int age;
    
    public Person(int initialAge)
    {
       if(initialAge > 0)
       { 
            this.age = initialAge; 
       }
       
       else 
       {    //set the age to zero because a negative age was entered
           System.out.println("Age is not valid, setting age to 0");
           this.age = 0;
       }
    }
    
    public void amIOld()
    {
       if (age >=0 && age < 13) 
       {    
           System.out.println("You are young."); 
       }
       
      else if (age >= 13 && age < 18)
       {
         System.out.println("You are a teenager.");   
       }
      else if (age >= 18)
       {  
          System.out.println("you are old.");
       }
    }
    
    public void yearPasses()
    {
      age++;  
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        
        int userInput = scanner.nextInt();
        
       /* ;*/
        
        for(int i = 0; i < userInput; i++)
        { 
            int age = scanner.nextInt();
            Person person = new Person(age);        
            person.amIOld();
        
            for(int j = 0; j < 3; j++ )
            {
                 person.yearPasses();
            }
            
            person.amIOld();
           
        }
        
        
    }
    
}
