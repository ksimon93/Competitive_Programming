#!/bin/zsh
file=$pwd"$1.java"
echo '/*' >> $file
echo 'ID: kevin.s4' >> $file
echo 'LANG: JAVA' >> $file
echo "TASK: $1" >> $file
echo '*/' >> $file
echo 'import java.io.*;' >> $file
echo 'import java.util.*;' >> $file
echo 'public class '$1' {' >> $file
echo $'\t''public static void main(String[] args) throws IOException {' >> $file
echo $'\t'$'\t''BufferedReader f = new BufferedReader(new FileReader(""));' >> $file
echo $'\t'$'\t''PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("")));' >> $file
echo $'\t'$'\t''StringTokenizer st = new StringTokenizer(f.readLine());' >> $file
echo $'\t'$'\t''out.close();' >> $file
echo $'\t'$'\t''System.exit(0);' >> $file
echo $'\t''}' >> $file
echo '}' >> $file
