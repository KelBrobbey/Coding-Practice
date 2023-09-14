/*
This file is being used to solve Bathi's official bootcamp problem sets. Solving
Set 6, starting on 09/14/2023
*/
package mark_one;
import java.util.*;
import java.lang.*;
import java.io.*;

public class SetSix{
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
        ListNode oneA = new ListNode(9);
        ListNode oneB = new ListNode(9);
        ListNode oneC = new ListNode(9);
        oneA.next = oneB;
        oneB.next = oneC;
        ListNode oneD = new ListNode(1);
        System.out.println("First Problem, plusOne: " + printList(plusOne(oneD)));
        
        String[] two = {"please wait", "continue to fight", "continue to win"};
        System.out.println("Second Problem, maxNumberOfWordsInSentence: " + maxNumberOfWordsInSentence(two));
        
        ListNode threeA = new ListNode(1);
        ListNode threeB = new ListNode(1);
        ListNode threeC = new ListNode(2);
        threeA.next = threeB;
        threeB.next = threeC;
        System.out.println("Third Problem, removeDuplicatesSortedList: " + printList(removeDuplicatesSortedList(threeA)));
        
        int[] four = {1, 2, 3, 1, 1, 3};
        System.out.println("Fourth Problem, goodPairs: " + goodPairs(four));
        
        ListNode fiveA = new ListNode(1);
        ListNode fiveB = new ListNode(2);
        ListNode fiveC = new ListNode(3);
        ListNode fiveD = new ListNode(4);
        ListNode fiveE = new ListNode(5);
        fiveA.next = fiveB;
        fiveB.next = fiveC;
        fiveC.next = fiveD;
        fiveD.next = fiveE;
        ListNode fiveF = new ListNode(1);
        System.out.println("Fifth Problem, removeNthNodeFromEndOfList: " + printList(removeNthNodeFromEndOfList(fiveA, 2)));
        
        int[] six = {3, 1, 2, 10, 1};
        System.out.println("Six Problem, runningSumOfArray: " + Arrays.toString(runningSumOfArray(six)));
        
        ListNode sixA = new ListNode(1);
        ListNode sixB = new ListNode(2);
        ListNode sixC = new ListNode(2);
        ListNode sixD = new ListNode(1);
        sixA.next = sixB;
        sixB.next = sixC;
        sixC.next = sixD;
        System.out.println("Seventh Problem, palindromeLinkedList: " + palindromeLinkedList(sixA));
        
        String sevenA = "Hello how are you Contestant";
        int sevenB = 4;
        System.out.println("Eight Problem, truncateSentence: " + truncateSentence(sevenA, sevenB));
        
        ListNode nineAa = new ListNode(1);
        ListNode nineAb = new ListNode(2);
        ListNode nineAc = new ListNode(3);
        nineAa.next = nineAb;
        nineAb.next = nineAc;
        ListNode nineBa = new ListNode(1);
        ListNode nineBb = new ListNode(3);
        ListNode nineBc = new ListNode(4);
        nineBa.next = nineBb;
        nineBb.next = nineBc;
        System.out.println("Ninth problem, mergeTwoSortedLists: " + printList(mergeTwoSortedLists(nineAa, nineBa)));
        
        String tenA = "ab";
        String[] tenB = {"ad","bd","aaab","baa","badab"};
        System.out.println("Tenth Problem, consistentStrings: " + consistentStrings(tenA, tenB));
        
        ListNode elevenA = new ListNode(1);
        ListNode elevenB = new ListNode(2);
        ListNode elevenC = new ListNode(3);
        ListNode elevenD = new ListNode(4);
        ListNode elevenE = new ListNode(5);
        elevenA.next = elevenB;
        elevenB.next = elevenC;
        elevenC.next = elevenD;
        elevenD.next = elevenE;
        System.out.println("Eleventh Problem, middleOfLinkedList: " + printList(middleOfLinkedList(elevenA)));
        
