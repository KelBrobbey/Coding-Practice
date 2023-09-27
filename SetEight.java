/*
This file will be used to solve Bathis's official bootcamp problem sets. Solving
Set 8, starting on 09/26/2023
*/
package mark_one;
import java.util.*;
import java.lang.*;
import java.io.*;

public class SetEight{
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
        ListNode oneAa = new ListNode(7);
        ListNode oneAb = new ListNode(2);
        ListNode oneAc = new ListNode(4);
        ListNode oneAd = new ListNode(3);
        oneAa.next = oneAb;
        oneAb.next = oneAc;
        oneAc.next = oneAd;
        ListNode oneBa = new ListNode(5);
        ListNode oneBb = new ListNode(6);
        ListNode oneBc = new ListNode(4);
        oneBa.next = oneBb;
        oneBb.next = oneBc;
        System.out.println("First Problem, Add Two Nunbers II: " + printList(addTwoNumbersII(oneAa, oneBa)));
        
        String[] two = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println("Second Problem, Evaluate Reverse Polish Notation: " + evalRPN(two));
        
        ListNode threeA = new ListNode(2);
        ListNode threeB = new ListNode(1);
        ListNode threeC = new ListNode(1);
        ListNode threeD = new ListNode(2);
        threeA.next = threeB;
        threeB.next = threeC;
        threeC.next = threeD;
        System.out.println("Third Problem, Remove Duplicates From an Unsorted Linked List: " + printList(removeDuplicatesUnsortedList(threeA)));
        
        int[][] four = {{1, 2, 3}, {3, 2, 1}};
        System.out.println("Fourth Problem, Richest Customer Wealth: " + maximumWealth(four));
        
        String five = "(1+(2*3)+((8)/4))+1";
        System.out.println("Fifth Problem, Maximum Nesting Depth of the Parentheses: " + maxDepth(five));
        
        String sixA = "a#c";
        String sixB = "b";
        System.out.println("Sixth Problem, Backspace String Compare: " + backspaceCompare(sixA, sixB));
        
        ListNode sevenA = new ListNode(3);
        ListNode sevenB = new ListNode(2);
        ListNode sevenC = new ListNode(0);
        ListNode sevenD = new ListNode(4);
        sevenA.next = sevenB;
        sevenB.next = sevenC;
        sevenC.next = sevenD;
        sevenD.next = sevenB;
        System.out.println("Seventh Problem, Linked List Cycle: " + linkedListCycle(sevenA));
        
        String[] eight = {"++X","++X","X++"};
        System.out.println("Eigth Problem, Final Value of Variable After Performing Operations: " + finalValueAfterOperations(eight));
        
