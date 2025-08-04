/* 14. Longest Common Prefix

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.*/
import java.util.Arrays;
import java.util.Scanner;
class Longestcommonprefix {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String str1=strs[0];
        String str2=strs[strs.length-1];
        int i=0;
        while(i<str1.length()){
            if(str1.charAt(i)==str2.charAt(i)){
                System.out.println("common prefixes are"+" "+str1.charAt(i));
                i++;
            }
            else{
                break;
            }
           
        }
          return i==0?"":str1.substring(0,i);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of elements");
        int n=sc.nextInt();
        sc.nextLine();
        String []strs=new String[n];
        System.out.println("enter the elements");
        for(int i=0;i<n;i++){
            strs[i]=sc.nextLine();
        }
      Longestcommonprefix lcp=new Longestcommonprefix();
      String result=lcp.longestCommonPrefix(strs);
       System.out.println("Longest Common Prefix is: " + result);
    }
}
