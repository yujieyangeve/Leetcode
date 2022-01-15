//Definition for singly-linked list.
class ListNode {
  val: number;
  next: ListNode | null;
  constructor(val?: number, next?: ListNode | null) {
    this.val = val === undefined ? 0 : val;
    this.next = next === undefined ? null : next;
  }
}

function addTwoNumbers(l1: ListNode | null, l2: ListNode | null): ListNode | null {
  if (l1 === null && l2 === null) return null;
 return recur(l1, l2, 0);
};

function recur(l1: ListNode | null, l2: ListNode | null, add: number): ListNode | null {
  let curVal = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + add;
  let res = new ListNode(curVal % 10);
  let next = recur(l1 == null ? l1 : l1.next, l2 == null ? l2 : l2.next, curVal / 10);
  res.next = next;
  return res;
}
