// 1)Write a java code to print a number whether it is odd or even 
// 2)Take two numbers as input and print the latrgest number
// 3)Write a program to input principal,time and rate
// 4)Input currency in rupees and output in USD
// 5)To calculate fibonacci series up to n numbers
// 6)To find armstrong number between two given number
// 7)Take name as input and print a greeting msg for that particular name
import java.util.*;
public class First {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        First ob = new First();
        //String s=in.nextLine();
        // System.out.println("Enter a  first number :");
        //int a = in.nextInt();
        // int n=in.nextInt();
        // System.out.println("Enter a  second number :");
        // int b = in.nextInt();
        int p=in.nextInt();
        int t=in.nextInt();
        int r=in.nextInt();
        double ans=ob.isSimpleInterest(p,t,r);
        // double ans=ob.isCurrency(n);
        // int ans=ob.fibonacci(n);
        // System.out.println()
        // String ans = ob.isOddEven(a);
           System.out.println(ans);
        // String ans = ob.isGreater(a,b);
        //   int start=in.nextInt();
        //   int end=in.nextInt();
        //  ob.noofArmStrong(start,end);
        //String ans=ob.greeting(s);
    //System.out.println(ans);         
        in.close();
    }
// 1)Write a java code to print a number whether it is odd or even 
    public String isOddEven(int a){
        if((a&1)==0) return "Even";
        else return "Odd";
    }
// 2) Which is greater
public String isGreater(int a,int b){
    if(a>b) return "a is greater";
    else return "b is greater"; }


// 3) Simple interest
public double isSimpleInterest(int p,int r,int t){
    return (p*t*r)/100;
}
// 4)Input currency in rupees and output in USD
public double isCurrency(int n){
    return 0.012*n;
}
// 5)Fibonacci number
public int fibonacci(int n){
    int a=0;
    int b=1;
    int count=2;
    while(count<=n){
        int temp =b;
        b=a+b;
        a=temp;
        count++;
    }
    return b;
}
// 6)Armstrong number
public  void noofArmStrong(int start,int end){
    for(int i=start;i<=end;i++){
        if(isArmStrong(i)){
            System.out.println(i);
        }
}
}
public boolean isArmStrong(int n){
    int original=n;
    double sum=0;
    while(n>0){
        int rem=n%10;
        n=n/10;
        sum=sum+Math.pow(rem,3);
}
if(sum==original){
    return true;
}
else{
    return false;
}
}
// 7)Take name as input and print a greeting msg for that particular name
public String greeting(String s){
    return"Hello! "+s+"";
}
}

