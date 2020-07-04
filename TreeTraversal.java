class Node { 
	int value; 
	Node left;
	Node right; 

	Node(int x) 
	{ 
		value = x; 
		left =  null;
		right = null; 
	} 
} 
class TreeTraversal { 
	Node root; 
	void MorrisTrav(Node root) 
	{ 
		Node current_node, predecessor; 
		if (root == null) 
			return; 

		current_node = root; 
		while (current_node != null) { 
			if (current_node.left == null) { 
				System.out.print(current_node.value + " "); 
				current_node = current_node.right; 
			} 
			else { 
				predecessor = current_node.left; 
				while (predecessor.right != null && predecessor.right != current_node) 
					predecessor = predecessor.right; 
				if (predecessor.right == null) { 
					predecessor.right = current_node; 
					current_node = current_node.left; 
				} 
				else { 
					predecessor.right = null; 
					System.out.print(current_node.value + " "); 
					current_node = current_node.right; 
				} 
			} 
		}
	} 

	public static void main(String args[]) 
	{ 
		TreeTraversal tree = new TreeTraversal(); 
		tree.root = new Node(14); 
		tree.root.left = new Node(12); 
		tree.root.right = new Node(15); 
		tree.root.left.left = new Node(11);
		tree.MorrisTrav(tree.root); 
	} 
} 