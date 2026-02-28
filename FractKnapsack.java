package Greedy_Algo;

import java.util.Arrays;
import java.util.Comparator;

public class FractKnapsack {
    public static void main(String[] args) {
        int val[] = {60,100,120};
        int wt[] = {10,20,30};

        int W = 50;

        double ratio[][] = new double[val.length][2];
        //0th col = idx
        //1st col = ratio

        for (int i=0; i<val.length; i++){
            ratio[i][0] = i;
            ratio[i][1] = val[i]/(double)wt[i];
        }

        Arrays.sort(ratio, Comparator.comparingDouble(o->o[1]));//ascending
        //o[1] = ratio

        int capacity = W;
        int total = 0;

        //use descending
        for (int i=ratio.length-1; i>=0; i--){
            int idx = (int)ratio[i][0];
            if(capacity >= wt[idx]){//pick in bag
                    total+=val[idx];
                    capacity -= wt[idx];
            }
            else{
                //frac item
                total+=(ratio[i][1]*capacity);
                break;
            }
        }
        System.out.println(total);
    }
}
