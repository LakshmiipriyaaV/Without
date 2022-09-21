package without;
import java.io.*;

import java.util.concurrent.CountDownLatch;


class Block {

 
 public static void main(String args[])
  throws InterruptedException
 {
  
  CountDownLatch latch = new CountDownLatch(4);

  
  Person p1 = new Person(1500, latch, "PERSON-1");
  Person p2 = new Person(2500, latch, "PERSON-2");
  Person p3 = new Person(3500, latch, "PERSON-3");
  Person p4 = new Person(4500, latch, "PERSON-4");
  Person p5 = new Person(5500, latch, "PERSON-5");

  
  p1.start();
  p2.start();
  p3.start();
  p4.start();
  p5.start();

 
  latch.await();

  
  System.out.println(Thread.currentThread().getName()
      + " has finished his work");
 }
}


class Person extends Thread {

 private int delay;
 private CountDownLatch latch;


 public Person(int delay, CountDownLatch latch,
    String name)
 {
  
  super(name);

  
  this.delay = delay;
  this.latch = latch;
 }

 @Override public void run()
 {
  
  try {
   Thread.sleep(delay);
   latch.countDown();

   
   System.out.println(
    Thread.currentThread().getName()
    + " has finished his work");
  }

 
  catch (InterruptedException e) {
   
   e.printStackTrace();
  }
 }
}
