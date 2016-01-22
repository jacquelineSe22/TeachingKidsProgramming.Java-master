package org.teachingkidsprogramming.CodingChallenges;

public class TenRowsOfTen
{
  public static void main(String[] args)
  {
    for (int i = 0; i < 10; i++)
    {
      for (int j = 0; j < 10; j++)
      {
        System.out.print(((i * 10) + j + 1) + " ");
      }
      System.out.println();
    }
  }
}