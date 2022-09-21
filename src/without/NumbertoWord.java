package without;

import java.util.Scanner;
 
public class NumbertoWord
{ 
public static void main(String[] args)
{
 int num = 0;
 Scanner scanner = new Scanner(System.in);
 System.out.println("Please enter a number(max upto 9 digits)");
 try {
 num = scanner.nextInt();
 if (num == 0) {
 System.out.print("Number in words: Zero");
 } else {
 System.out.print("Number in words: " + number_Word(num));
 }
 } catch (Exception e) {
 System.out.println("Please enter a valid number");
 }
 
 scanner.close();
 }  private static String number_Word(int num) {
 
 String words = "";
 String unitarr[] = { "zero", "one", "two", "three", "four", "five", "six", 
 "seven", "eight", "nine", "ten", "eleven", "twelve",
 "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", 
 "eighteen", "nineteen" };
 String tensarr[] = { "zero", "ten", "twenty", "thirty", "forty", "fifty",
 "sixty", "seventy", "eighty", "ninety" };  if (num == 0) {
 return "zero";
 }
 
 if (num < 0) { 
 
 String numberStr = "" + num; 
numberStr = numberStr.substring(1); 
  
 return "minus " + number_Word(Integer.parseInt(numberStr)); 
 } 

 if ((num / 1000000) > 0) {
 words += number_Word(num / 1000000) + " million ";
 num %= 1000000;
 }
 
 if ((num / 1000) > 0) {
 words += number_Word(num / 1000) + " thousand ";
 num %= 1000;
 }
 
 if ((num / 100) > 0) {
 words += number_Word(num / 100) + " hundred ";
 num %= 100;
 }  if (num > 0) {
 if (num < 20) { 
  words += unitarr[num];
 } else { 
 words += tensarr[num / 10]; 
 if ((num % 10) > 0) {
 words += "-" + unitarr[num % 10];
 } 
 }
 }
 return words;
 }
}
