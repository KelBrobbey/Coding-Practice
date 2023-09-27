/*
This file is being used to solve Bathi's official bootcamp problem sets. Solving
Set 7, starting on 09/19/2023
*/
package mark_one;
import java.util.*;
import java.lang.*;
import java.io.*;

public class SetSeven{
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x) {val = x; next = null;}
    }
    public static String printList(ListNode head){
        String answer = "[";
        ListNode curr = head;
        while(curr != null){
            if(curr.next != null) answer += curr.val + ", ";
            else if(curr.next == null) answer+= curr.val + "]";
            curr = curr.next;
        }
        if(answer.equals("[")) answer += "]";
        return answer;
    }
    
    public static void main(String[]args){
        ListNode oneA = new ListNode(1);
        ListNode oneB = new ListNode(0);
        ListNode oneC = new ListNode(1);
        oneA.next = oneB;
        oneB.next = oneC;
        ListNode oneD = new ListNode(0);
        System.out.println("First Problem, convertListToBinary: " + convertListToBinary(oneD));
        
        ListNode twoA = new ListNode(1);
        ListNode twoB = new ListNode(2);
        ListNode twoC = new ListNode(3);
        ListNode twoD = new ListNode(4);
        ListNode twoE = new ListNode(5);
        twoA.next = twoB;
        twoB.next = twoC;
        twoC.next = twoD;
        twoD.next = twoE;
        System.out.println("Second Problem, reverseList: " + printList(reverseList(twoA)));
        
        String three = "LLLLRRRR";
        System.out.println("Third Problem, balancedStrings: " + balancedStrings(three));
        
        String four = "())";
        System.out.println("Fourth Problem, validParentheses: " + validParentheses(four));
        
        int[] five = {1, 2, 1};
        System.out.println("Fifth Problem, getConcatenation: " + Arrays.toString(getConcatenation(five)));
        
        ListNode sixA = new ListNode(1);
        ListNode sixB = new ListNode(2);
        ListNode sixC = new ListNode(3);
        ListNode sixD = new ListNode(3);
        ListNode sixE = new ListNode(4);
        ListNode sixF = new ListNode(4);
        ListNode sixG = new ListNode(5);
        sixA.next = sixB;
        sixB.next = sixC;
        sixC.next = sixD;
        sixD.next = sixE;
        sixE.next = sixF;
        sixF.next = sixG;
        System.out.println("Sixth Problem, removeDuplicatesII: " + printList(removeDuplicatesII(sixA)));
        
        String[] seven = {"gin","zen","gig","msg"};
        System.out.println("Seventh Problem, uniqueMorseCode: " + uniqueMorseCode(seven));
        
        ListNode sevenA = new ListNode(1);
        ListNode sevenB = new ListNode(2);
        ListNode sevenC = new ListNode(3);
        ListNode sevenD = new ListNode(4);
        ListNode sevenE = new ListNode(5);
        ListNode sevenF = new ListNode(6);
        ListNode sevenG = new ListNode(7);
        ListNode sevenH = new ListNode(8);
        ListNode sevenI = new ListNode(9);
        ListNode sevenJ = new ListNode(10);
        ListNode sevenK = new ListNode(11);
        //ListNode sevenL = new ListNode(12);
        //ListNode sevenM = new ListNode(13);
        sevenA.next = sevenB;
        sevenB.next = sevenC;
        sevenC.next = sevenD;
        sevenD.next = sevenE;
        sevenE.next = sevenF;
        sevenF.next = sevenG;
        sevenG.next = sevenH;
        sevenH.next = sevenI;
        sevenI.next = sevenJ;
        sevenJ.next = sevenK;
        //sevenK.next = sevenL;
        //sevenL.next = sevenM;
        //System.out.println(printList(sevenA));
        System.out.println("Eigth Problem, deleteNodes: " + printList(deleteNodes(sevenA, 1, 3)));
        
        ListNode nineAa = new ListNode(9);
        ListNode nineAb = new ListNode(9);
        ListNode nineAc = new ListNode(9);
        ListNode nineAd = new ListNode(9);
        ListNode nineAe = new ListNode(9);
        ListNode nineAf = new ListNode(9);
        ListNode nineAg = new ListNode(9);
        ListNode nineBa = new ListNode(9);
        ListNode nineBb = new ListNode(9);
        ListNode nineBc = new ListNode(9);
        ListNode nineBd = new ListNode(9);
        nineAa.next = nineAb;
        nineAb.next = nineAc;
        nineAc.next = nineAd;
        nineAd.next = nineAe;
        nineAe.next = nineAf;
        nineAf.next = nineAg;
        nineBa.next = nineBb;
        nineBb.next = nineBc;
        nineBc.next = nineBd;
        System.out.println("Ninth Problem, Add Two Numbers: " + printList(addTwoNumbers(nineAa, nineBa)));
        
        String[] tenA = {"ab", "c"};
        String[] tenB = {"a", "bc"};
        System.out.println("Tenth Problem, Two Array Strings Equivalence: " + arrayStringsAreEqual(tenA, tenB));
        
        String eleven = "leetcode";
        System.out.println("Eleventh Problem, Pangram: " + pangram(eleven));
        
        String twelve = "(al)G(al)()()G";
        System.out.println("Twelveth Problem, Goal Parser Information: " + goalParser(twelve));
        
        String thirteen = "2[abc]3[cd]ef";
        System.out.println("Thirteenth Problem, Decode String: " + decodeString(thirteen));
        
        int fourteenA = 1;
        int fourteenB = 2;
        System.out.println("Fourteenth Problem, Add Two Integers: " + addTwoIntegers(fourteenA, fourteenB));
    }
    
    //Problem #1: Convert Binary Number in a LinkedList to an Integer, Leetcode Problem #1290
    public static int convertListToBinary(ListNode head){
        if(head == null && head.next == null) return 0;
        if(head.next == null) return head.val;
        int result = head.val;
        ListNode curr = head.next;
        while(curr != null){
            result = result * 2 + curr.val;
            curr = curr.next;
        }
        return result;
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(1) -> Constant
        */
    }
    
    //Problem #2: Reverse LinkedList, Leetcode Problem #206
    public static ListNode reverseList(ListNode head){
        if(head == null) return null;
        ListNode prev = null;
        while(head != null){
            ListNode after = head.next;
            head.next = prev;
            prev = head;
            head = after;
        }
        return prev;
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(1) -> Constant
        */
    }
    
    //Problem #3: Spilt a String in Balanced Strings, Leetcode Problem #1221
    public static int balancedStrings(String s){
        if(s == null || s.length() == 0) return 0;
        int answer = 0;
        int L = 0;
        int R = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'R') R++;
            if(s.charAt(i) == 'L') L++;
            if(R == L){
                answer ++;
                R = 0;
                L = 0;
            }
        }
        return answer;
        /*
        Time Complexity: O(n) -> Linear, though the charAt method may change this, may be better to to use for each s.toCharArray
        Space Complexity: O(1) -> Constant
        */
    }
    
    //Problem #4: Valid Parentheses, Leetcode Problem #20
    public static boolean validParentheses(String s){
        if(s == null || s.length() <= 1) return false;
        Stack<Character> chars = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '(') chars.push(')');
            else if(c == '[') chars.push(']');
            else if(c == '{') chars.push('}');
            else if(chars.isEmpty() || c != chars.peek()) return false;
            else chars.pop();
        }
        return true;
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(n) -> Linear
        */
    }
    
    //Problem #5: Concatenation of Array, Leetcode Problem #1929
    public static int[] getConcatenation(int[] nums){
        if(nums == null || nums.length == 0) return null;
        int[] ans = new int[nums.length * 2];
        for(int i = 0; i < nums.length; i++){
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
        }
        return ans;
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(1) -> Constant
        */
    }
    
    //Problem #6: Remove Duplicates from Sorted List II, Leetcode Problem #82
    public static ListNode removeDuplicatesII(ListNode head){
        if(head == null) return null;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = head;
        while(curr != null && curr.next != null){
            if(curr.val == curr.next.val){
                while(curr.next != null && curr.val == curr.next.val) curr = curr.next;
                prev.next = curr.next;
            }
            else{
                prev = curr;
            }
            curr = curr.next;
        }
        return dummy.next;
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(1) -> Constant
        */
    }
    
    //Problem #7: Unique Morse Code Words
    public static int uniqueMorseCode(String[] words){
        if(words == null || words.length == 0) return 0;
        String[] str = new String[]{".-","-...","-.-.","-..",".","..-.","--.",
            "....","..",".---","-.-",".-..","--","-.",
            "---",".--.","--.-",".-.","...","-","..-",
            "...-",".--","-..-","-.--","--.."};
        HashSet<String> set=new HashSet<>();
        for(String s:words){
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<s.length();i++){
                sb.append(str[s.charAt(i)-97]);
            }
            set.add(sb.toString());
        }
        return set.size();
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(n) -> Linear
        */
    }
    
    //Problem #8: Delete N nodes after M nodes in LinkedList
    public static ListNode deleteNodes(ListNode head, int m, int n){
        if(head == null) return null;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = head;
        int M = m;
        int N = n;
        while(curr != null && curr.next != null){
           while(M > 0 ){
               prev = curr;
               curr = curr.next;
               M--;
           } 
           while(N > 0 && curr.next != null){
               curr = curr.next;
               N--;
           }
           if(N != 0){
               prev.next = null;
           }
           else{
                prev.next = curr;
                M = m;
                N = n;
           }
           
        }
        return dummy.next;
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(1) -> Constant
        */
    }
    
    //Problem #9: Add Two Numbers, Leetcode Problem #2
    public static ListNode addTwoNumbers(ListNode head1, ListNode head2){
        if(head1 == null && head2 == null) return null;
        if(head1 == null) return head2;
        if(head2 == null) return head1;
        
        ListNode answer = new ListNode(0);
        ListNode i = answer;
        int carry = 0;
        int sum = carry;
        while(head1 != null && head2 != null){
            sum = carry;
            sum += head1.val + head2.val;
            ListNode temp = new ListNode(sum % 10);
            i.next = temp;
            i = i.next;
            carry = sum / 10;
            head1 = head1.next;
            head2 = head2.next;
        }
        
        if(head1 == null && head2 != null){
            while(head2 != null){
                sum = carry;
                sum += head2.val;
                ListNode temp = new ListNode(sum % 10);
                i.next = temp;
                i = i .next;
                carry = sum / 10;
                head2 = head2.next;
            }
        }
        else if(head2 == null && head1 != null){
            while(head1 != null){
                sum = carry;
                sum += head1.val;
                ListNode temp = new ListNode(sum % 10);
                i.next = temp;
                i = i.next;
                carry = sum / 10;
                head1 = head1.next;
            }
        }
        if(carry > 0){
            ListNode temp = new ListNode(carry);
            i.next = temp;
        }
        
        return answer.next;
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(1) -> Constant
        */
    }
    
    //Problem #10: Check if Two String Arrays are Equivalent
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2){
        if(word1 == null || word2 == null || word1.length == 0 || word2.length == 0) return false;
        int c1 = 0;
        int c2 = 0;
        int s1 = 0;
        int s2 = 0;
        while(s1 < word1.length && s2 < word2.length){
            if(word1[s1].charAt(c1++) != word2[s2].charAt(c2++)) return false;
            if(c1 == word1[s1].length()){
                c1 = 0;
                s1++;
            }
            if(c2 == word2[s2].length()){
                c2 = 0;
                s2++;
            }
        }
        return s1 == word1.length && s2 == word2.length;
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(1) -> Constant
        */
    }
    
    //Problem #11: Check if the Sentence is Pangram
    public static boolean pangram(String sentence){
        if(sentence == null || sentence.length() < 26) return false;
        sentence = sentence.toLowerCase();
        HashSet<Character> chars = new HashSet<>();
        for(char c : sentence.toCharArray()) chars.add(c);
        
        return chars.size() == 26;
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(n) -> Linear
        */
    }
    
    //Problem #12: Goal Parser Interpretation
    public static String goalParser(String command){
        if(command == null || command.length() == 0) return "";
        StringBuilder sb = new StringBuilder();
        StringBuilder answer = new StringBuilder();
        for(int i = 0; i < command.length(); i++){
            sb.append(command.charAt(i));
            if(sb.toString().equals("G")){
                answer.append("G");
                sb.setLength(0);
            }
            else if(sb.toString().equals("()")){
                answer.append("o");
                sb.setLength(0);
            }
            else if(sb.toString().equals("(al)")){
                answer.append("al");
                sb.setLength(0);
            }
        }
        return answer.toString();
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(n) -> Linear or is this affected by the fact we are using stringbuilder and not just strings?
        */
    }
    
    //Problem #13: Decode String, Leetcode Problem #394
    public static String decodeString(String s){
        if(s == null || s.length() == 0) return "";
        Stack<Integer> nums = new Stack<>();
        Stack<String> word = new Stack<>();
        String answer = "";
        int i = 0;
        
        while(i < s.length()){
            if(Character.isDigit(s.charAt(i))){
                int count = 0;
                while(Character.isDigit(s.charAt(i))){
                    count = 10 * count + (s.charAt(i) - '0');
                    i++;
                }
                nums.push(count);
            }
            else if(s.charAt(i) == '['){
                word.push(answer);
                answer = "";
                i++;
            }
            else if(s.charAt(i) == ']'){
                StringBuilder temp = new StringBuilder(word.pop());
                int count = nums.pop();
                for(int j = 0; j < count; j++) temp.append(answer);
                answer = temp.toString();
                i++;
            }
            else{
                answer += "" + s.charAt(i);
                i++;
            }
        }
        return answer;
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(n) -> Linear
        */
    }
    
    //Problem #14: Add Two Integers, Leetcode Problem #2235
    public static int addTwoIntegers(int num1, int num2){
        return num1 + num2;
        /*
        Time Complexity: O(1) -> Constant
        Space Complexity: O(1) -> Constant
        */
    }
    
}
