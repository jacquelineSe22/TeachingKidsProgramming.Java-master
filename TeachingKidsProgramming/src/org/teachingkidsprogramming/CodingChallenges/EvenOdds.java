package org.teachingkidsprogramming.CodingChallenges;

import java.util.Scanner;

public class EvenOdds
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter an integer; ");
    int num = sc.nextInt();
    if (num % 2 == 0)
    {
      System.out.println("Even");
    }
    else
    {
      System.out.println("Odd");
    }
  }
}
