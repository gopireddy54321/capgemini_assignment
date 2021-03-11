package com.cg.ca.lab1;

import java.util.*;
public class E5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a, sum=0;
Scanner n = new Scanner(System.in);
System.out.print("Enter  number- ");  
a = n.nextInt();
for(int i =1 ; i<=a ; i++)
{
	if(i%3 == 0 || i%5 == 0)
	{
		sum+=i;
	}
}

System.out.println(sum);
n.close();
	}

}