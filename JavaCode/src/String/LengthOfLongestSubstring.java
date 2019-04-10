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
public class LengthOfLongestSubstring {
    public int subString(String s){
        int n = s.length();
        int ans = 0;
        //两层循环取字符串值
        for(int i = 0;i < n;i++){
            for(int j = i; j <= n;j++){
                if(allUnique(s,i,j)){
                    //取出最大的一条
                    ans = Math.max(ans,j-i);
                }
            }
        }
        return ans;
    }

    /**
     * 将子字符串的字符存入set中,并且保存的子字符一定不会重复
     * @param s
     * @param start
     * @param end
     * @return
     */
    public boolean allUnique(String s,int start,int end){
        Set<Character> set = new HashSet<>();
        for(int i=start;i<end;i++){
            Character ch = s.charAt(i);
            if(set.contains(ch)){
                return false;
            }
            set.add(ch);
        }
        return true;
    }
}
