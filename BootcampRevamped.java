/*
In this first file, we will be resolving the bootcamp sets 1 - 5 from Bathi's bootcamp. 
Starting on Monday, November 21st, 2022; LOCK IN
*/
package mark_one;
import java.util.*;
import java.lang.*;

public class BootcampRevamped{
    public static void main(String[] args){
        //SET ONE TESTING:
        int test1 = 5;
        System.out.println("Problem #1: " + sumUnderN(test1));
        
        int test2a = 5;
        int test2b = 7;
        System.out.println("Problem #2: " + sumBetweenAandB(test2a, test2b));
        
        int[] test3 = {1, 8, 3, 2, 2, 8, 3, 1};
        System.out.println("Problem #3: " + isPalindrome(test3));
        
        int[] test4 = {4, 7, 2};
        System.out.println("Problem #4: " + Arrays.toString(moveElements(test4)));
        
        int[] test5 = {5, 3, 4, 1};
        System.out.println("Problem #5: " + missingNumber(test5));
        
        int[] test6 = {2, 3, 3, 1, 4};
        System.out.println("Problem #6: " + duplicateNumber(test6));
        
        int[] test7 = {4, -2, 9, 1, 6, -7, 5};
        System.out.println("Problem #7: " + Arrays.toString(twoLargest(test7)));
        
        int[] test8a = {2, 7, 11, 15};
        int test8b = 9;
        System.out.println("Problem #8: " + Arrays.toString(twoSum(test8a, test8b)));
        
        int[] test9 = {2, 7, 11, 15};
        System.out.println("Problem #9: " + thirdMax(test9));
        
        int[] test10 = {12, 345, 2, 6, 7896};
        System.out.println("Problem #10: " + findNumbers(test10));
        
        char[] test11 = {'h', 'e', 'l', 'l', 'o'};
        System.out.println("Problem #11: " + Arrays.toString(reverseString(test11)));
        
        String test12 = "a-bC-dEf-ghIj";
        System.out.println("Problem #12: " + reverseOnlyLetters(test12));
        
        int[][] test13 = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        System.out.println("Problem #13: \n"+ print2DArray(flipAndInvertImage(test13)));
        
        
        //SET TWO TESTING:
        int[] test14 = {7, 8, 9, 11, 12};
        System.out.println("Problem #14: " + firstMissingPositive(test14));
        
        int[] test15 = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println("Problem #15: " + findDisappearedNumbers(test15));
        
        int[] test16 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println("Problem #16: " + removeDuplicates(test16));
        
        int test17 = 4421;
        System.out.println("Problem #17: " + subtractProductAndSum(test17));
        
        int test18 = 120;
        System.out.println("Problem #18: " + reverseInteger(test18));
        
        int[] test19 = {7, 6, 4, 3, 1};
        System.out.println("Problem #19: " + maxProfit(test19));
        
        String test20 = "POPOCBA";
        System.out.println("Problem #20: " + teamRace(test20));
        
        String test21 = "abcdefghijklmnopqrstuvwxyz";
        String test21b = "cba";
        System.out.println("Problem #21: " + calculateTime(test21, test21b));
        
        String test22 = "race a car";
        System.out.println("Problem #22: " + isPalindrome(test22));
        
        String test23 = "aba";
        System.out.println("Problem #23: " + validPalindrome(test23));
        
        String test24 = "loveleetcode";
        System.out.println("Problem #24: " + firstUniqueChar(test24));
        
        String test25 = "b139m98da1";
        System.out.println("Problem #25: " + string2Sum(test25));
        
        int test26 = -905509;
        System.out.println("Problem #26: " + palindromeNumber(test26));
        
        String test27 = "abcc";
        System.out.println("Problem #27: " + possiblePalindrome(test27));
        
        int[] test28 = {2, 3, 5, 1, 3};
        int test28b = 3;
        System.out.println("Problem #28: " + Arrays.toString(extraCandies(test28, test28b)));
        
        
        //SET THREE TESTING
        String[] test29 = {"code", "leet", "best", "code", "test", "code"};
        System.out.println("Problem #29: " + mostOccurance(test29));
        
        int test30 = 1634;
        System.out.println("Problem #30: " + armstrongN(test30));
        
        int[] test31 = {-5, -99, 3, 5, -99, 1094, 48};
        System.out.println("Problem #31: " + duplicateNumber2(test31));
        
        int[] test32 = {9, 9, 8, 8};
        System.out.println("Problem #32: " + largestUniqueNumber(test32));
        
        int[] test33 = {4, 1, 2, 1, 2};
        System.out.println("Problem #33: " + singleNumber(test33));
        
        int[] test34 = {-3, 0, 1, -3, 1, 1, 1, -3, 10, 0};
        System.out.println("Problem #34: " + uniqueOccurances(test34));
        
        int test35 = 14;
        System.out.println("Problem #35: " + numberOfSteps(test35));
        
        int test36 = 15;
        System.out.println("Problem #36: " + Arrays.toString(fizzBuzz(test36)));
        
        
        //SET FOUR TESTING
        int[] test37 = {2, 1, -1};
        System.out.println("Problem #37: " + pivotIndex(test37));
        
        String test38 = "aaaa";
        String test38b = "dog cat cat dog";
        System.out.println("Problem #38: " + wordPattern(test38, test38b));
        
        String test39 = "1010";
        String test39b = "1011";
        System.out.println("Problem: #39: " + addBinary(test39, test39b));
        
        int[] test40 = {7, 1, 14, 11};
        System.out.println("Problem #40: " + doubleN(test40));
        
        int[] test41 = {-4, -1, 0, 3, 10};
        System.out.println("Problem #41: " + Arrays.toString(squaredSortedArray(test41)));
        
        String test42 = "bb";
        System.out.println("Problem #42: " + longestPalindrome(test42));
        
        int[] test43 = {1, 0, 1, 1, 0, 1};
        System.out.println("Problem #43: " + maxConsecutiveOnes(test43));
        
        int[] test44 = {1};
        System.out.println("Problem #44: " + largestNumber(test44));
        
        String[] test45 = {"practice", "makes", "perfect", "coding", "makes"};
        String test45a = "practice";
        String test45b = "coding";
        System.out.println("Problem #45: " + shortestWordDistance(test45, test45a, test45b));
        
        int[] test46 = {9};
        System.out.println("Problem #46: " + Arrays.toString(plusOne(test46)));
        
        
        //SET FIVE TESTING
        int[] test47 = {-1, 0};
        System.out.println("Problem #47: " + Arrays.toString(twoSumII(test47, -1)));
        
        String test48 = "5";
        String test48b = "10";
        System.out.println("Problem #48: " + addStrings(test48, test48b));
        
        String test49 = "rat";
        String test49b = "car";
        System.out.println("Problem #49: " + validAnagram(test49, test49b));
        
        int[] test50 = {0, 0, 0, 1, 0, 1};
        System.out.println("Problem #50: " + maxConsecutiveOnesII(test50));
        
        int[] test51 = {0, 1, 0, 3, 12};
        System.out.println("Problem #51: " + Arrays.toString(moveZeroes(test51)));
        
        int[] test52 = {0, 3, 2, 1};
        System.out.println("Problem #52: " + validMountainArray(test52));
        
        
        //EXTRA TESTING
        int[] test53 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Problem #53: " + Arrays.toString(subArrayToSum(test53, 15)));
        
        int[] test54 = {1, 2, 3, 4};
        System.out.println("Problem #54: " + numOfTeams(test54));
        
        String test55 = "ZY";
        System.out.println("Problem #55: " + excelColumnNumber(test55));
        
        String test56 = "962";
        System.out.println("Problem #56: " + strobogrammaticNumber(test56));
    }
    
