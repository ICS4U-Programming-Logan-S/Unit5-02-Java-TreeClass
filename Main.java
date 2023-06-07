/**
 * This program takes all methods and fields from the tree class and initiates
 * the program with the values from here.
 *
 * @author Logan S
 * @version 1.0
 * @since 2023-06-04
 */

public final class Main {

    /**
     * This is the main method.
     *
     * @param args //unused
     */
    public static void main(final String[] args) {
        final Tree tree = new Tree("Pawpaw(Papaya)", 23, 3400, 33);

        // Run the program and all it's methods, also print out all information
        System.out.printf("Tree height (ft): %d \nAmt of leaves: %d%n",
                tree.heightFt, tree.numLeaves);
        tree.grow();

        System.out.printf("Tree height has grown to: %d \nAmt of leaves: %d",
                tree.heightFt, tree.numLeaves);
        tree.shedLeaves();

        System.out.printf("\nFall is almost over. The tree now has %d leaves.",
                tree.numLeaves);
        tree.growSlow();

        System.out.printf("\n(FINAL) \nTree Type: %s \nTree age: %d"
                + "\nTree height: %d \nAmt of leaves: %d%n",
                tree.type, tree.age, tree.heightFt, tree.numLeaves);
    }
}
