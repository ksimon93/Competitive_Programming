/*
ID: kevin.s4
LANG: JAVA
TASK: gift1
*/

import java.util.*;
import java.io.*;

class gift1 {
  public static void main(String[] args) throws IOException {
    BufferedReader f = new BufferedReader(new FileReader("gift1.in"));
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("gift1.out")));
    int NP = Integer.parseInt(f.readLine());
    String[] names = new String[NP];
    Map<String, Integer> map = new HashMap<String, Integer>();
    
    for (int i = 0; i < NP; i++) {
      String name = f.readLine();
      names[i] = name;
      map.put(name, 0);
    }

    for (int i = 0; i < NP; i++) {
      String giver = f.readLine();
      String[] nums = f.readLine().split(" ");
      int spent = Integer.parseInt(nums[0]);
      int people = Integer.parseInt(nums[1]);
      if (people == 0) continue;
      int perPerson = spent/people;
      int remaining = spent%people;
      int giverCash = map.get(giver);
      giverCash += remaining-spent;
      map.put(giver, giverCash);
      for (int j = 0; j < people; j++) {
        String receiver = f.readLine();
        int receiverCash = map.get(receiver);
        receiverCash += perPerson;
        map.put(receiver, receiverCash);
      }
    }
    for (String name : names) {
      out.println(name + " " + map.get(name));
    }
    
    out.close();
    System.exit(0);
  }
}
