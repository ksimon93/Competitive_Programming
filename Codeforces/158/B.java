import java.util.Scanner;
public class B {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int count = 0;
    int[] groups = new int[5];
    for (int i = 0; i < n; i++) {
      groups[in.nextInt()]++;
    }

    // handles all 4 groups
    count += groups[4];

    // handle all 1 and 3 pairs
    groups[1] -= groups[3];
    count += groups[3];

    // handle all 2 and 2 pairs
    count += groups[2]/2;

    // handle potential two 1s and single 2 grouping if 2s were odd
    if (groups[2]%2 == 1) {
      groups[1] -= 2;
      count++;
    }

    // handle remaining 1s if left
    if (groups[1] > 0) {
      count += groups[1]/4;
      if (groups[1]%4 != 0) count++;
    }
    
    System.out.println(count);
	}
}
