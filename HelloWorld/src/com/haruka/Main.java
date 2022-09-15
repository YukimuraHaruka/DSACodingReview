package com.haruka;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
//        var list = new LinkedList();
//        list.addLast(10);
//        list.addLast(20);
//        list.addLast(30);
//        list.addLast(40);
//        list.addLast(50);
//        //list.reverse();
//        System.out.println(list.getKthFromTheEnd(2));
//        var array = list.toArray();
//        System.out.println(Arrays.toString(array));
//        //System.out.println(list.indexOf(40));
//        //System.out.println(list.contains(10));

//        String str = "abcd";
//        StringReverser reverser = new StringReverser();
//
//        var result = reverser.reverse(str);
//        System.out.println(result);

//        String str = "(1 + 2)";
//        Expression exp = new Expression();
//        var result = exp.isBalanced(str);
//        System.out.println(result);
//        Stack stacc = new Stack();
//        stacc.push(10);
//        stacc.push(20);
//        stacc.push(30);
//        stacc.pop();
//        System.out.println(stacc.peek());

//        ArrayQueue queue = new ArrayQueue(5);
//        queue.enqueue(10);
//        queue.enqueue(20);
//        queue.enqueue(30);
//        queue.enqueue(40);
//        queue.enqueue(50);
//        queue.dequeue();
//        queue.enqueue(60);
//        System.out.println(queue);

//        QueueWithTwoStacks queue = new QueueWithTwoStacks();
//        queue.enqueue(10);
//        queue.enqueue(20);
//        queue.enqueue(30);
//        queue.dequeue();
//        queue.dequeue();
//        var first = queue.dequeue();
//        System.out.println(first);

//        PriorityQueue queue = new PriorityQueue();
//        queue.add(5);
//        queue.add(3);
//        queue.add(6);
//        queue.add(1);
//        queue.add(4);
//        System.out.println(queue);
//        while(!queue.isEmpty()){
//            System.out.println(queue.remove());
//        }

//        CharFinder finder = new CharFinder();
//        var ch = finder.findFirstNonRepeatingChar("a green apple");
//        System.out.println(ch);

//        HashTable table = new HashTable();
//        table.put(6, "A"); // 1
//        table.put(8, "B"); // 3
//        table.put(11, "C"); // 1
//        table.put(6, "A+");
//        table.remove(60);
//        System.out.println(table.get(6));

//        Tree tree = new Tree();
//        tree.insert(7);
//        tree.insert(4);
//        tree.insert(9);
//        tree.insert(1);
//        tree.insert(6);
//        tree.insert(8);
//        tree.insert(10);
//
//        Tree tree2 = new Tree();
//        tree2.insert(7);
//        tree2.insert(4);
//        tree2.insert(9);
//        tree2.insert(1);
//        tree2.insert(6);
//        tree2.insert(8);
//        tree2.insert(10);
//        tree.traversePreOrder();
//        System.out.println(tree.isBinarySearchTree());
//        var list = tree.getNodesAtDistance(1);
//        for(var item: list){
//            System.out.println(item);
//        }
//        tree.traverseLevelOrder();

//    var tree = new AVLTree();
//    tree.insert(10);
//    tree.insert(30);
//    tree.insert(20);

//        var heap = new Heap();
//        heap.insert(10);
//        heap.insert(5);
//        heap.insert(17);
//        heap.insert(4);
//        heap.insert(22);
//        heap.remove();
//        System.out.println("Done");
//    int[] numbers = {5, 3, 10, 1, 4, 2};
//    var heap = new Heap();
//    for (var number: numbers){
//        heap.insert(number);
//    }
//    for(var i = 0; i < numbers.length; i++){
//        numbers[i] = heap.remove();
//    }
//        System.out.println(Arrays.toString(numbers));

//    int[] numbers = {5, 3, 8, 4, 1, 2};
//    MaxHeap.heapify(numbers);
//        System.out.println(Arrays.toString(numbers));
//        System.out.println(MaxHeap.getKthLargest(numbers, 1));


//        var trie = new Trie();
//        trie.insert("car");
//        trie.insert("care");
//        trie.insert("careful");
//        trie.insert("card");
//        trie.insert("egg");
//        var words = trie.findWords("cargo");
//        System.out.println(words);
        //trie.traverse();

//        var graph = new Graph();
//        graph.addNode("X");
//        graph.addNode("A");
//        graph.addNode("B");
//        graph.addNode("P");
//        graph.addEdge("X", "A");
//        graph.addEdge("X", "B");
//        graph.addEdge("A", "P");
//        graph.addEdge("B", "P");
//        var list = graph.topologicalSort();
//        System.out.println(list);
        //graph.print();

//        var graph = new Graph();
//        graph.addNode("A");
//        graph.addNode("B");
//        graph.addNode("C");
//        graph.addEdge("A", "B");
//        graph.addEdge("B", "C");
//        graph.addEdge("C", "A");
//        System.out.println(graph.hasCycle());

//        var graph = new WeightedGraph();
//        graph.addNode("A");
//        graph.addNode("B");
//        graph.addNode("C");
//        graph.addNode("D");
//        graph.addEdge("A", "B", 3);
//        graph.addEdge("B", "D", 4);
//        graph.addEdge("C", "D", 5);
//        graph.addEdge("A", "C", 1);
//        graph.addEdge("B", "C", 2);
//        var tree = graph.GetMinimumSpanningTree();
//        tree.print();

//        int[] numbers = {7,3,1,4,6,2,3};
//        var sorter = new BucketSort();
//        sorter.sort(numbers, 3);
//        System.out.println(Arrays.toString((numbers)));

        int[] numbers = {1,3,5,6,7};
        var search = new Search();
        var index = search.exponentialSearch(numbers,1);
        System.out.println("found at index " + index);
    }
}
