/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lafuente_4_datatypes;


/**
 *
 * @author Kristine
 */
public class Lafuente_4_datatypes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //space for comments
        //used to explain code
        //code explanation is an expectation 
        
        int i = 51;
        float a = 7.11f;
        double b = 11.0;
        short c = 100;
        char d1 = '1';
        char d2 = 'a' ;
        char d3 = 122;
        String e = "why yes";
        boolean f = false;
        boolean g = i % 2 == 0;
    
    
    

    /*
here we will look at some mathematical operators 
*/
// + this adds two numbers and more
// - this subtracts two numbers and more
// * this multiplies two numbers and more
// / this divides two numbers and more
// % this is module. shows you the remainder

System.out.println(i + " an integer");
System.out.println(a + " a float");
System.out.println(b + " a double");
System.out.println(c + " a short");
System.out.println(d1 + " a char");
System.out.println(d3 + " a char");
System.out.println(e + " a string");
System.out.println(f + " a boolean");
for(i = -123;i <123; i++) {
    System.out.println(i % 4 ==0);
}
/*% checks for remainder
// 1 % i checks if a number in
//even or odd*/
// i = 0;
// a = 0;
// e = "ninja";
// System.out.println(e + i +" an /" + " a string plus an integer");    
        
// a = 7.11f;
// b = 11.0;
// system.out.println(a + b "a float/" + " a double");
//

    for (i = 0; i < 500; i++){
         /*if is a conditional (flow) statement. If a condition is true the 
        following command will be executed */
        if (i % 2 == 0) {
            System.out.println(i + " is even");
        } else {
            System.out.println(i + " is prime");
        }
         
            
    }
    }
}
        