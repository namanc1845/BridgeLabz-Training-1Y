package com.gla.Test;
import java.util.*;
public class RotationElements {
    public void main(String[] args){
       int arr[] = {10,20,30,40,50,60};
                int k = 3;
                int n = arr.length;
                k = k % n;
                for(int i = k; i < n; i++) {
                    System.out.print(arr[i] + " ");
                }
                for(int i = 0; i < k; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
                for(int i = n - k; i < n; i++) {
                    System.out.print(arr[i] + " ");
                }
                for(int i = 0; i < n - k; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
        }

