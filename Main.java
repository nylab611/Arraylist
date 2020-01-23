import java.util.ArrayList;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  Scanner n = new Scanner(System.in);
  ArrayList<Integer> nums= new ArrayList<Integer>();
  for(int i = 0; i < 10; i++){
  int num = s.nextInt();
  nums.add(num);
  }
  for(int i = 0; i < num.length; i++){
    if(num1==nums[i]){
      System.out.println("That number is in your array");
    }
  }
  System.out.println(nums);
  }
}