class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs== null || strs.length == 0) {
        	return "";
        } 

        return helper(strs[0], 0, strs);
    }

    private String helper(String prev, int index, String[] strs) {
    	if (index == strs.length) {
    		return prev;
    	}

    	int i = 0;
    	String cur = strs[index];
    	int len = Math.min(prev.length(), cur.length());

		while (i < len && prev.charAt(i) == cur.charAt(i)) {
			i++;
		}

		return helper(prev.substring(0, i), index + 1, strs);
    }
}