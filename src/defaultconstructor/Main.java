package defaultconstructor;

public class Main {


 int x;  

 
 public Main() {
   x = 235; 
 }

 public static void main(String[] args) {
   Main myObj = new Main(); // Create an object of class Main (This will call the constructor)
   System.out.println(myObj.x); // Print the value of x
 }
}
