//Basic function to print some numbers
//in a Pell serie.
// author: Carlos Egüez
// 2019

import java.util.Scanner;
import java.io.PrintStream;
import java.io.FileNotFoundException;

public class PellSeries  {

    public static void main(String args[]) throws FileNotFoundException
    {
        PrintStream originalOut = System.out;
        PrintStream fileOut = new PrintStream("./PellSerie_output.txt"); 
        System.setOut(fileOut);
        
        int n,a=1,b=0,c;
        fileOut.print("Primeros 25 numeros de la serie: ");
        for(n=1; n<=25; n++)
        {
          c= a + 2*b;
          fileOut.print(c+"\t");
          a = b;
          b = c;
        }
    }
 }
