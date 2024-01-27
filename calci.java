import java.util.Scanner;
public class calci{
public static int add(int a,int b){    //addition of two numbers
int sum=a+b;
return sum;
}
public static int sub(int a, int b){    //for subtraction of two numbers
int subtract=a-b;
return subtract;
}
public static int mult(int a,int b){      //for multiplication of two numbers
int mult=a*b;
return mult;
}
public static float divide(float a,float b){    //for division of two numbers
if(b!=0){
float div=a/b;
return div;
}
else{
return -1;   // returning -1 denotes false result or error
}
}
public static float mod(float a,float b){     //to find modulus(reminder)
float mod=a%b;
return mod;
}
public static double logarithm(double num, double base){    // to find log
if(num>0 && base>1){
double ans=Math.log(num)/Math.log(base);
return ans;
}
else{
return -1;    //returns error
}
}
public static float square(float a){   // to find square
float result=a*a;
return result;
}
public static double squareroot(double num){   // to find squareroot
if(num>=0){
double squareroot=Math.sqrt(num);
return squareroot;}
else{
return -1;    // to indicate error
}
}
public static void main(String[] args){
System.out.print("choose 1 for addition; 2 for subtraction; 3 for multiplication; 4 for division; 5 for modulus; 6for log; 7 forfinding square of number and 8 forsquareroot \n");
Scanner sc = new Scanner(System.in);
int option = sc.nextInt();
switch(option){
case 1:
int addition=add(7,8);
System.out.println(addition);

break;
case 2:
int subtraction= sub(9,5);
System.out.println(subtraction);
break;

case 3:
int multiplication=mult(7,8);
System.out.println(multiplication);
break;
case 4:
float division=divide(7,8);
System.out.println(division);
break;
case 5:
float modulus=mod(8,6);
System.out.println(modulus);
break;
case 6:
double log=logarithm(6.0,8.4);
System.out.println(log);
break;
case 7:
float squareofnum=square(72);
System.out.println(squareofnum);
break;
case 8:
double sqrt=squareroot(16.0);
System.out.println(sqrt);
break;
default:
System.out.println("invalid number entered");
break;
}
}
}