    //SET ONE QUESTIONS
    public static int sumUnderN(int n){
        return (n * (n + 1)) / 2;
        /*
        Time Complexity: O(1) -> Constant
        Space Complexity: O(1) -> Constant
        */
    }
    public static int sumBetweenAandB(int a, int b){
        return sumUnderN(b) - sumUnderN(a) + a;
        /*
        Time Complexity: O(1) -> Constant
        Space Complexity: O(1) -> Constant
        */
    }
    public static boolean isPalindrome(int[] nums){
        if(nums == null || nums.length == 0) return false;
        int i = 0;
        int j = nums.length - 1;
        while(i < j) if(nums[i++] != nums[j--]) return false;
        return true;
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(1) -> Constant
        */
    }
    public static int[] moveElements(int[] nums){
        if(nums == null || nums.length == 0) return null;
        int i = 0;
        int j = nums.length - 1;
        while(i < j){
            if(nums[i] % 2 == 0 && nums[j] % 2 == 1){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            else{
                if(nums[i] % 2 == 1) i++;
                if(nums[j] % 2 == 0) j--;
            }
        }
        return nums;
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(1) -> Constant
        */
    }
    public static int missingNumber(int[] nums){
        if(nums == null || nums.length == 0) return 0;
        int total = sumUnderN(nums.length + 1);
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        return total - sum;
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(1) -> Constant
        */
    }
    public static int duplicateNumber(int[] nums){
        if(nums == null || nums.length == 0) return 0;
        for(int i = 0; i < nums.length; i++){
            int index = Math.abs(nums[i]);
            if(nums[index] < 0) return index;
            nums[index] = -Math.abs(nums[index]);
        }
        return 0;
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(1) -> Constant
        */
    }
    public static int[] twoLargest(int[] nums){
        if(nums == null || nums.length == 0) return null;
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > first){
                second = first;
                first = nums[i];
            }
            else if(nums[i] > second) second = nums[i];
        }
        return new int[] {first, second};
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(1) -> Constant
        */
    }
    public static int[] twoSum(int[] nums, int target){
        if(nums == null || nums.length == 0) return null;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(nums[i])) map.put(target - nums[i], i);
            else return new int[] {map.get(nums[i]), i};
        }
        return null;
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(n) -> Linear
        */
    }
    public static int thirdMax(int[] nums){
        if(nums == null || nums.length < 3) return Integer.MIN_VALUE;
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > first){
                third = second;
                second = first;
                first = nums[i];
            }
            else if(nums[i] > second){
                third = second;
                second = nums[i];
            }
            else if(nums[i] > third) third = nums[i];
        }
        return third;
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(1) -> Constant
        */
    }
    public static int findNumbers(int[] nums){
        if(nums == null || nums.length == 0) return 0;
        int answer = 0;
        for(int i = 0; i < nums.length; i++){
            int digits = (int)Math.log10(nums[i]) + 1;
            if(digits % 2 == 0) answer++;
        }
        return answer;
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(1) -> Constant
        */
    }
    public static char[] reverseString(char[] str){
        if(str == null || str.length == 0) return null;
        int i = 0;
        int j = str.length - 1;
        while(i < j){
            char temp = str[i];
            str[i++] = str[j];
            str[j--] = temp;
        }
        return str;
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(1) -> Constant
        */
    }
    public static String reverseOnlyLetters(String str){
        if(str == null || str.length()  == 0) return "NULL";
        int i = 0;
        int j = str.length() - 1;
        while(i < j){
            if(Character.isLetter(str.charAt(i)) && Character.isLetter(str.charAt(j))){
                str = str.substring(0, i) + str.charAt(j) + str.substring(i + 1, j) + str.charAt(i) + str.substring(j + 1);
                i++;
                j--;
            }
            else{
                if(!Character.isLetter(str.charAt(i))) i++;
                if(!Character.isLetter(str.charAt(j))) j--;
            }
        }
        return str;
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(1) -> Constant
        */
    }
    public static int[][] flipAndInvertImage(int[][] A){
        if(A == null || A.length == 0) return null;
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < (A[0].length + 1) / 2; j++){
                int temp = A[i][j]^1;
                A[i][j] = A[i][A[0].length - j - 1] ^ 1;
                A[i][A[0].length - j - 1] = temp;
            }
           
        }
        return A;
        /*
        Time Complexity: O(n) -> Linear, with n being the total number of numbers within the 2D array
        Space Complexity: O(1) -> Constant
        */
    }
    //Helper Method for printing out 2D Arrays
    public static String print2DArray(int[][] A){
        String answer = "{";
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A[i].length; j++){
                if(j != A[i].length - 1){
                    answer += "" + A[i][j] + ", ";
                }
                else{
                    if(i != A.length - 1){
                        answer += "" + A[i][j] + "}," + "\n" + "{";
                    }
                    else{
                        answer += "" + A[i][j] + "}";
                    }
                }
            }
        }
        return answer;
    }
    
    //SET TWO QUESTIONS
    public static int firstMissingPositive(int[] nums){
        if(nums == null || nums.length == 0) return 0;
        boolean one = false;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1) one = true;
        }
        if(!one) return 1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > nums.length || nums[i] < 1) nums[i] = 1;
        }
        for(int i = 0; i < nums.length; i++){
            int index = Math.abs(nums[i]);
            if(index == nums.length) nums[0] = -Math.abs(nums[0]);
            else nums[index] = -Math.abs(nums[index]);
        }
        for(int i = 0; i < nums.length; i++){
            if(i == 0 && nums[i] > 0) return nums.length;
            else if(nums[i] > 0) return i;
        }
        return 0;
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(1) -> Constant
        */
    }
    public static List<Integer> findDisappearedNumbers(int[] nums){
        if(nums == null || nums.length == 0) return null;
        List<Integer> answer = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            int index = Math.abs(nums[i]);
            if(index == nums.length) nums[0] = -Math.abs(nums[0]);
            else nums[index] = -Math.abs(nums[index]);
        }
        for(int i = 0; i < nums.length; i++){
            if(i == 0 && nums[i] > 0) answer.add(nums.length);
            else if(nums[i] > 0) answer.add(i);
        }
        return answer;
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(1) -> Constant
        */
    }
    public static int removeDuplicates(int[] nums){
        if(nums == null || nums.length == 0) return 0;
        int counter = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i -1]) nums[counter++] = nums[i];
        }
        int n = counter;
        while(n < nums.length) nums[n++] = Integer.MIN_VALUE;
        //System.out.println(Arrays.toString(nums));
        return counter;
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(1) -> Constant
        */
    }
    public static int subtractProductAndSum(int n){
        int product = 1;
        int sum = 0;
        while(n != 0){
            product *= n % 10;
            sum += n % 10;
            n /= 10;
        }
        return product - sum;
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(n) -> Constant
        */
    }
    public static int reverseInteger(int n){
        int power = 0;
        int N = n;
        while(N != 0){
            power++;
            N /= 10;
        }
        power--;
        int answer = 0;
        while(n != 0){
            answer += n % 10 * Math.pow(10, power--);
            n /= 10;
        }
        return answer;
    }
    public static int maxProfit(int[] prices){
        if(prices == null || prices.length < 2) return 0;
        int profit = 0;
        int low = prices[0];
        for(int i = 1; i < prices.length; i++){
            if(prices[i] < low) low = prices[i];
            if(prices[i] - low > profit) profit = prices[i] - low;
        }
        return profit;
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(1) -> Constant
        */
    }
    public static char teamRace(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        char answer = '1';
        for(int i = 0; i < str.length(); i++){
            if(!map.containsKey(str.charAt(i))){
                map.put(str.charAt(i), 1);
                if(map.get(str.charAt(i)) > max){
                    max = map.get(str.charAt(i));
                    answer = str.charAt(i);
                }
            }
            else{
                map.replace(str.charAt(i), map.get(str.charAt(i)) + 1);
                if(map.get(str.charAt(i)) > max){
                    max = map.get(str.charAt(i));
                    answer = str.charAt(i);
                }
            }
        }
        return answer;
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(n) -> Linear
        */
    }
    public static int calculateTime(String keyboard, String word){
        if(word == null || word.length() == 0) return 0;
        int answer = 0;
        int last = 0;
        int[] keys = new int[26];
        for(int i = 0; i < keyboard.length(); i++) keys[keyboard.charAt(i) - 'a'] = i;
        for(int i = 0; i < word.length(); i++){
            answer += Math.abs(keys[word.charAt(i) - 'a'] - last);
            last = keys[word.charAt(i) - 'a'];
        }
        return answer;
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(1) -> Constant
        */
    }
    public static boolean isPalindrome(String str){
        if(str == null || str.length() <= 1) return true;
        int i = 0;
        int j = str.length() - 1;
        while(i < j){
            if(Character.isAlphabetic(str.charAt(i)) && Character.isAlphabetic(str.charAt(j)) && Character.toLowerCase(str.charAt(i++)) != Character.toLowerCase(str.charAt(j--))) return false;
            if(!Character.isAlphabetic(str.charAt(i))) i++;
            if(!Character.isAlphabetic(str.charAt(j))) j--;
        }
        return true;
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(1) -> Constant
        */
    }
    public static boolean validPalindrome(String str){
        if(str == null || str.length() == 0) return false;
        int i = 0;
        int j = str.length() - 1;
        while(i < j){
            if(str.charAt(i) != str.charAt(j)) return isPalindromeHelper(str.substring(0, j) + str.substring(j + 1)) || isPalindromeHelper(str.substring(0, i) + str.substring(i + 1)); 
            i++;
            j--;
        }
        return true;
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(1) -> Constant
        */
    }
    public static boolean isPalindromeHelper(String str){
        int i = 0;
        int j = str.length() - 1;
        while(i < j){
            if(str.charAt(i++) != str.charAt(j--)) return false;
        }
        return true;
    }
    public static int firstUniqueChar(String str){
        if(str == null || str.length() == 0) return -1;
        char[] letters = new char[256];
        for(int i = 0; i < str.length(); i++) letters[str.charAt(i) - 'A']++;
        for(int i = 0; i < str.length(); i++){
            if(letters[str.charAt(i) - 'A'] == 1) return i;
        }
        return -1;
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(1) -> Constant
        */
    }
    public static int string2Sum(String str){
        if(str == null || str.length() == 0) return 0;
        String num = "";
        int answer = 0;
        for(int i = 0; i < str.length(); i++){
            if(Character.isLetter(str.charAt(i))){
                if(num.length() != 0){
                    answer += Integer.parseInt(num);
                    num = "";
                }
            }
            else num += str.charAt(i);
        }
        if(num.length() != 0) answer += Integer.parseInt(num);
        return answer;
        /*
        Time Complexity: O(n) -> Linear, but the parseInt method could potentially affect runtime
        Space Complexity: O(1) -> Constant
        */
    }
    public static boolean palindromeNumber(int n){
        if(n < 0) return false;
        return reverseInteger(n) == n;
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(1) -> Constant
        */
    }
    public static boolean possiblePalindrome(String str){
        if(str == null || str.length() == 0) return false;
        char[] letters = new char[256];
        for(int i = 0; i < str.length(); i++) letters[str.charAt(i) - 'A']++;
        int odd = 0;
        for(int i = 0; i < letters.length; i++){
            if(letters[i] % 2 == 1) odd++;
        }
        return odd <= 1;
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(1) -> Constant
        */
    }
    public static boolean[] extraCandies(int[] candies, int extraCandles){
        if(candies == null || candies.length == 0) return null;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < candies.length; i++){
            if(candies[i] > max) max = candies[i];
        }
        boolean[] answer = new boolean[candies.length];
        for(int i = 0; i < candies.length; i++){
            if(candies[i] + extraCandles >= max) answer[i] = true;
            else answer[i] = false;
        }
        return answer;
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(1) -> Constant
        */
    }
    
    //SET THREE QUESTIONS
    public static String mostOccurance(String[] words){
        if(words == null || words.length == 0) return null;
        HashMap<String, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        String answer = "";
        for(int i = 0; i < words.length; i++){
            if(!map.containsKey(words[i])) map.put(words[i], 1);
            else map.put(words[i], map.get(words[i]) + 1);
            if(map.get(words[i]) > max){
                max = map.get(words[i]);
                answer = words[i];
            }
        }
        return answer;
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(n) -> Linear
        */
    }
    public static boolean armstrongN(int N){
        int power = 0;
        int n = N;
        while(n != 0){
            power++;
            n /= 10;
        }
        n = N;
        int num = 0;
        while(n != 0){
            num += Math.pow(n % 10, power);
            n /= 10;
        }
        return num == N;
        /*
        Time Complexity; O(n) -> Linear
        Space Complexity: O(1) -> Constant
        */
    }
    public static int duplicateNumber2(int[] nums){
        if(nums == null || nums.length == 0) return 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(!set.add(nums[i])) return nums[i];
            set.add(nums[i]);
        }
        return 0;
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(n) -> Linear
        */
    }
    public static int largestUniqueNumber(int[] nums){
        if(nums == null || nums.length == 0) return -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(nums[i])) map.put(nums[i], 1);
            else map.replace(nums[i], map.get(nums[i]) + 1);
        }
        int max = Integer.MIN_VALUE;
        for(int key : map.keySet()){
            if(map.get(key) == 1 && key > max) max = key;
        }
        if(max == Integer.MIN_VALUE) return -1;
        return max;
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(n) -> Linear
        */
    }
    public static int singleNumber(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(nums[i])) map.put(nums[i], 1);
            else map.put(nums[i], map.get(nums[i]) + 1);
        }
        for(int key : map.keySet()){
            if(map.get(key) == 1) return key;
        }
        return -1;
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(n) -> Linear
        */
    }
    public static boolean uniqueOccurances(int[] arr){
        if(arr == null || arr.length == 0) return false;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            if(!map.containsKey(arr[i])) map.put(arr[i], 1);
            else map.put(arr[i], map.get(arr[i]) + 1);
        }
        HashSet<Integer> set = new HashSet<>();
        for(int key : map.keySet()) set.add(map.get(key));
        
        return set.size() == map.size();
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(n) -> Linear
        */
    } 
    public static int numberOfSteps(int num){
        int steps = 0;
        while(num != 0){
            steps++;
            if(num % 2 == 0) num /= 2;
            else num--;
        }
        return steps;
    }
    
    //SET FOUR QUESTIONS
    public static String[] fizzBuzz(int n){
        String[] answer = new String[n];
        for(int i = 0; i < n; i++){
            int num = i + 1;
            if(num % 3 == 0 && num % 5 == 0) answer[i] = "FizzBuzz";
            else if(num % 3 == 0) answer[i] = "Fizz";
            else if(num % 5  == 0) answer[i] = "Buzz";
            else answer[i] = "" + num;
        }
        return answer;
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(1) -> Constant
        */
    }
    public static int pivotIndex(int[] nums){
        if(nums == null || nums.length == 0) return -1;
        int total = 0;
        for(int i = 0; i < nums.length; i++) total += nums[i];
        int left = 0;
        for(int i = 0; i < nums.length; i++){
            if(i != 0) left += nums[i - 1];
            if(total - nums[i] - left == left) return i;
        }
        return -1;
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(1) -> Constant
        */
    }
    public static boolean wordPattern(String pattern, String s){
        if(pattern == null || s == null || pattern.length() == 0 || s.length() == 0) return false;
        String[] words = s.split(" ");
        if(words.length != pattern.length()) return false;
        HashMap<Character, String> map = new HashMap<>();
        for(int i = 0; i < words.length; i++){
            if(!map.containsKey(pattern.charAt(i))){
                if(map.containsValue(words[i])) return false;
                map.put(pattern.charAt(i), words[i]);
            }
            else{
                if(!words[i].equals(map.get(pattern.charAt(i)))) return false;
            }
        }
        return true;
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(n) -> Linear
        */
    }
    public static String addBinary(String a, String b){
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        int sum = carry;
        while(i >= 0 || j >= 0){
            sum = carry;
            if(i >= 0) sum += a.charAt(i--) - '0';
            if(j >= 0) sum += b.charAt(j--) - '0';
            sb.append(sum % 2);
            carry = sum / 2;
        }
        if(carry > 0) sb.append(carry);
        return sb.reverse().toString();
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(1) -> Constant
        */
    }
    public static boolean doubleN(int[] arr){
        if(arr == null || arr.length < 2) return false;
        HashSet<Double> set = new HashSet<>();
        for(int i = 0; i < arr.length; i++){
            if(!set.contains((double)arr[i])){
                set.add((double)arr[i]);
                set.add((double)arr[i] * 2);
                set.add((double)arr[i] / 2);
            }
            else return true;
        }
        return false;
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(n) -> Linear
        */
    }
    public static int[] squaredSortedArray(int[] nums){
        if(nums == null || nums.length == 0) return null;
        int[] answer = new int[nums.length];
        int i = 0;
        int j = nums.length - 1;
        int counter = nums.length - 1;
        while(i < j){
            if(nums[i] * nums[i] > nums[j] * nums[j]) answer[counter--] = nums[i] * nums[i++];
            else answer[counter--] = nums[j] * nums[j--];
        }
        return answer;
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(1) -> Constant
        */
    }
    public static int longestPalindrome(String s){
        if(s == null || s.length() == 0) return 0;
        char[] letters = new char[256];
        int answer = 0;
        int odd = 0;
        for(int i = 0; i < s.length(); i++) letters[s.charAt(i) - 'A']++;
        for(int i = 0; i < letters.length; i++){
            if(letters[i] % 2 == 0) answer += letters[i];
            else odd++;
        }
        if(odd > 0) answer++;
        return answer;
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(1) -> Constant
        */
    }
    public static int maxConsecutiveOnes(int[] nums){
        if(nums == null || nums.length == 0) return 0;
        int answer = Integer.MIN_VALUE;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){ 
                count++;
                if(count > answer) answer = count;
            }
            else {
                if(count > answer) answer = count;
                count = 0;
            }
        }
        return answer;
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(1) -> Constant
        */
    }
    public static int largestNumber(int[] nums){
        if(nums == null || nums.length == 0) return -1;
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int index = -1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > first){
                second = first;
                first = nums[i];
                index = i;
            }
            else if(nums[i] > second) second = nums[i];
        }
        if(first >= second * 2) return index;
        else return -1;
    }
    public static int shortestWordDistance(String[] wordsDict, String word1, String word2){
        if(wordsDict == null || wordsDict.length == 0) return 0;
        int index1 = -1;
        int index2 = -1;
        int answer = Integer.MAX_VALUE;
        for(int i = 0; i < wordsDict.length; i++){
            if(wordsDict[i].equals(word1)) index1 = i;
            if(wordsDict[i].equals(word2)) index2 = i;
            if(index1 != -1 && index2 != -1){
                answer = Math.min(answer, Math.abs(index1 - index2));
            }
        }
        return answer;
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(1) -> Constant
        */
    }
    public static int[] plusOne(int[] digits){
        if(digits == null || digits.length == 0) return null;
        for(int i = digits.length - 1; i >= 0; i--){
            if(digits[i] != 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] answer = new int[digits.length + 1];
        answer[0] = 1;
        return answer;
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(1) -> Constant
        */
    }
    
    //SET FIVE QUESTIONS
    public static int[] twoSumII(int[] nums, int target){
        if(nums == null || nums.length == 0) return null;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(nums[i])) map.put(target - nums[i], i + 1);
            else return new int[] {map.get(nums[i]), i + 1};
        }
        return null;
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(n) -> Linear
        */
    }
    public static String addStrings(String num1, String num2){
        if(num1 == null || num1.length() == 0) return num2;
        if(num2 == null || num2.length() == 0) return num1;
        StringBuilder sb = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        int sum = carry;
        while(i >= 0 || j >= 0){
            sum = carry;
            if(i >= 0) sum += num1.charAt(i--) - '0';
            if(j >= 0) sum += num2.charAt(j--) - '0';
            sb.append(sum % 10);
            carry = sum / 10;
        }
        if(carry > 0) sb.append(carry);
        return sb.reverse().toString();
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(1) -> Constant
        */
    }
    public static boolean validAnagram(String s, String t){
        if(s == null || t == null || s.length() == 0 || t.length() == 0 || t.length() != s.length()) return false;
        char[] letters = new char[256];
        for(int i = 0; i < t.length(); i++){
            letters[s.charAt(i) - 'A']++;
            letters[t.charAt(i) - 'A']--;
        }
        for(int i = 0; i < letters.length; i++){
            if(letters[i] != 0) return false;
        }
        return true;
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(1) -> Constant
        */
    }
    public static int[] moveZeroes(int[] nums){
        if(nums == null || nums.length == 0) return null;
        int counter = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                int temp = nums[counter];
                nums[counter++] = nums[i];
                nums[i] = temp;
            }
        }
        return nums;
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(1) -> Constant
        */
    }
    public static boolean validMountainArray(int[] arr){
        if(arr == null || arr.length < 3) return false;
        if(arr[1] <= arr[0]) return false;
        boolean decresing = false;
        for(int i = 2; i < arr.length; i++){
            if(arr[i] == arr[i - 1]) return false;
            if(!decresing && arr[i] < arr[i - 1]) decresing = true;
            if(decresing && arr[i] > arr[i - 1]) return false;
        }
        return true;
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(1) -> Constant
        */
    }
    
    //SLIDING WINDOW TECHNIQUE PRACTICE
    public static int maxConsecutiveOnesII(int[] nums){
        if(nums == null || nums.length == 0) return 0;
        int left = 0;
        int right = 0;
        int zeroes = 0;
        int answer = 0;
        while(right < nums.length){
            if(nums[right] == 0) zeroes++;
            while(zeroes == 2){
                if(nums[left] == 0) zeroes--;
                left++;
            }
            answer = Math.max(answer, right - left + 1);
            right++;
        }
        return answer;
    }
    public static int[] subArrayToSum(int[] nums, int target){
        if(nums == null || nums.length == 0) return null;
        int[] answer = new int[2];
        int sub = 0;
        int left = 0;
        int right = 0;
        while(right < nums.length){
            while(sub <= target){
                if(sub == target){
                    answer[0] = left;
                    answer[1] = right - 1;
                    return answer;
                }
                sub += nums[right++];
            }
            sub -= nums[left++];
        }
        return null;
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(1) -> Constant
        */
    }
    
    //LEFT OVER QUESTIONS WE WILL NEED TO REVIEW AND PRACTICE SIMILAR QUESTIONS
    public static int numOfTeams(int[] rating){
        if(rating == null || rating.length == 0) return 0;
        int answer = 0;
        for(int j = 0; j < rating.length; j++){
            int smallerLeft = 0;
            int biggerLeft = 0;
            int smallerRight = 0;
            int biggerRight = 0;
            for(int i = j - 1; i >= 0; i--){
                if(rating[i] > rating[j]) biggerLeft++;
                else if(rating[i] < rating[j]) smallerLeft++;
            }
            for(int k = j + 1; k < rating.length; k++){
                if(rating[k] > rating[j]) biggerRight++;
                else if(rating[k] < rating[j]) smallerRight++;
            }
            answer += smallerLeft * biggerRight + biggerLeft * smallerRight;
        }
        
        return answer;
        /*
        Time Complexity: O(n^2) -> Exponential
        Space Complexity: O(1) -> Constant
        */
    } //from set 3
    public static int excelColumnNumber(String columnTitle){
        if(columnTitle == null || columnTitle.length() == 0) return 0;
        int answer = 0;
        for(int i = 0; i < columnTitle.length(); i++){
            answer *= 26;
            answer += columnTitle.charAt(i) - 'A' + 1;
        }
        return answer;
        /*
        Time Complexity: O(n) -> Linear
        Space Complexity: O(1) -> Constant
        */
    } //from set 5
    public static boolean strobogrammaticNumber(String num){
        if(num == null || num.length() == 0) return false;
        StringBuilder answer = new StringBuilder();
        for(int i = 0; i < num.length(); i++){
            char c = num.charAt(i);
            if(c == '1' || c == '0' || c == '8') answer.append(c);
            else if(c == '6') answer.append('9');
            else if(c == '9') answer.append('6');
            else return false;
        }
        return answer.reverse().toString().equals(num);
    } //from set 5
}