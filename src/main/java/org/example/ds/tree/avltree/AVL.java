package org.example.ds.tree.avltree;

import org.example.ds.tree.avltree.BinaryNode;

import java.util.LinkedList;
import java.util.Queue;

public class AVL {
	BinaryNode root;

	// Constructor
	AVL() {
		root = null;
	}

  // PreOrder Traversal
  public void preOrder(BinaryNode node) {
   if (node == null) {
     return;
   }
   System.out.print(node.val + " ");
   preOrder(node.left);
   preOrder(node.right);
 }

 // Inorder Traversal
 public void inOrder(BinaryNode node) {
   if (node == null) {
     return;
   }
   inOrder(node.left);
   System.out.print(node.val + " ");
   inOrder(node.right);


 }

 // PostOrder Traversal
 public void postOrder(BinaryNode node) {
   if (node == null) {
     return;
   }
   postOrder(node.left);
   postOrder(node.right);
   System.out.print(node.val + " ");
 }

 // Level Order

 void levelOrder() {
   Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
   queue.add(root);
   while (!queue.isEmpty()) {
     BinaryNode presentNode = queue.remove();
     System.out.print(presentNode.val + " ");
     if (presentNode.left != null) {
       queue.add(presentNode.left);
     }
     if (presentNode.right != null) {
       queue.add(presentNode.right);
     }
   }
 }

 // Search Method
 BinaryNode search(BinaryNode node, int val) {
   if (node == null ) {
     System.out.println("val: "+ val+ " not found in AVL");
     return null;
   } else if (node.val == val) {
     System.out.println("val: "+ val+ " found in AVL");
     return node;
   } else if (val < node.val) {
     return search(node.left, val);
   } else {
     return search(node.right, val);
   }
 }

//  getHeight
  public int getHeight(BinaryNode node) {
    if (node == null) {
      return 0;
    }
    return node.height;
  }

  // rotateRight
  private BinaryNode rotateRight(BinaryNode disbalancedNode) {
    BinaryNode newRoot = disbalancedNode.left;
    disbalancedNode.left = disbalancedNode.left.right;
    newRoot.right = disbalancedNode;
    disbalancedNode.height = 1 + Math.max(getHeight(disbalancedNode.left), getHeight(disbalancedNode.right));
    newRoot.height = 1 + Math.max(getHeight(newRoot.left), getHeight(newRoot.right));
    return newRoot;
  }

  // rotateLeft
  private BinaryNode rotateLeft(BinaryNode disbalancedNode) {
    BinaryNode newRoot = disbalancedNode.right;
    disbalancedNode.right = disbalancedNode.right.left;
    newRoot.left = disbalancedNode;
    disbalancedNode.height = 1 + Math.max(getHeight(disbalancedNode.left), getHeight(disbalancedNode.right));
    newRoot.height = 1 + Math.max(getHeight(newRoot.left), getHeight(newRoot.right));
    return newRoot;
  }

  // getBalance
  public int getBalance(BinaryNode node) {
    if (node == null) {
      return 0;
    }
    return getHeight(node.left) - getHeight(node.right);
  }

  // insertNode Method
  private BinaryNode insertNode(BinaryNode node, int nodeval) {
    if (node == null) {
      BinaryNode newNode = new BinaryNode();
      newNode.val = nodeval;
      newNode.height = 1;
      return newNode;
    } else if (nodeval < node.val) {
      node.left = insertNode(node.left, nodeval);
    } else {
      node.right = insertNode(node.right, nodeval);
    }

    node.height = 1 + Math.max(getHeight(node.left), getHeight(node.right));
    int balance = getBalance(node);

    if (balance > 1 && nodeval < node.left.val) {
      return rotateRight(node);
    }

    if (balance > 1 && nodeval > node.left.val) {
      node.left = rotateLeft(node.left);
      return rotateRight(node);
    }

    if (balance < -1 && nodeval > node.right.val) {
      return rotateLeft(node);
    }

    if (balance < - 1 && nodeval < node.right.val) {
      node.right = rotateRight(node.right);
      return rotateLeft(node);
    }

    return node;

  }

  public void insert(int val) {
    root = insertNode(root, val);
  }

  // // Minimum node
  public static BinaryNode minimumNode(BinaryNode root) {
    if (root.left == null) {
      return root;
    } else {
      return minimumNode(root.left);
    }
  }

  // Delete node
 public BinaryNode deleteNode(BinaryNode node, int val) {
   if (node == null) {
     System.out.println("val not found in AVL");
     return node;
   }
   if (val < node.val) {
     node.left = deleteNode(node.left, val);
   } else if (val > node.val) {
     node.right = deleteNode(node.right, val);
   } else {
     if (node.left != null && node.right != null) {
       BinaryNode temp = node;
       BinaryNode minNodeForRight = minimumNode(temp.right);
       node.val = minNodeForRight.val;
       node.right = deleteNode(node.right, minNodeForRight.val);
     } else if (node.left != null) {
       node = node.left;
     } else if (node.right != null) {
       node = node.right;
     } else {
       node = null;
     }
   }
   // Case 2 - rotation required

   // System.out.println("1");
   // System.out.println(previous.val);

   // node.height = 1 + Math.max(getHeight(node.left), getHeight(node.right));
   int balance = getBalance(node);

   if (balance > 1 && getBalance(node.left) >= 0) {
     return rotateRight(node);
   }
   if (balance > 1 && getBalance(node.left) < 0) {
     node.left = rotateLeft(node.left);
     return rotateRight(node);
   }
   if (balance < -1 && getBalance(node.right) <= 0) {
     return rotateLeft(node);
   }

   if (balance < -1 && getBalance(node.right) > 0) {
     node.right = rotateRight(node.right);
     return rotateLeft(node);
   }

   return node;

 }

 public void delete(int val) {
   root = deleteNode(root, val);
 }

 public void deleteAVL() {
   root = null;
 }


}
