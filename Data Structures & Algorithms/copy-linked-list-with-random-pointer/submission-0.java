/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node, Node> map = new HashMap<>();
        Node copy = head;

        while (copy != null) {
        map.put(copy, new Node(copy.val));
        copy = copy.next;
        }
        
        copy = head;
        while (copy != null) {
            map.get(copy).next = map.get(copy.next);
            map.get(copy).random = map.get(copy.random);
            copy = copy.next;
        }
        return map.get(head);
    }
}
