//Basic function to print some numbers
//in a Pell serie.
// author: Carlos Egüez
// 2019

import java.util.Scanner;
public class PellSeries  {

    public static void main(String args[])
    {
	int n,a=1,b=0,c;
    System.out.println("Primeros 25 numeros de la serie: ");
    for(n=1; n<=25; n++)
     {
      c= a + 2*b;
      System.out.print(c+" ");
      a = b;
      b = c;
     }
   }
 }
