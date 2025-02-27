/**
 * Description:
 * This driver class tests two Order classes and their binary trees.
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
public class RestaurantDriver {
	public static void main(String[] args) {
		Order testOrder = new Order("1");
		Order testOrder2 = new Order("2");
		
		MenuItem test = new MenuItem("Burger", 2.50, 1);
		MenuItem test2 = new MenuItem("Fries", 1.50, 3);
		MenuItem test3 = new MenuItem("Hotdog", 5.80, 4);
		MenuItem test4 = new MenuItem("Shake", 8.25, 2);
		MenuItem test5 = new MenuItem("Donut", 1.25, 6);
		MenuItem test6 = new MenuItem("Onions", 1.50, 4);
		MenuItem test7 = new MenuItem("Soda", 0.90, 5);
		MenuItem test8 = new MenuItem("Wings", 1.90, 5);
		MenuItem test9 = new MenuItem("S.Wings", 2.10, 5);
		MenuItem test10 = new MenuItem("C.Fries", 1.80, 5);
		MenuItem test11 = new MenuItem("FroYo", 4.50, 5);
		MenuItem test12 = new MenuItem("Float", 3.20, 5);
		MenuItem test13 = new MenuItem("Nachos", 3.90, 5);
		MenuItem test14 = new MenuItem("Burrito", 7.90, 5);
		MenuItem test15 = new MenuItem("Pizza", 7.80, 5);
		
		// Inserting all the methods for testOrder
		testOrder.insert(test);
		testOrder.insert(test2);
		testOrder.insert(test3);
		testOrder.insert(test4);
		testOrder.insert(test5);
		testOrder.insert(test6);
		testOrder.insert(test7);
		testOrder.insert(test8);
		testOrder.insert(test9);
		testOrder.insert(test10);
		testOrder.insert(test11);
		testOrder.insert(test12);
		testOrder.insert(test13);
		testOrder.insert(test14);
		testOrder.insert(test15);
		
		// Inserting all the methods for testOrder2
		
		testOrder2.insert(test3);
		testOrder2.insert(test14);
		testOrder2.insert(test2);
		testOrder2.insert(test4);
		testOrder2.insert(test15);
		testOrder2.insert(test6);
		testOrder2.insert(test10);
		testOrder2.insert(test13);
		testOrder2.insert(test9);
		testOrder2.insert(test7);
		testOrder2.insert(test11);
		testOrder2.insert(test12);
		testOrder2.insert(test8);
		testOrder2.insert(test);
		testOrder2.insert(test5);
		
		// Testing methods for testOrder1
		System.out.println("Preorder: ");
		testOrder.preorder();
		System.out.println("\nInorder: ");
		testOrder.inorder();
		System.out.println("\nPostorder: ");
		testOrder.postorder();
		System.out.println("\nSize: ");
		System.out.println(testOrder.size());
		System.out.println("\nHeight: ");
		System.out.println(testOrder.height());
		System.out.println("\nTotal Quantity: ");
		System.out.println(testOrder.getTotalQty());
		System.out.println("\nSearching Hotdog: ");
		System.out.println(testOrder.search("Hotdog").toString());
		System.out.println("\nTotal Before Tax and Tips: ");
		System.out.println(testOrder.getTotalBeforeTaxAndTip());
		System.out.println(testOrder.toString());

		// Testing methods for testOrder2
		System.out.println("Preorder: ");
		testOrder2.preorder();
		System.out.println("\nInorder: ");
		testOrder2.inorder();
		System.out.println("\nPostorder: ");
		testOrder2.postorder();
		System.out.println("\nSize: ");
		System.out.println(testOrder2.size());
		System.out.println("\nHeight: ");
		System.out.println(testOrder2.height());
		System.out.println("\nTotal Quantity: ");
		System.out.println(testOrder2.getTotalQty());
		System.out.println("\nSearching Hotdog: ");
		System.out.println(testOrder2.search("Hotdog").toString());
		System.out.println("\nTotal Before Tax and Tips: ");
		System.out.println(testOrder2.getTotalBeforeTaxAndTip());
		System.out.println(testOrder2.toString());
		
	}
}
