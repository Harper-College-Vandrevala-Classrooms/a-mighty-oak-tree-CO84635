package com.csc;

public class OakTree {
  static class Node<T extends Name> {
    T data;
    Node<T> left;
    Node<T> right;

    public Node(T Object) {
      this.data = Object;
      this.left = this.right = null;
    }

    public void setLeft(Node<T> objectNode) {
      this.left = objectNode;
    }

    public void setRight(Node<T> objectNode) {
      this.right = objectNode;
    }

    public Node<T> left() {
      return left;
    }

    public Node<T> right() {
      return right;
    }

    public String getName() {
      return data.getName();
    }
  }

  class BinaryTree<T extends Name> {
    Node<T> root;

    BinaryTree() {
      root = null;
    }
    
    BinaryTree(T data) {
      root = new Node<>(data);
    }

    public void traverse(Node<T> node) {
      if (node != null) {
        System.out.println(node.getName()); 
        traverse(node.left()); 
        traverse(node.right()); 
      }
    }
  }

  public static void main(String[] args) {
    {
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

  {
    System.out.println("Testing empty tree.");
    BinaryTree<StrawHat> emptyTree = new OakTree().new BinaryTree<>();
    System.out.println("Traversing empty tree:");
    emptyTree.traverse(emptyTree.root);
    System.out.println("Empty tree test completed.\n");

    System.out.println("Testing single tree.");
    StrawHat soloStrawHat = new StrawHat("Monkey D. Luffy");
    BinaryTree<StrawHat> singleTree = new OakTree().new BinaryTree<>(soloStrawHat);

    System.out.println("Traversing single tree:");
    singleTree.traverse(singleTree.root); 
    System.out.println("Single node tree test completed.");

    System.out.println("Testing regular tree.");
    StrawHat luffy = new StrawHat("Monkey D. Luffy");
    StrawHat zoro = new StrawHat("Roronoa Zoro");
    StrawHat nami = new StrawHat("Nami");

    BinaryTree<StrawHat> tree = new OakTree().new BinaryTree<>(luffy);
    Node<StrawHat> root = tree.root;
    Node<StrawHat> leftChild = new Node<>(zoro);
    Node<StrawHat> rightChild = new Node<>(nami);

    root.setLeft(leftChild);
    root.setRight(rightChild);
    tree.traverse(root);
    System.out.println("Regular tree test completed.");

    System.out.println("Testing unbalanced tree");
    StrawHat rootHat = new StrawHat("Monkey D. Luffy");
    StrawHat rightHat1 = new StrawHat("Roronoa Zoro");
    StrawHat rightHat2 = new StrawHat("Nami");

    Node<StrawHat> unbalancedRoot = new Node<>(rootHat);
    Node<StrawHat> rightChildNode = new Node<>(rightHat1);
    Node<StrawHat> rightChildTwoNode = new Node<>(rightHat2);

    unbalancedRoot.setRight(rightChildNode);
    rightChildNode.setRight(rightChildTwoNode);

    System.out.println("Traversing unbalanced tree:");
    tree.traverse(unbalancedRoot);
    System.out.println("Unbalanced tree test completed.\n");

    System.out.println("Testing large tree.");
    StrawHat luffy1 = new StrawHat("Monkey D. Luffy");
    StrawHat zoro2 = new StrawHat("Roronoa Zoro");
    StrawHat nami3 = new StrawHat("Nami");
    StrawHat usopp = new StrawHat("Usopp");
    StrawHat sanji = new StrawHat("Sanji");
    StrawHat chopper = new StrawHat("Tony Tony Chopper");
    StrawHat robin = new StrawHat("Nico Robin");
    StrawHat franky = new StrawHat("Franky");
    StrawHat brook = new StrawHat("Brook");

    BinaryTree<StrawHat> largeTree = new OakTree().new BinaryTree<>(luffy1);
    Node<StrawHat> root3 = largeTree.root;

    Node<StrawHat> leftChild3 = new Node<>(zoro2);
    Node<StrawHat> rightChild3 = new Node<>(nami3);

    Node<StrawHat> leftLeft = new Node<>(usopp);
    Node<StrawHat> leftRight = new Node<>(sanji);
    Node<StrawHat> rightLeft = new Node<>(chopper);
    Node<StrawHat> rightRight = new Node<>(robin);

    Node<StrawHat> leftLeftLeft = new Node<>(franky);
    Node<StrawHat> rightRightRight = new Node<>(brook);

    root3.setLeft(leftChild3);
    root3.setRight(rightChild3);

    leftChild3.setLeft(leftLeft);
    leftChild3.setRight(leftRight);
    rightChild3.setLeft(rightLeft);
    rightChild3.setRight(rightRight);

    leftLeft.setLeft(leftLeftLeft);
    rightRight.setRight(rightRightRight);

    largeTree.traverse(root3);
    System.out.println("Large tree test completed.\n");
  }

  {
    System.out.println("Testing empty tree.");
    BinaryTree<ComputerPart> emptyTree = new OakTree().new BinaryTree<>();
    System.out.println("Traversing empty tree:");
    emptyTree.traverse(emptyTree.root);
    System.out.println("Empty tree test completed.\n");

    System.out.println("Testing single tree.");
    ComputerPart soloPart = new ComputerPart("CPU");
    BinaryTree<ComputerPart> singleTree = new OakTree().new BinaryTree<>(soloPart);

    System.out.println("Traversing single tree:");
    singleTree.traverse(singleTree.root); 
    System.out.println("Single node tree test completed.");

    System.out.println("Testing regular tree.");
    ComputerPart cpu = new ComputerPart("CPU");
    ComputerPart motherboard = new ComputerPart("Motherboard");
    ComputerPart ram = new ComputerPart("RAM");

    BinaryTree<ComputerPart> tree = new OakTree().new BinaryTree<>(cpu);
    Node<ComputerPart> root = tree.root;
    Node<ComputerPart> leftChild = new Node<>(motherboard);
    Node<ComputerPart> rightChild = new Node<>(ram);

    root.setLeft(leftChild);
    root.setRight(rightChild);
    tree.traverse(root);
    System.out.println("Regular tree test completed.");

    System.out.println("Testing unbalanced tree");
    ComputerPart rootPart = new ComputerPart("CPU");
    ComputerPart rightPart1 = new ComputerPart("Motherboard");
    ComputerPart rightPart2 = new ComputerPart("RAM");

    Node<ComputerPart> unbalancedRoot = new Node<>(rootPart);
    Node<ComputerPart> rightChildNode = new Node<>(rightPart1);
    Node<ComputerPart> rightChildTwoNode = new Node<>(rightPart2);

    unbalancedRoot.setRight(rightChildNode);
    rightChildNode.setRight(rightChildTwoNode);

    System.out.println("Traversing unbalanced tree:");
    tree.traverse(unbalancedRoot);
    System.out.println("Unbalanced tree test completed.\n");

    System.out.println("Testing large tree.");
    ComputerPart cpu1 = new ComputerPart("CPU");
    ComputerPart motherboard2 = new ComputerPart("Motherboard");
    ComputerPart ram2 = new ComputerPart("RAM");
    ComputerPart gpu = new ComputerPart("GPU");
    ComputerPart ssd = new ComputerPart("SSD");
    ComputerPart powerSupply = new ComputerPart("Power Supply");
    ComputerPart hdd = new ComputerPart("HDD");
    ComputerPart casePart = new ComputerPart("Case");
    ComputerPart fan = new ComputerPart("Fan");

    BinaryTree<ComputerPart> largeTree = new OakTree().new BinaryTree<>(cpu1);
    Node<ComputerPart> root3 = largeTree.root;

    Node<ComputerPart> leftChild3 = new Node<>(motherboard2);
    Node<ComputerPart> rightChild3 = new Node<>(ram2);

    Node<ComputerPart> leftLeft = new Node<>(gpu);
    Node<ComputerPart> leftRight = new Node<>(ssd);
    Node<ComputerPart> rightLeft = new Node<>(powerSupply);
    Node<ComputerPart> rightRight = new Node<>(hdd);

    Node<ComputerPart> leftLeftLeft = new Node<>(casePart);
    Node<ComputerPart> rightRightRight = new Node<>(fan);

    root3.setLeft(leftChild3);
    root3.setRight(rightChild3);

    leftChild3.setLeft(leftLeft);
    leftChild3.setRight(leftRight);
    rightChild3.setLeft(rightLeft);
    rightChild3.setRight(rightRight);

    leftLeft.setLeft(leftLeftLeft);
    rightRight.setRight(rightRightRight);

    largeTree.traverse(root3);
    System.out.println("Large tree test completed.\n");
  }
  }
}
