#!/bin/zsh
file=$pwd"$1.java"
echo 'import java.util.Scanner;' >> $file
echo 'public class '$1' {' >> $file
echo $'\t''public static void main(String[] args) {' >> $file
echo $'\t'$'\t''Scanner in = new Scanner(System.in);' >> $file
echo $'\t''}' >> $file
echo '}' >> $file
