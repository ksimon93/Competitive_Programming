import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
public class C {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
    List<Integer> deck1 = new ArrayList<Integer>();
    List<Integer> deck2 = new ArrayList<Integer>();
    Set<State> gameStates = new HashSet<State>();
    int n = in.nextInt();

    int k1 = in.nextInt();
    for (int i = 0; i < k1; i++) {
      deck1.add(in.nextInt());
    }

    int k2 = in.nextInt();
    for (int i = 0; i < k2; i++) {
      deck2.add(in.nextInt());
    }

    int count = 0;
    while (!deck1.isEmpty() && !deck2.isEmpty()) {
      State currState = new State(deck1, deck2);
      if (gameStates.contains(currState)) break;
      gameStates.add(new State(deck1, deck2));
      int val1 = deck1.remove(0);
      int val2 = deck2.remove(0);
      if (val1 > val2) {
        deck1.add(val2);
        deck1.add(val1);
      } else {
        deck2.add(val1);
        deck2.add(val2);
      }
      count++;
    }

    if (deck1.isEmpty()) {
      System.out.print(count + " " + 2);
    } else if (deck2.isEmpty()) {
      System.out.print(count + " " + 1);
    } else {
      System.out.println(-1);
    }
	}

  private static class State {
    public List<Integer> deck1;
    public List<Integer> deck2;

    public State(List<Integer> deck1, List<Integer> deck2) {
      this.deck1 = new ArrayList<Integer>(deck1);
      this.deck2 = new ArrayList<Integer>(deck2);
    }

    @Override
    public boolean equals(Object obj) {
      if (!(obj instanceof State)) return false;
      State other = (State) obj;
      return this.deck1.equals(other.deck1) && this.deck2.equals(other.deck2);
    }

    @Override
    public int hashCode() {
      return deck1.hashCode() + deck2.hashCode();
    }
  }
}
