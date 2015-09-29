import java.util.Scanner;
public class A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
    String song = in.nextLine();
    if (song.length() > 3) {
      while (song.length() > 3 && song.substring(0,3).equals("WUB")) {
        song = song.substring(3);
      }
      while (song.length() > 3 && song.substring(song.length()-3).equals("WUB")) {
        song = song.substring(0,song.length()-3);
      }
      song = song.replace("WUB"," ");
    }
    System.out.println(song);
	}
}
