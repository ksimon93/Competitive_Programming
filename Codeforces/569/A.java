import java.util.Scanner;
public class A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
    double T = in.nextInt();
    double S = in.nextInt();
    double q = in.nextInt();
    int starts = 0;
    int time = 0;
    while (true) {
      starts++;
      time = 0;
      while (time < S) {
        time++;
        S += (q-1)/q;
        if (time >= T) {
          System.out.println(starts);
          return;
        }
        //System.out.println("One second passed. Time: " + time + " S: " + S);
      }
      //System.out.println("STARTING OVER");
    }
  }
}