        int[] twelveA = {2,5,1,3,4,7};
        int twelveB = 3;
        System.out.println("Twelveth Problem, shuffleArray: " + Arrays.toString(shuffleArray(twelveA, twelveB)));
    }
    
    //Problem #1: PlusOne, Leetcode Problem #369
    public static ListNode plusOne(ListNode head){
        if(head == null) return null;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode i = dummy;
        ListNode curr = head;
        while(curr != null){
            if(curr.val != 9) i = curr;
            curr = curr.next;
        }
        
        i.val++;
        ListNode temp = i.next;
        while(temp != null){
            temp.val = 0;
            temp = temp.next;
        }
        
        return dummy.val == 0 ? dummy.next : dummy;
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(1) -> Constant
        */
    }
    
    //Problem #2: Maximum Number of Words Found in Sentences, Leetcode Problem #2114
    public static int maxNumberOfWordsInSentence(String[] sentences){
        if(sentences == null || sentences.length == 0) return 0;
        int max = 0;
        for(int i = 0; i < sentences.length; i++){
            max = Math.max(max, sentences[i].split(" ").length);
        }
        return max;
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(1) -> Constant, potentially O(n) because of our spilt method use
        */
    }
    
    //Problem #3: Remove Duplicates from Sorted List, Leetcode Problem #83
    public static ListNode removeDuplicatesSortedList(ListNode head){
        if(head == null) return null;
        ListNode curr = head;
        while(curr != null && curr.next != null){
            if(curr.val == curr.next.val) curr.next = curr.next.next;
            else curr = curr.next;
        }
        return head;
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(1) -> Constant
        */
    }
    
    //Problem #4: Number of Good Pairs, Leetcode Problem #1512
    public static int goodPairs(int[] nums){
        if(nums == null || nums.length == 0) return 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int answer = 0;
        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(nums[i])) map.put(nums[i], 1);
            else{
                answer += map.get(nums[i]);
                map.replace(nums[i], map.get(nums[i]) + 1);
            }
        }
        return answer;
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(n) -> Linear
        */
    }
    
    //Problem #5: Remove Nth Node from End of List, Leetcode Problem #19
    public static ListNode removeNthNodeFromEndOfList(ListNode head, int n){
        if(head == null) return null;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;
        int count = 0;
        while(count <= n){
            fast = fast.next;
            count++;
        }
        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(1) -> Constant
        */
    }
    
    //Problem #6: Running Sum of 1D Array, Leetcode Problem #1480
    public static int[] runningSumOfArray(int[] nums){
        if(nums == null || nums.length == 0) return null;
        for(int i = 1; i < nums.length; i++){
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(1) -> Constant
        */
    }
    
    //Problem #7: Palindrome LinkedList, Leetcode Problem #234
    public static boolean palindromeLinkedList(ListNode head){
        if(head == null) return false;
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        
        ListNode prev = null;
        while(slow != null){
            ListNode after = slow.next;
            slow.next = prev;
            prev = slow;
            slow = after;
        }
        
        ListNode temp = head;
        while(prev != null){
            if(temp.val != prev.val) return false;
            temp = temp.next;
            prev = prev.next;
        }
        return true;
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(1) -> Constant
        */
    }
    
    //Problem #8: Truncate Sentence, Leetcode Problem #1816
    public static String truncateSentence(String s, int k){
        if(s == null || s.length() == 0) return "";
        String[] words = s.split(" ");
        if(words.length <= k) return s;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < k; i++){
            sb.append(words[i] + " ");
        }
        return sb.toString().trim();
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(1) -> Constant
        */
    }
    
    //Problem #9: Merge Two Sorted Lists, Leetcode Problem #21
    public static ListNode mergeTwoSortedLists(ListNode head1, ListNode head2){
        if(head1 == null && head2 == null) return null;
        if(head1 == null) return head2;
        if(head2 == null) return head1;
        
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while(head1 != null && head2 != null){
            if(head1.val < head2.val){
                curr.next = head1;
                head1 = head1.next;
            }
            else{
                curr.next = head2;
                head2 = head2.next;
            }
            curr = curr.next;
        }
        
        if(head1 == null) curr.next = head2;
        if(head2 == null) curr.next = head1;
        return dummy.next;
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(1) -> Constant
        */
    }
    
    //Problem #10: Count the Number of Consistent Strings, Leetcode Problem #1684
    public static int consistentStrings(String allowed, String[]words){
        if(allowed == null || allowed.length() == 0 || words == null || words.length == 0) return 0;
        HashSet<Character> set = new HashSet<>();
        int answer = 0;
        for(int i = 0; i < allowed.length(); i++) set.add(allowed.charAt(i));
        
        for(int i = 0; i < words.length; i++){
            String word = words[i];
            for(int j = 0; j < word.length(); j++){
                if(!set.contains(word.charAt(j))){
                    answer++;
                    break;
                }
            }
        }
        return words.length - answer;
        /*
        Time Complexity: O(n^2) -> Exponential
        Space Complexity: O(n) -> Linear
        */
    }
    
    //Problem #11: Middle of LinkedList, Leetcode Problem #876
    public static ListNode middleOfLinkedList(ListNode head){
        if(head == null) return null;
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
        /*
        Time Complexity: O(n) -> Lienar
        Space Complexity: O(1) -> Constant
        */
    }
    
    //Problem #12: Shuffle the Array, Leetcode Problem #1470
    public static int[] shuffleArray(int[] nums, int n){
        if(nums == null || nums.length == 0) return null;
        if(n == 1) return nums;
        
        int output[]=new int[nums.length];
        for(int i=0;i<nums.length;i+=2)
        {
                output[i]=nums[i/2];
                output[i+1]=nums[nums.length-n];
                n--;
        }	
        return output;
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(1) -> Constant
        */
    } 
}
