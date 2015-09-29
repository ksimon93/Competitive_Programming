import java.util.Scanner;
import java.util.Arrays;

public class A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
    String line = in.nextLine();
    String[] nums = line.split("\\+");
    Arrays.sort(nums);
    String sorted = "";
    for (int i = 0; i < nums.length; i++) {
      sorted += nums[i] + "+";
    }
    System.out.println(sorted.substring(0,sorted.length()-1));
	}
}
