Assignment: Build a Java Utility Library & Push to GitHub
Objective
This assignment helps students practice core Java programming concepts such as classes, methods, arrays, strings, and basic Object-Oriented Programming principles. Students will also learn how to upload and manage their code using GitHub.
Assignment Requirements
• Create a small Java Utility Library project.
• Implement reusable utility methods for Strings and Mathematical operations. • Test the utility methods using a Main class.
• Push the project to a GitHub repository.
• Include a README.md file explaining the project.
Project Structure
JavaUtilityLibrary
■
■■■ src
■ ■■■ utils
■ ■ ■■■ StringUtils.java
■ ■ ■■■ MathUtils.java
■
■■■ Main.java
■
■■■ README.md
Part 1: String Utility Class
Create a class named StringUtils that contains reusable methods for performing common string operations.
Example Methods:
• reverse(String str) – Reverse a string
• isPalindrome(String str) – Check if a string is palindrome
• countWords(String str) – Count words in a sentence
• convertToUpper(String str) – Convert string to uppercase
• removeSpaces(String str) – Remove spaces from string
Example Implementation:
public class StringUtils {
public static String reverse(String str) {
String reversed = "";
for(int i=str.length()-1;i>=0;i--){
reversed = reversed + str.charAt(i);
}
return reversed;
}
public static boolean isPalindrome(String str){
String reversed = reverse(str);
return str.equalsIgnoreCase(reversed);
}
}
Part 2: Math Utility Class
Create a class called MathUtils which contains methods for common mathematical operations.
Example Methods:
• factorial(int num) – Calculate factorial
• isPrime(int num) – Check if a number is prime
• findMax(int a int b) – Find maximum of two numbers
• sum(int a int b) – Return sum of two numbers
Example Implementation:
public class MathUtils {
public static int factorial(int num){
int result = 1;
for(int i=1;i<=num;i++){
result = result * i;
}
return result;
}
public static boolean isPrime(int num){
if(num <= 1){
return false;
}
for(int i=2;i<num;i++){
if(num % i == 0){
return false;
}
}
return true;
}
}
Part 3: Main Class for Testing
import utils.StringUtils;
import utils.MathUtils;
public class Main {
public static void main(String[] args) {
System.out.println(StringUtils.reverse("Selenium"));  System.out.println(StringUtils.isPalindrome("madam"));
System.out.println(MathUtils.factorial(5));
System.out.println(MathUtils.isPrime(7));
}
}
Part 4: GitHub Submission Steps
• Create a GitHub account if you do not have one.
• Create a new repository (example: java-utility-library).
• Initialize Git in your project folder.
• Add and commit your code.
• Push the project to GitHub.
Git Commands:
git init
git add .
git commit -m "Initial commit - Java Utility Library"
git branch -M main
git remote add origin <repository-url>
git push -u origin main
Part 5: README File
Students must create a README.md file explaining the project. The README should include project description, list of utility methods, and example usage.
Submission Instructions • Submit the GitHub repository link. • Ensure all code compiles and runs. • Include the README file in the repository.
