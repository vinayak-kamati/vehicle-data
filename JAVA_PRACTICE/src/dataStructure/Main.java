package dataStructure;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> A = new ArrayList<>();
        A.add(1);A.add(4);A.add(5);

        List<Integer> B = new ArrayList<>();
        B.add(5);B.add(4);B.add(1);
        int N = 3;
        int output =0;
        int i =0;
        for (int j = 0; j <= N; j++){
            if(j>0){
                i = N-1;
            }
            output += A.get(i)*j + B.get(i)*(N-j);
            i++;
        }
        System.out.println(output);
    }
}
