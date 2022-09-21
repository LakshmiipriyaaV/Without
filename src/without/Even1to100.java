package without;

import java.util.*;
public class Even1to100 {
  public static void main(String[] args) {
    
    System.out.println("Even Numbers from 1 to 100 are :");
    for(int num=1 ; num <= 100 ; num++){
      if(num % 2 == 0){
        System.out.print(""+num+" ");
      }
    }
  }
}