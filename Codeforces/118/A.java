import java.util.Scanner;

public class A {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String input = in.nextLine();
    System.out.println(transform(input));
  }

  private static String transform(String input) {
    String temp = "";

    // delete vowels
    for (char c : input.toLowerCase().toCharArray()) {
      if (isConsonant(c))
        temp += c;
    }

    String answer = "";
    temp = temp.toLowerCase();
    // add periods
    for (char c : temp.toCharArray()) {
      answer += "." + c;
    }
    return answer;
  }

  private static boolean isVowel(char c) {
    return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y';
  }

  private static boolean isConsonant(char c) {
    return !isVowel(c);
  }
}
