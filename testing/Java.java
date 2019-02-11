package com.capgemini.junit.testing;

public class Java {
int  Squares(int x)
{
	
	int y= x*x;
	return y; 
}

int max(int arr[])
{
int max=0;
for(int i=0;i<arr.length;i++)
{
	if(max<arr[i])
	{
		max= arr[i];
	}
	
}
return max;
}
}
