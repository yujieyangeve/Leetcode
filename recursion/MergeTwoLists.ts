//Definition for singly-linked list.
class ListNode {
  val: number;
  next: ListNode | null;
  constructor(val?: number, next?: ListNode | null) {
    this.val = val === undefined ? 0 : val;
    this.next = next === undefined ? null : next;
  }
}

function mergeTwoLists(list1: ListNode | null, list2: ListNode | null): ListNode | null {
  if (list1 === null && list2 === null) return null;
  if (list1 !== null && list2 === null) return list1;
  if (list2 !== null && list1 === null) return list2;
  let head = null;
  if (list1 !==null && list2 !== null){
    let node;
    if (list1.val > list2.val) {
      head = list2;
      const tmp = list2;
      head.next = list1;
      node = mergeTwoLists(list1, tmp.next);
    } else {
      head = list1;
      const tmp = list1;
      head.next = list2;
      node = mergeTwoLists(tmp.next, list2);
    }
    head.next = node;
  }
  return head;
}
