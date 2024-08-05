package interviewPrep;

//Source code is decompiled from a .class file using FernFlower decompiler.

public class BubbleSort {

public static void main(String[] args) 
{
  int j, temp;
  int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
  for(int i =0; i<arr.length; i++)
  {
   for(j=i+1; j<arr.length;j++)
	  if(arr[i]> arr[j])
     {
        temp= arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
     }
  }

  for(int i=0; i<arr.length;i++)
  {
     System.out.print(arr[i]+ " ");
  }
}
}
