import java.util.HashMap;
import java.util.List;

import org.w3c.dom.Node;

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {}

    public Node(int _val,List<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
};
*/
class Solution {

    public Node cloneGraph(Node node) {
        HashMap<Integer, Node> nodeMap = new HashMap<>();
        Node clone = cloneOrGet(node, nodeMap);
        return clone;
    }

    private Node cloneOrGet(Node node, HashMap<Integer, Node> nodeMap) {
        if (node == null) return null;

        if (nodeMap.containsKey(node.val)){
            return nodeMap.get(node.val);
        }

        Node clone = new Node(node.val);
        nodeMap.put(clone.val, clone);
        List<Node> list = new ArrayList();

        for (Node neighbor: node.neighbors) {
            list.add(cloneOrGet(neighbor, nodeMap));
        }

        clone.neighbors = list;
        return clone;
    }
}