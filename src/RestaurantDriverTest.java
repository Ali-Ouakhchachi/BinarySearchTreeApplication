/**
 * Description:
 * This test driver class tests an Order class and its binary tree.
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
public class RestaurantDriverTest {
	public static void main(String[] args) {
		Order testOrder = new Order("Yes");
		MenuItem test = new MenuItem("Bool", 2.50, 1);
		MenuItem test2 = new MenuItem("cool", 1.50, 3);
		MenuItem test3 = new MenuItem("School", 5.80, 4);
		MenuItem test4 = new MenuItem("yool", 8.25, 2);
		
		System.out.println(test.toString());
		
		System.out.println(test.equals(test2));
		
		testOrder.insert(test);
		testOrder.insert(test2);
		testOrder.insert(test3);
		testOrder.insert(test4);
		
		testOrder.preorder();
		System.out.println();
		testOrder.inorder();
		System.out.println();
		testOrder.postorder();
		System.out.println();
		System.out.println(testOrder.size());
		System.out.println();
		System.out.println(testOrder.height());
		System.out.println();
		System.out.println(testOrder.getTotalQty());
		System.out.println();
		System.out.println(testOrder.search("yool").toString());
		System.out.println();
		System.out.println(testOrder.getTotalBeforeTaxAndTip());
		System.out.println(testOrder.toString());
		
	}
}
