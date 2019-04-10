package String;

import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 */
public class LengthOfLongestSubstring2 {
    public int subString(String s){
        int n = s.length();
        Set<Character> set = new HashSet();
        //定义前后游标，前后游标向后滑动
        int ans=0,i=0,j=0;
        while(i < n && j < n){
            if(!set.contains(s.charAt(j))){
                //移动后游标
                set.add(s.charAt(j++));
                ans = Math.max(ans,j-i);
            }else{
                //移动前游标
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }
}
