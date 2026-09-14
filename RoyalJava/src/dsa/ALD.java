package dsa;
import java.util.ArrayList;
import java.util.Scanner;

public class ALD{

    public static void main(String args[]){

        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int num;

        for(int i = 1; i < 6; i++){

            System.out.print("Enter a Number : ");
            num = sc.nextInt();
            list.add(num);

        }//end of for

        System.out.println(list);

    }//end of main

}