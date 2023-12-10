package linkedlist;

/**
 * @author: SGJ
 * @date: 2023/12/10
 * @description: 给你两个单链表的头节点 headA 和 headB ，
 * 请你找出并返回两个单链表相交的起始节点。
 * 如果两个链表不存在相交节点，返回 null 。
 */


@SuppressWarnings("all")
public class GetIntersectionNode {
    // 如果两个链表之间存在交点, 且长度不一致,
    // 那么curA和curB走完自己的链表再去从头走
    // 对方的链表, 那么一定会走相同的步数到相
    // 交结点
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curA = headA;
        ListNode curB = headB;

        while(curA != curB) {
            // curA走到本链表的末尾，那么就从curB的开头走
            if (curA == null) curA = headB;
            else curA = curA.next;

            // curB走到本链表的末尾，那么就从curA的开头走
            if (curB == null) curB = headA;
            else curB = curB.next;
        }
        return curA;
    }
}

 class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}



