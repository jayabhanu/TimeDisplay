/**
 *   File Name: TimeDisplay.java<br>
 *
 *   Gajula, jayabhanu<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Mar 25, 2016
 *
 */

/**
 * TimeDisplay //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */
public class TimeDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TimeDisplay c1 = new TimeDisplay();
		c1.Timedisplay(2);
	}

	/**
	 * @param args
	 */
	// global variable initialized to zero
	int count = 0;

	void Timedisplay(int min) {
		// This for loop is for counting min
		for (int j = 1; j <= min; j++) {
			// this for loop is for counting seconds
			for (int i = 0; i <= 59; i++) {
				// display for each and every iteration of the loop
				System.out.println(this.count + ":" + i);
				if (i == 59) {
					this.count++;
				}
			}
		}
	}

}
