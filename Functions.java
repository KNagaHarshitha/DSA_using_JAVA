import java.util.Scanner;
public class Functions {
    //1) Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
//2) Define a program to find out whether a given number is even or odd.
//3) A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
//4)Write a program to print the sum of two numbers entered by user by defining your own method.
// 5)Define a method that returns the product of two numbers entered by user.
// 6)Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
//7) Define a method to find out if a number is prime or not.
// 8)Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
        // Marks        Grade 
        // 91-100         AA 
        // 81-90          AB 
        // 71-80          BB 
        // 61-70          BC 
        // 51-60          CD 
        // 41-50          DD 
        // <=40          Fail 
// 9)Write a program to print the factorial of a number by defining a method named 'Factorial'. Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.-
        // 4! = 1 * 2 * 3 * 4 = 24 
        // 3! = 3 * 2 * 1 = 6 
        // 2! = 2 * 1 = 2 
        // Also, 
        // 1! = 1 
        // 0! = 1
// 10)Write a function to find if a number is a palindrome or not. Take number as parameter.
// 11)Write a function to check if a given triplet is a Pythagorean triplet or not. (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).
// 12)Write a function that returns all prime numbers between two given numbers.
// 13)Write a function that returns the sum of first n natural numbers.

        public static void main(String[] args) {
               Scanner sc = new Scanner(System.in);
               Functions fs = new Functions(); 

                System.out.println("Enter the n value : ");
                int n = sc.nextInt();
               fs.sumOfNaturalNumbers(n);
        //         System.out.println("Enter the n1 value : ");
        //         int n1 = sc.nextInt();
        //         System.out.println("Enter the n2 value : ");
        //         int n2 = sc.nextInt();
        //        fs.primeNumbers(n1,n2);

        //         System.out.println("Enter a number : ");
        //         int n = sc.nextInt();
        //        fs.isPalindrome(n);

        //        int n = sc.nextInt();
        //        fs.factorialOfANumber(n);


        //        System.out.println("Enter the marks between 1 and 100 only : ");
        //         int marks = sc.nextInt();
        //         fs.gradeOfStudent(marks);
        //        System.out.println("Enter a number : ");
        //        int n=sc.nextInt();
        //        boolean ans = fs.isPrime(n);
        //        System.out.println("The number is prime : " + ans);
        //        System.out.println("Enter the first number : ");
        //        int a = sc.nextInt();
        //        System.out.println("Enter the second number : ");
        //        int b = sc.nextInt();
        //        int ans = fs.multiplyTwoNumbers(a, b);
        //        System.out.println("The product of two numbers is : " + ans);
                // System.out.println("Enter the first number : ");
                // int a = sc.nextInt();
                // System.out.println("Enter the second number : ");
                // // int b = sc.nextInt();
                // int ans = fs.addTwoNumbers(a, b);
                // System.out.println("The sum of two numbers is : " + ans);
        //        System.out.println("Enter your age :  ");
        //        int age = sc.nextInt();
        //        String ans = fs.voteEligibility(age);
        //        System.out.println(ans);
                // System.out.println("Enter a number : ");
                //   int n = sc.nextInt();
                //   String ans = fs.oddEven(n);
                //   System.out.println("Entered number "+n+"  is : "+ans);

        //        System.out.println("Enter the first number : ");
        //        int a = sc.nextInt();
        //        System.out.println("enter the second number : ");
        //        int b = sc.nextInt();
        //        System.out.println("enter the third number : ");
        //        int c = sc.nextInt();
        //        int max =  fs.maxNum(a,b,c);
        //        System.out.println("Maximum number among three numbers is: "+max);
        //        int min =  fs.minNum(a,b,c);
        //        System.out.println("Minimum number among three numbers is: "+min);
        sc.close();
        }
//1) Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
    public int maxNum(int a,int b,int c){
        return Math.max(c,Math.max(a,b));
    }
    public int minNum(int a,int b, int c){
        return Math.min(c,Math.min(a,b));
    }
//2) Define a program to find out whether a given number is even or odd.
    public String oddEven(int n){
        if((n&1)==0){
                return "Even";
        }
        else return "Odd";
    }//3) A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
public String voteEligibility(int age){
        if(age>=18){
                return "Eligible to vote ";
        }
        else return "Not eligible to vote ";
}
//4)Write a program to print the sum of two numbers entered by user by defining your own method.
public int addTwoNumbers(int a,int b){
        return a+b;
}
// 5)Define a method that returns the product of two numbers entered by user.
public int multiplyTwoNumbers(int a,int b){
        return a*b;
}
//7) Define a method to find out if a number is prime or not.
public boolean isPrime(int n){
        if(n==1){
                return false;
        }
        for(int i=2;i<=n/2;i++){
                if(n%i==0){
                        return false;
                }
                
        }
        return true;
}

// 8)Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
        // Marks        Grade 
        // 91-100         AA
        // 81-90          AB 
        // 71-80          BB 
        // 61-70          BC 
        // 51-60          CD 
        // 41-50          DD 
        // <=40          Fail 
public void gradeOfStudent(int n){
        if(n>=91 && n<=100){
                System.out.println("AA");
        }
        else if(n>=81 && n<=90){
                System.out.println("AB");
        }
        else if(n>=71 && n<=80){
                System.out.println("BB");
        }
        else if(n>=61 && n<=70){
                System.out.println("BC");
        }
        else if(n>=51 && n<=60){
                System.out.println("CD");
        }
        else if(n>=41 && n<=50){
                System.out.println("BB");
        }
        else if(n<=40){
                System.out.println("FAIL");
        }
        else{
                System.out.println("Enter valid marks ");
        }
}
// 9)Write a program to print the factorial of a number by defining a method named 'Factorial'. Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.-
        // 4! = 1 * 2 * 3 * 4 = 24 
        // 3! = 3 * 2 * 1 = 6 
        // 2! = 2 * 1 = 2 
        // Also, 
        // 1! = 1 
        // 0! = 1
        public void factorialOfANumber(int n){
                int fact = 1;
                for(int i=1;i<=n;i++){
                    fact = fact * i;
                    
                }
                System.out.println(fact);
            }

// 10)Write a function to find if a number is a palindrome or not. Take number as parameter.
public void isPalindrome(int n){
        int rem,temp,rev;
        temp = n;
         rev=0;
        while(n>0){
                rem = n%10;
                rev = rev*10+rem;
                n = n/10;
        }
        if(temp==rev){
                System.err.println("Palindrome");
        }
        else System.out.println("Not a palindrome");
}
// 12)Write a function that returns all prime numbers between two given numbers.
public void primeNumbers(int n1,int n2){
        for(int i=n1;i<=n2;i++){
                if(isPrime(i)){
                        System.out.println(i);
                }
        }
}
// 13)Write a function that returns the sum of first n natural numbers.
public void sumOfNaturalNumbers(int n){
        int sum = 0;
        for(int i=1;i<=n;i++){
                sum = sum + i;
        }
        System.out.println(sum);
}

}