        ListNode nineAa = new ListNode(1);
        ListNode nineAb = new ListNode(4);
        ListNode nineAc = new ListNode(5);
        nineAa.next = nineAb;
        nineAb.next = nineAc;
        ListNode nineBa = new ListNode(1);
        ListNode nineBb = new ListNode(3);
        ListNode nineBc = new ListNode(4);
        nineBa.next = nineBb;
        nineBb.next = nineBc;
        ListNode nineCa = new ListNode(2);
        ListNode nineCb = new ListNode(6);
        nineCa.next = nineCb;
        ListNode[] nine = {nineAa, nineBa, nineCa};
        System.out.println("Ninth Problem, Merge k Sorted Lists: " + printList(mergeKLists(nine)));
        
    }
    
    //Problem #1: Add Two Numbers II, Leetcode Problem #445
    public static ListNode addTwoNumbersIIHelper(ListNode head){
        ListNode prev = null;
        while(head != null){
            ListNode after = head.next;
            head.next = prev;
            prev = head;
            head = after;
        }
        return prev;
    }
    public static ListNode addTwoNumbersII(ListNode l1, ListNode l2){
        ListNode head1 = addTwoNumbersIIHelper(l1);
        ListNode head2 = addTwoNumbersIIHelper(l2);
        
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
        
        return addTwoNumbersIIHelper(answer.next);
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(1) -> Constant
        */
    }
    
    //Problem #2: Evaluate Reverse Polish Notation, Leetcode Problem #150
    public static int evalRPN(String[] tokens){
        if(tokens == null || tokens.length == 0) return 0;
        Stack<Integer> nums = new Stack<>();
        for(int i = 0; i < tokens.length; i++){
            if(!tokens[i].equals("+") && !tokens[i].equals("-") && !tokens[i].equals("/") && !tokens[i].equals("*")) nums.push(Integer.parseInt(tokens[i]));
            else{
                int num1 = nums.pop();
                int num2 = nums.pop();
                if(tokens[i].equals("+")) num2 += num1;
                if(tokens[i].equals("-")) num2 -= num1;
                if(tokens[i].equals("*")) num2 *= num1;
                if(tokens[i].equals("/")) num2 /= num1;
                nums.push(num2);
            }
        }
        return nums.pop();
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(n) -> Linear
        */
    }
    
    //Problem #3: Remove Duplicates from an Unsorted LinkedList, Leetcode Problem #83
    public static ListNode removeDuplicatesUnsortedList(ListNode head){
        if(head == null) return null;
        if(head.next == null) return head;
        HashMap<Integer, Integer> map = new HashMap<>();
        ListNode curr = head;
        while(curr != null){
            if(map.containsKey(curr.val)) map.replace(curr.val, map.get(curr.val) + 1);
            else map.put(curr.val, 1);
            curr = curr.next;
        }
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        curr = head;
        while(curr != null){
            if(map.get(curr.val) > 1) prev.next = curr.next;
            else{
                prev = curr;
            }
            curr = curr.next;
        }
        return dummy.next;
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(n) -> Linear
        */
    }
    
    //Problem #4: Richest Customer Wealth, Leetcode Problem #1672
    public static int maximumWealth(int[][] accounts){
        if(accounts == null || accounts.length == 0) return 0;
        int max = Integer.MIN_VALUE;
        int count = 0;
        for(int i = 0; i < accounts.length; i++){
            count = 0;
            for(int j = 0; j < accounts[i].length; j++) count += accounts[i][j];
            max = Math.max(max, count);
        }
        return max;
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(1) -> Constant
        */
    }
    
    //Problem #5: Maximum Nesting Depth of Parentheses, Leetcode Problem #1614
    public static int maxDepth(String s){
        if(s == null || s.length() == 0) return 0;
        int open = 0;
        int max = 0;
        for(char c : s.toCharArray()){
            if(c == '(') open++;
            else if(c == ')') open--;
            max = Math.max(max, open);
        }
        return max;
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(1) -> Constant
        */
    }
    
    //Problem #6: Backspace String Compare, Leetcode Problem #844
    public static boolean backspaceCompare(String s, String t){
        if(s == null || t == null) return false;
        Stack<Character> s1 = new Stack<>();
        Stack<Character> t1 = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '#' && !s1.isEmpty()) s1.pop();
            else if(c != '#') s1.push(c);
        }
        for(char c : t.toCharArray()){
            if(c == '#' && !t1.isEmpty()) t1.pop();
            else if(c != '#') t1.push(c);
        }
        while(!s1.isEmpty() && !t1.isEmpty()){
            if(s1.pop() != t1.pop()) return false;
        }
        if(s1.size() != t1.size()) return false;
        return true;
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(n + m) -> Linear
        */
    }
    
    //Problem #7: Linked List Cycle, Leetcode Problem #141
    public static boolean linkedListCycle(ListNode head){
        if(head == null || head.next == null) return false;
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) return true;
        }
        return false;
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(1) -> Constant
        */
    }
    
    //Problem #8: Final Value of Variable After Performing Operations, Leetcode Problem #2011
    public static int finalValueAfterOperations(String[] operations){
        if(operations == null || operations.length == 0) return 0;
        int x = 0;
        for(int i = 0; i < operations.length; i++){
            if(operations[i].substring(0, 2).equals("++") || operations[i].substring(1).equals("++")) x++;
            else x--;
        }
        return x;
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(1) -> Constant
        */
    }
    
    //Problem #9: Merge K Sorted Lists, Leetcode Problem #23
    public static ListNode mergeKLists(ListNode[] lists){
        if(lists == null || lists.length == 0) return null;
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);

        for(ListNode node: lists) {
            while(node != null) {
                pq.offer(node);
                node = node.next;
            }
        }
        if(pq.isEmpty())
            return null;

        ListNode result = new ListNode(0);
        ListNode temp = result;
        while(!pq.isEmpty()) {
            temp.next = pq.poll();
            temp = temp.next;
        }
        temp.next = null;
        return result.next;
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(n) -> Linear
        */
    }
    
    
    
}
