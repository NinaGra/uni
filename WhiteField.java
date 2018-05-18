/**
 * Implements a white field.
 * 
 * @author Marcus
 */
package Miniprojekt2SS2018;
//import Miniprojekt2SS2018.Field;
public class WhiteField extends Field { // TODO: change inheritance hierarchy


	/**
	 * Creates a new white field at the specified position.
	 * 
	 * @param x The x coordinate of the position.
	 * @param y The y coordinate of the position.
	 */
	// TODO: constructor

	public WhiteField(int x, int y){
		super(x,y);
	}

	public String getColor(){
		return "#ffff";
	}
	
	/**
	 * Returns the string "w".
	 * 
	 * @return The string "w".
	 */
	// TODO: override getColor


	public static void main(String ... args){
		System.out.print("hiiiiiiiii");
	}


}
