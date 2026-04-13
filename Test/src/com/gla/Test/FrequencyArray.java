package com.gla.Test;
import java.util.*;
public class FrequencyArray {
    public void main(String[] args) {
    int arr[] = {1, 2, 2, 3, 1, 4, 2};
                int n = arr.length;
                boolean number[] = new boolean[n];
                for(int i = 0; i < n; i++) {
                    if(number[i]) continue;
                 int count = 1;
                for(int j = i + 1; j < n; j++) {
                        if(arr[i] == arr[j]) {
                            count++;
                            number[j] = true;
                        }
                    }
                System.out.println(arr[i] + " -> " + count);
                }
            }
        }
