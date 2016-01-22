package org.teachingkidsprogramming.CodingChallenges;

import java.util.Scanner;

public class DivisibilityBy3
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter an integer (must be greater than 0); ");
    int num = sc.nextInt();
    if (num < 1)
    {
      System.out.println("Invaild input");
      System.exit(0);
    }
    if (num % 3 == 0)
    {
      System.out.println("Yes");
    }
    else
    {
      System.out.println("No");
    }
  }
}
