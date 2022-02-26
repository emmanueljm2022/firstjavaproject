package com.company;


public class stringsample {
    public static void main(String[] args) {
        String s1 = "madam";
        char[] chars = s1.toCharArray();
        char[] revs = new char[s1.length()];
        int len =chars.length -1;
        int l= len-1;
        for (int i=0;i<=len;i++){
            revs[len-i]=chars[i];
        }


        String reverse = new String(revs);
        System.out.println("my word is "+s1);
        System.out.println("reversed word is "+reverse);
        System.out.println("is this a palindrome");
        System.out.println(s1.equals(reverse));

  for (int i=0; i<s1.length();i++){
        // System.out.println(chars[i]);
  }

        String s2 = "address";
        String s3= new String("address");
        System.out.println(s1.length());

}
}
