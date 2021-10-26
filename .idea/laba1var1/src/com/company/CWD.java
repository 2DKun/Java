package com.company;

public class CWD {
    private int sum;
    private int[] arr;
    public CWD(int n){
        arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=i;
        }
    }
    public int MFor(){
        sum=0;
        for(int i=0; i< arr.length; i++){
            sum+=arr[i];
        }
        return sum;
    }
    public int MWhile(){
        sum=0;

        int i=0;
        while(i<arr.length){
            sum+=arr[i];
            i++;
        }
        return sum;
    }
    public int MDoWhile(){
        sum=0;
        int i=0;
        do{
            sum+=arr[i];
            i++;
        }while(i<arr.length);
        return sum;
    }
    public String toString(int sum){
        return "the sum of the array is "+sum;

    }
}
