package without;

import without.Bank;
import without.BankA;
import without.BankB;
import without.BankC;

public class AbstractBank {
public static void main(String[] args) {
BankA bA = new BankA();
bA.getBalance();
BankB bB = new BankB();
bB.getBalance();
BankC bC = new BankC();
bC.getBalance();
}
}
abstract class Bank{
public abstract void getBalance();
}
class BankA extends Bank{
@Override
public void getBalance(){
System.out.println("Deposited: $100 ");
}
}
class BankB extends Bank{
@Override
public void getBalance(){
System.out.println("Deposited: $150 ");
}
}
class BankC extends Bank{
@Override
public void getBalance(){
System.out.println("Deposited: $200 ");
}
}

