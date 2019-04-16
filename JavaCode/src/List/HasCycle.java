package List;

import List.Base.ListNode;

/**
 * 判断一个链表中是否有环
 * 使用两个快慢节点，如果慢节点追上快节点，说明有环
 */
public class HasCycle {
    public boolean hasCycle(ListNode head){
        if(head == null){
            return false;
        }
        ListNode node = head;
        ListNode fastNode = head;
        while(node != null){
            if(fastNode == null || fastNode.next == null){
                return false;
            }
            fastNode = fastNode.next.next;
            node = node.next;
            if(fastNode == node){
                return true;
            }
        }
        return false;
    }
}
