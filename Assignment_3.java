import java.util.Scanner;
class Assignment_3 {
    public static void main(String[] args) {
    
//problem 1. What is wrong with the following piece of code?
/*
int i = 10;
while (i < 5) {
i++;
System.out.println(i);
}
System.out.println("as 10 is not smaller than 5, it will not print i");
*/

// problem 2. Write a condition that will print "passed" if a variable called result is greater than 40 and"failed" otherwise.

 int result=60; 
if(result>40)
{
System.out.println("passed");
}
else
{
System.out.println("failed");
}

//problem 3. How many exclamation marks will the following loop print

/* for (int i = 0; i < 10; i++) {
System.out.println('!');
}
System.out.println("10 exclamation marks" );
*/

/* problem 4. rewrite using for loop
int number = 10
while (number <15) {
System.out.println("*");
number++;
}
*/
/*
int number;
for(number=10;number<15;number++)
{
System.out.println("*");
} 
*/

//problem 5. Assume get number(); returns a number by a user. what //will following code do..
/*
int i = getNumber();

while (i < 10) {
i++;                           //6
int j = getNumber();       //1 /0
if (j == 0) 
{break;}
else if (j == 1) 
{continue;}
System.out.println(i);
}
System.out.println("finished");
}

public static int getNumber()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number");
int x=sc.nextInt();
return x;        //5
}
*/

//problem 6. Rewrite the following using a switch statement. 

/*
int i;
Scanner s = new Scanner(System.in);
System.out.println("Enter value of i");

   i= s.nextInt();

switch(i)
{
case 10: { System.out.println("Congratulations you have full marks"); 
             break;}
case 9: { System.out.println("Congratulations you have almost full marks"); 
             break;}
case 8: { System.out.println("Congratulations you have done very well"); 
             break;}
case 7: { System.out.println("Congratulations you have done well"); 
             break;}
case 6: { System.out.println("You are doing alright but could study more"); 
             break;}
case 5: { System.out.println("You only got half marks, you need to do more"); 
             break;}
case 4: { System.out.println("You got less than half marks, you need to do more"); 
             break;}
case 3: { System.out.println("You have got low marks, see a teacher"); 
             break;}
case 2: { System.out.println("You have got very low marks, see a teacher"); 
             break;}
case 1: { System.out.println("You only got 1 mark, see a teacher"); 
             break;}
default: { System.out.println("You have failed abysmally");
          break;}

} */

/*problem 7. Assume getnumber(); code do? returns a number entered by a user. What does the following piece of code do?

ans==> 1. it will print the value of i user give(once) without checking condition.
       2. it will check condition and then print.
*/


// problem 8. print --> Hello + name

// problem 9. for loop that print no. from 10 to 20
/*
int i;
for(i=11;i<20;i++)
{
System.out.println(i);
}
*/

//problem 10. use of assignment operator instead of relational operator

/* problem 11. Assume getnumber(); returns a number entered by a user. Write some code using a while loop that echos whatever number the user enters unless they enter 0 in which case the program exits. Could you do this with a for loop? --> no
*/

/*
problem 12. What does the following piece of code do:
if ((i < 10) || (i == 15)) {
i++;
System.out.println(i);
}

ans --> will print till 1) i is smaller than 10 and when i is equal to 15
                        
*/

/*
problem 13. Write a Java program to display the multiplication table of a given number. The program should ask the user to enter a number and then use a for loop to display the multiplication table of that number from 1 to 10.
*/
/*
Scanner sc = new Scanner(System.in);
System.out.println("Enter number");

     int  x   = sc.nextInt();
for ( i=1;i<=10;i++)
{
   int t=x*i;
System.out.println(x+"*"+i+"="+t);
} 
*/

/* problem 14. Write a Java program to find the factorial of a number. The program should ask the user to enter a number and then use a while loop to calculate and display the factorial of that number
*/
/*
Scanner sc = new Scanner(System.in);
System.out.println("Enter number");

     int  x   = sc.nextInt();
int fact = 1;
for( i=1;i<=x;i++)
{
fact = fact * i;
}
  System.out.println(fact);
*/


 /*
problem 15. Write a Java program to calculate the sum of digits of a number. The program should ask the user to enter a number and then use a do-while loop to calculate and display the sum of digits of that number.
*/
/*
Scanner sc = new Scanner(System.in);
System.out.println("Enter number");

     int  num   = sc.nextInt();

// num = 479
int sum = 0;
do{
 sum = sum + (num%10) ;    //9 --> last digit
 num = (num/10);           // 4 --> remove last digit
} while (num>0);
  System.out.println(sum);
*/


/* problem 16. Write a Java program to check whether a number is prime or not. The program should ask the user to enter a number and then use if-else statements to check and display whether the number is prime or not.
*/

//prime number ia only divisible by 1 and itself--> count 2
/*
Scanner sc = new Scanner(System.in);
System.out.println("Enter number");
     int  num   = sc.nextInt();
int count = 0;
for(int i=2;i<num;i++)
 {
   if(num%i == 0)
    { 
   count++;
//System.out.println("count : "+count);

    // break; 
      }
}

  if(count==0){
System.out.println("The number is a prime number");
}
else
{
System.out.println("The number is not a prime number");
}
*/

/* problem 17. Write a Java program to display the name of a month based on its number. The program should ask the user to enter a number (1 to 12) representing a month and then use a switch-case statement to display the name of the corresponding month.
*/
/*
int i;
Scanner s = new Scanner(System.in);
System.out.println("Enter the number");

   i= s.nextInt();

switch(i)
{
case 1: { System.out.println("January"); 
             break;}
case 2: { System.out.println("February"); 
             break;}
case 3: { System.out.println("March"); 
             break;}
case 4: { System.out.println("April"); 
             break;}
case 5: { System.out.println("May"); 
             break;}
case 6: { System.out.println("June"); 
             break;}
case 7: { System.out.println("July"); 
             break;}
case 8: { System.out.println("August"); 
             break;}
case 9: { System.out.println("September"); 
             break;}
case 10: { System.out.println("October"); 
             break;}
case 11: { System.out.println("November");
          break;}
case 12: { System.out.println("Deceember");
          break;}
default: { System.out.println("You entered invalid number");
          break;}
} 
*/


/* problem 18. Write a Java program for a simple calculator that performs addition, subtraction, multiplication, and division. The program should ask the user to enter two numbers and then ask
the user (or hardcode the value) to choose an operation (addition, subtraction, multiplication, or division) using a menu. Use a switch-case statement to perform the selected operation and display the result. If the user selects an invalid operation, display an error message.
*/

//int i=2;
Scanner s = new Scanner(System.in);
System.out.println("Enter the first number");
 int x= s.nextInt();
System.out.println("Enter the second number");
int y= s.nextInt();

System.out.println("for addition press 1, for subtraction press 2, for multiplication press 3 and for division press 4");
int i= s.nextInt();


switch(i)
{
case 1:
{
  int sum = x + y;
 System.out.println("The addition is : "+sum);
break;
}

 case 2:
{
 int sub = x - y;
 System.out.println("The Subtraction is : "+sub);
break;
}

case 3:
{
 int pro = x * y;
 System.out.println("The multiplication is : "+pro);
break;
}
case 4:
{
 int div = x/y;
 System.out.println("The division is : "+div);
break;
}
  
}




















}
}