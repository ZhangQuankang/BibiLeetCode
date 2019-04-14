package List;

/**
 *  请编写一个函数，使其可以删除某个链表中给定的（非末尾）节点，你将只被给定要求被删除的节点。
 *
 *  例如：
 *  输入: head = [4,5,1,9], node = 5
 *  输出: [4,1,9]
 */
public class DeleteNode {

    //题目本身未给出头结点，而给出了要删除的结点，所以可以把该结点当作头结点，删除头结点

    public void deletcNode(ListNode node){
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
