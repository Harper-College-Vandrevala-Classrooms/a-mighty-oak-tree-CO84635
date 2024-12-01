package com.csc;

public class OakTree {
  static class Node {
    Squirrel squirrelData;
    Node left;
    Node right;

    public Node(Squirrel squirrelObject) {
      squirrelData = squirrelObject;
      left = right = null;
    }

    public void setLeft(Node squirrelNode) {
      left = squirrelNode;
    }

    public void setRight(Node squirrelNode) {
      right = squirrelNode;
    }

    public Node left() {
      return left;
    }

    public Node right() {
      return right;
    }

    public String getName() {
      return squirrelData.getName();
    }
  }

  class BinaryTree {
    Node root;
    
    BinaryTree(Squirrel squirrelItem) {
      root = new Node(squirrelItem);
    }

    BinaryTree() {
      root = null;
    }

    public void traverse(Node node) {
      if (node != null) {
        System.out.println(node.getName()); 
        traverse(node.left()); 
        traverse(node.right()); 
      }
    }
  }

  public static void main(String[] args) {
    System.out.println("Testing empty tree.");
    BinaryTree emptyTree = new OakTree().new BinaryTree();
    System.out.println("Traversing empty tree:");
    emptyTree.traverse(emptyTree.root);
    System.out.println("Empty tree test completed.\n");

    System.out.println("Testing single tree.");
    Squirrel soloSquirrel = new Squirrel("Lonely Squirrel");
    BinaryTree singleTree = new OakTree().new BinaryTree(soloSquirrel);

    System.out.println("Traversing single tree:");
    singleTree.traverse(singleTree.root); 
    System.out.println("Single node tree test completed.");

    System.out.println("Testing regular tree.");
    Squirrel cheeks = new Squirrel("Cheeks");
    Squirrel squeaks = new Squirrel("Squeaks");
    Squirrel fluffybutt = new Squirrel("Mr. Fluffy Butt");

    BinaryTree tree = new OakTree().new BinaryTree(cheeks);
    Node root = tree.root;
    Node leftChild = new Node(squeaks);
    Node rightChild = new Node(fluffybutt);

    root.setLeft(leftChild);
    root.setRight(rightChild);
    tree.traverse(root);
    System.out.println("Regular tree test completed.");

    System.out.println("Testing unbalanced tree");
    Squirrel rootSquirrel = new Squirrel("Cheeks");
    Squirrel rightSquirrel1 = new Squirrel("Squeaks");
    Squirrel rightSquirrel2 = new Squirrel("Mr. Fluffy Butt");

    Node unbalancedRoot = new Node(rootSquirrel);
    Node rightChildNode = new Node(rightSquirrel1);
    Node rightChildTwoNode = new Node(rightSquirrel2);

    unbalancedRoot.setRight(rightChildNode);
    rightChildNode.setRight(rightChildTwoNode);

    System.out.println("Traversing unbalanced tree:");
    tree.traverse(unbalancedRoot);
    System.out.println("Unbalanced tree test completed.\n");

    System.out.println("Testing large tree.");
    Squirrel cheeks1 = new Squirrel("Cheeks");
    Squirrel squeaks2 = new Squirrel("Squeaks");
    Squirrel fluffybutt3 = new Squirrel("Mr. Fluffy Butt");
    Squirrel brandon = new Squirrel("Brandon");
    Squirrel connor = new Squirrel("Connor");
    Squirrel owen = new Squirrel("Owen");
    Squirrel louis = new Squirrel("Louis");
    Squirrel joey = new Squirrel("Joey");
    Squirrel nolan = new Squirrel("Nolan");

    BinaryTree largeTree = new OakTree().new BinaryTree(cheeks1);
    Node root3 = largeTree.root;

    Node leftChild3 = new Node(squeaks2);
    Node rightChild3 = new Node(fluffybutt3);

    Node leftLeft = new Node(brandon);
    Node leftRight = new Node(connor);
    Node rightLeft = new Node(owen);
    Node rightRight = new Node(louis);

    Node leftLeftLeft = new Node(joey);
    Node rightRightRight = new Node(nolan);

    root3.setLeft(leftChild3);
    root3.setRight(rightChild3);

    leftChild3.setLeft(leftLeft);
    leftChild3.setRight(leftRight);
    rightChild3.setLeft(rightLeft);
    rightChild3.setRight(rightRight);

    leftLeft.setLeft(leftLeftLeft);
    rightRight.setRight(rightRightRight);

    largeTree.traverse(root3);
    System.out.println("Large tree test completed.");
  }
}
