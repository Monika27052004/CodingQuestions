import java.util.Scanner;
class ReverseNumber 
{
public static void main(String args[])
{
int num;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number to reverse");
num = sc.nextInt();
int reverseNum = 0;
while ( num!=0)
{
int digit = num%10;
reverseNum = reverseNum*10 + digit;
num = num/10;
}
System.out.println("Reverse number is+" +reverseNum);
}
}

