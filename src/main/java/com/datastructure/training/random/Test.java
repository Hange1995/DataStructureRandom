package com.datastructure.training.random;

import java.util.Set;

public class Test {
    public void primeNumber(int n){
        for (int i=1;i<=n;i++){
            boolean isPrime =true;
            for (int j=2;j<i;j++){
                if (i%j==0) {
                    isPrime=false;
                }
            }
            if (isPrime==true&&i!=1) System.out.println(i);

        }
    }

    public static void main(String[] args) {
        Test test=new Test();
        test.primeNumber(100);
    }
}
