class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // Base cases
        // return l2 if l1 points to null
        if(l1==null)
            return l2;
        
        // return l1 if l2 points to null
        if(l2==null)
            return l1;
        
        // l1 should points to lower and l2 points to higher 
        if(l1.val>l2.val){
            ListNode temp = l1;
            l1 = l2;
            l2 = temp;
        }
        
        // Traverse in l1 and l2 till l1 and l2 points to null
        ListNode res = l1;
        while(l1!=null && l2!=null){
            ListNode tmp = null;
            while(l1!=null && l1.val<=l2.val){
                tmp = l1;
                l1 = l1.next;
            }
            tmp.next = l2;
            
            // Swap l1 and l2
            ListNode temp = l1;
            l1 = l2;
            l2 = temp;
        }
        return res;
    }
}