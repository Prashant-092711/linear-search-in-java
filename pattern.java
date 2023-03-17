package company.com;
import java.util.*;
import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        int num[] = new int[5];
        int key;
        Scanner A = new Scanner(System.in);
        for (int i = 0; i < num.length; i++) {
            num[i] = A.nextInt();
        }
        System.out.println("enter the key foe search");
        key=A.nextInt();
        int count=0;
        int time=0;
            for (int i=0;i<num.length;i++){
                if (num[i]==key) {
                count++;
                time++;
                }
            }
        if (count>0){
            System.out.println("key present in Array for "+time+ " times");
        }
        else {
            System.out.println("key not  present in Array");
        }
        }
    }

