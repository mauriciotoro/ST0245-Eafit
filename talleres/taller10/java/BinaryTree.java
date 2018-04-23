

public class BinaryTree {
	public Node root;
 
	private void recursivePrintAUX(Node node)
	{
		if (node != null)
		{
			recursivePrintAUX(node.left);
			recursivePrintAUX(node.right);
			System.out.println(node.data);
		}
		
		
	}
	public void recursivePrint()
	{
		recursivePrintAUX(root);
	}
		

	
 
}
