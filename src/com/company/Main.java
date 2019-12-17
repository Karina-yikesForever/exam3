package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.HashSet;


public class Main {

    public static void main(String[] args) {

        HashSet<Integer>list=new HashSet<>();
        int[] array = new int[100];
        for (int i = 0; i <= 100; i++) {
if(isSquare(i)){
    list.add(i);
    if (i%5==0||i%2==0);
    list.add(i);
}
            System.out.println(list);
        }
    }
static boolean isSquare(int num){
        int temp=(int) Math.sqrt(num);
        temp=temp*temp;
        return num==temp;
}

}



