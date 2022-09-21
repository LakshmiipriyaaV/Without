package without;


import java.io.*;

class PositiveNegative {


static String checkPosNeg(int x)
{


if (x > 0)
return "Positive";

else if (x < 0)
return "Negative";

else
return "zero";
}


public static void main(String[] args)
{

int firstNumber = -912;
System.out.println(firstNumber + " is "
   + checkPosNeg(firstNumber));
}
}

