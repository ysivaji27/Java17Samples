package org.java.test.June.day4;

import java.util.ArrayList;
import java.util.List;

public class TESTJava {
    public static void main(String[] args) {
        System.out.println( ":"+run(2)+":");
    }
    public static String run(int input) {
        List<String> result = new ArrayList<>();
        generate("",1,input,result);
        return String.join(",",result);
    }
    private static void generate(
            String current,
            int startDigit,
            int remainingDigits,List<String> result){

        if(remainingDigits == 0){
            result.add(current);
            return;
        }
        for(int i = startDigit; i<=9; i++){
            generate(current+i,i,remainingDigits-1,result);
        }
    }
}
