package com.company;


/*
* A Discrete Mathematics professor has a class of students. Frustrated with their lack of discipline, he decides to cancel class if fewer than some number of students are present when class starts. Arrival times go from on time () to arrived late ().

Given the arrival time of each student and a threshhold number of attendees, determine if the class is canceled.

Input Format

The first line of input contains , the number of test cases.

Each test case consists of two lines.

The first line has two space-separated integers,  and , the number of students (size of ) and the cancellation threshold.
The second line contains  space-separated integers () describing the arrival times for each student.

Note: Non-positive arrival times () indicate the student arrived early or on time; positive arrival times () indicate the student arrived  minutes late.

For example, there are  students who arrive at times . Four are there on time, and two arrive late. If there must be  for class to go on, in this case the class will continue. If there must be , then class is cancelled.

Function Description

Complete the angryProfessor function in the editor below. It must return YES if class is cancelled, or NO otherwise.

angryProfessor has the following parameter(s):

k: the threshold number of students
a: an array of integers representing arrival times
Constraints

Output Format

For each test case, print the word YES if the class is canceled or NO if it is not.

Note
If a student arrives exactly on time , the student is considered to have entered before the class started.

Sample Input

2
4 3
-1 -3 4 2
4 2
0 -1 2 1
Sample Output

YES
NO
Explanation

For the first test case, . The professor wants at least  students in attendance, but only  have arrived on time ( and ) so the class is cancelled.

For the second test case, . The professor wants at least  students in attendance, and there are  who have arrived on time ( and ) so the class is not cancelled.
*
*
*
* */


import com.sun.org.apache.regexp.internal.RE;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

        static String angryProfessor(int k, int[] a) {
            int w=0;
for(int i=0;i<a.length;i++)
{
    if(a[i]<=0)
    {
        w++;
    }

}
if(w<k)
{
    return "YES";
}
else
    return "NO";


        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws IOException {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("test.txt")));

            int t = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int tItr = 0; tItr < t; tItr++) {
                String[] nk = scanner.nextLine().split(" ");

                int n = Integer.parseInt(nk[0]);

                int k = Integer.parseInt(nk[1]);

                int[] a = new int[n];

                String[] aItems = scanner.nextLine().split(" ");
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                for (int i = 0; i < n; i++) {
                    int aItem = Integer.parseInt(aItems[i]);
                    a[i] = aItem;
                }

                String result = angryProfessor(k, a);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            }

            bufferedWriter.close();

            scanner.close();



    }
}
