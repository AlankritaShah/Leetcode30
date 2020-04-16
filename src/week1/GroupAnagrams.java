package week1;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
/**
 * 
@author alankrita
Given an array of strings, group anagrams together.

Example:

Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]
Note:

All inputs will be in lowercase.
The order of your output does not matter.
 *
 */

public class GroupAnagrams {
	public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> output = new ArrayList<>();
        HashMap<HashMap<Character, Integer>, List<String>> input = new HashMap<>();
        for(String str : strs){
            HashMap<Character, Integer> map = createHashMap(str);
            List<String> list;
            if(input.containsKey(map))
            {
                list = input.get(map);
            }
            else{
                list = new ArrayList<>();
            }
            list.add(str);
            input.put(map, list);
        }
        
        for(HashMap.Entry<HashMap<Character, Integer>, List<String>> entry : input.entrySet())
            output.add(entry.getValue());
        
        return output;
    }
    
    private HashMap<Character, Integer> createHashMap(String str)
    {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
            Character c = str.charAt(i);
            if(!map.containsKey(c))
                map.put(c, 0);
            map.put(c, map.get(c)+1);
        }
        return map;
    }
    
    public static void main(String [] args)
	{
		System.out.println(new GroupAnagrams().groupAnagrams(new String[] {"eat", "tea", "tan", "ate", "nat", "bat"}));
	}	
}
