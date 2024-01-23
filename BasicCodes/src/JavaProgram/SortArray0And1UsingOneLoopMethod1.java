package JavaProgram;

import java.util.Arrays;

public class SortArray0And1UsingOneLoopMethod1 {

    public static void main(String[] args) {

        int[] a= {0,1,1,1,0,1,0,1,1,0,0};
        int i = 0;
        int j = a.length-1;

        while(i<=j){
            if(a[i]==0) i++;
            else if(a[j]==1) j--;
            else if(a[i]==1 && a[j]==0){
                a[i]=0;
                a[j]=1;
                i++;
                j--;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
