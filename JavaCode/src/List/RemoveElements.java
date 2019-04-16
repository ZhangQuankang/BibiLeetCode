package List;

import List.Base.ListNode;

/**
 * 删除链表中等于给定值 val 的所有节点。
 * 例如：
 * 输入: 1->2->6->3->4->5->6, val = 6
 * 输出: 1->2->3->4->5
 */
public class RemoveElements {
    public ListNode removeElements(ListNode head,int val){
        ListNode header = new ListNode(-1);
        header.next = head;
        ListNode result = header;
        while(header.next != null){
            if(header.next.val == val){
                header.next = header.next.next;
            }else{
                header = header.next;
            }
        }
        return result.next;

    }
}
