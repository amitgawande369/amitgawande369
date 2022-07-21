import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

//java 8

public class Solution {
    public static void main(String[] args) throws IOException {
       Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
      int test = -100;
      for (int a = 0; a < 4; a++) {
          for (int b = 0; b < 4; b++) {
              int count = 0;
              count += arr[a][b] + arr[a][b+1] + arr[a][b+2] + arr[a+1][b+1] + arr[a+2][b]
                      + arr[a+2][b+1] + arr[a+2][b+2];
          if (count > test) {
              test = count;
          }
          }
      }
      System.out.println(test);
    }
}
