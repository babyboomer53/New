public class PrePostDemo {
	/**
	 * Wow, that's interesting! When I started a comment block, the editor automatically
	 * terminated that block and added a Javadoc tag.
	 * 
	 * @author Champ 
	 * @param args
	 */
    public static void main(String[] args) {
        int i = 5;
        i++;
        // prints 4
        System.out.println(i);
        ++i;
        // prints 5
        System.out.println(i);
        // prints 6
        System.out.println(++i);
        // prints 6
        System.out.println(i++);
        // prints 7
        System.out.println(i);
    }
}
