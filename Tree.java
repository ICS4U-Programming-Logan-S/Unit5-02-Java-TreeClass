/**
 * The tree object with it's fields and methods.
 *
 * @author Logan S
 * @version 1.0
 * @since 2023-06-04
 */

public class Tree {
    // Creating the fields
    String type;
    int age;
    int numLeaves;
    int heightFt;

    /**
     * Tree object constructor.
     *
     * @param initType      the type of the tree
     * @param initAge       the age of the tree
     * @param initNumLeaves the number of leaves on the tree
     * @param initHeightFt  the height of the tree in feet
     */

    public Tree(String initType, int initAge,
            int initNumLeaves, int initHeightFt) {
        this.type = initType;
        this.age = initAge;
        this.numLeaves = initNumLeaves;
        this.heightFt = initHeightFt;
    }

    /**
     * Grow the tree & it's leaves, a well as add years of age.
     */
    public void grow() {
        this.age = this.age + 5;
        this.numLeaves = this.numLeaves + 10000;
        this.heightFt = this.heightFt + 10;
    }

    /**
     * Grow the tree slower, with less quantity of everything increased.
     */
    public void growSlow() {
        this.age = this.age + 1;
        this.numLeaves = this.numLeaves + 2000;
        this.heightFt = this.heightFt + 2;
    }

    /**
     * Shed the leaves off the tree, in a way indicating Autumn/Winter.
     */
    public void shedLeaves() {
        this.numLeaves = 0;
    }
}
