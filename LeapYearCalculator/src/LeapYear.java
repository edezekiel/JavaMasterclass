public class LeapYear {
	public static boolean isLeapYear(int year) {
		if (year < 1 || year > 9999) {
			return false;

			// Step 1
		} else if (year % 4 == 0) {

			// Step 2
			if (year % 100 == 0) {

				// Step 3
				if (year % 400 == 0) {

					// Step 3-4
					return true;
				} else {

					// Step 3-5
					return false;
				}
			} else {

				// Step 2-4
				return true;
			}
		}
		// Step 1-5
		return false;
	}
}
