package com.company;
import javax.swing.text.html.MinimalHTMLWriter;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr = new int[5];
        Scanner s= new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        int small= arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=small){
                small=arr[i];
            }
        }
        System.out.println(small);
    }
}
