/**
 * Description:
 * This class, Order() utilizes regular and recursive methods to help form a binary tree.
 * 
 * @author Ali Ouakhchachi
 * @contact ls7771en@go.minnstate.edu
 * @since 11/25/2024
 * 
 * Institution: Metro State University
 * Course: ICS 240
 * 
 * Professor: Sena Houeto
 * 
 */
import java.text.DecimalFormat;

public class Order {
	private BSTNode root;
	private String tableID;
	private static String restaurantName = "Burny's";
	
	public Order(String tableID) {
		this.tableID = tableID;
		this.root = null;
	}
	
	public void insert( MenuItem m ) {
		root = insertRec(root, m);
	}
	
	// Recursive Method
	private BSTNode insertRec( BSTNode root, MenuItem m ) {
		if (root == null) {
            return new BSTNode(m, null, null);
        }

        int compareResult = m.compareTo(root.getData());
        if (compareResult < 0) {
            root.setLeft(insertRec(root.getLeft(), m));
        } else if (compareResult > 0) {
            root.setRight(insertRec(root.getRight(), m));
        } else {
            root.getData().setQuantity(root.getData().getQuantity() + m.getQuantity());
        }
        return root;
	}
	
	public void preorder(){
		preorderRec(root);
	}
	
	// Recursive Method
	private void preorderRec(BSTNode root) {
        if (root != null) {
            System.out.println(root.getData());
            preorderRec(root.getLeft());
            preorderRec(root.getRight());
        }
    }
	
	public void inorder() {
		inorderRec(root);
	}
	
	// Recursive Method
	private void inorderRec(BSTNode root) {
        if (root != null) {
            inorderRec(root.getLeft());
            System.out.println(root.getData());
            inorderRec(root.getRight());
        }
    }
	
	public void postorder() {
		inpostorderRec(root);
	}
	
	// Recursive Method
	private void inpostorderRec(BSTNode root) {
        if (root != null) {
            inorderRec(root.getLeft());
            inorderRec(root.getRight());
            System.out.println(root.getData());
        }
    }
	
	public int size() {
        return sizeRec(root);
    }

	// Recursive Method
    private int sizeRec(BSTNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + sizeRec(root.getLeft()) + sizeRec(root.getRight());
    }
    
    public int height() {
    	return heightRec(root);
    }
    
    // Recursive Method
    private int heightRec(BSTNode root) {
        if (root == null) {
            return -1;
        }
        int leftHeight = heightRec(root.getLeft());
        int rightHeight = heightRec(root.getRight());
        return 1 + Math.max(leftHeight, rightHeight);
    }
    
    public int getTotalQty() {
    	return getTotalQtyRec(root);
    }
    
    // Recursive Method
    private int getTotalQtyRec(BSTNode root) {
        if (root == null) {
            return 0;
        }
        return root.getData().getQuantity() + getTotalQtyRec(root.getLeft()) + getTotalQtyRec(root.getRight());
    }
    
    public MenuItem search(String itemName) {
        return searchRec(root, itemName);
    }

    // Recursive Method
    private MenuItem searchRec(BSTNode root, String itemName) {
        if (root == null) {
            return null;
        }
        if (root.getData().getName().equals(itemName)) {
            return root.getData();
        }
        if (itemName.compareTo(root.getData().getName()) < 0) {
            return searchRec(root.getLeft(), itemName);
        } else {
            return searchRec(root.getRight(), itemName);
        }
    }
	
    public double getTotalBeforeTaxAndTip() {
    	return getTotalBeforeTaxAndTipRec(root);
    }
    
    // Recursive Method
    private double getTotalBeforeTaxAndTipRec(BSTNode root) {
        if (root == null) {
            return 0.0;
        }
        return root.getData().getPrice() * root.getData().getQuantity() +
               getTotalBeforeTaxAndTipRec(root.getLeft()) +
               getTotalBeforeTaxAndTipRec(root.getRight());
    }
    
    public double getTip(double tipPct) {
        return getTotalBeforeTaxAndTip() * tipPct / 100;
    }
    
    public double getTax(double taxPct) {
        return getTotalBeforeTaxAndTip() * taxPct / 100;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        DecimalFormat df = new DecimalFormat("#0.00");

        sb.append(restaurantName).append(" Table ").append(tableID).append("\n");
        sb.append("--------------------------------------------------------------------------------\n");
        sb.append("Item\t\tPrice\t\tQty\tTotal\n");
        sb.append("--------------------------------------------------------------------------------\n");

        inorderToString(root, sb);

        double totalBeforeTax = getTotalBeforeTaxAndTip();
        double tax = getTax(8);
        double tip = getTip(20);
        double grandTotal = totalBeforeTax + tax + tip;

        sb.append("--------------------------------------------------------------------------------\n");
        sb.append(String.format("Total:\t\t$%s\n", df.format(totalBeforeTax)));
        sb.append(String.format("Tax:\t\t$%s\n", df.format(tax)));
        sb.append(String.format("Tip:\t\t$%s\n", df.format(tip)));
        sb.append("--------------------------------------------------------------------------------\n");
        sb.append(String.format("Grand total:\t$%s\n", df.format(grandTotal)));

        return sb.toString();
    }
    
    private void inorderToString(BSTNode root, StringBuilder sb) {
        if (root != null) {
            inorderToString(root.getLeft(), sb);
            sb.append(root.getData()).append("\n");
            inorderToString(root.getRight(), sb);
        }
    }

}
