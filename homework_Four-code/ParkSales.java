
public class ParkSales {

		public static enum Rate { FREE, KID, YOUTH, ADULT, SENIOR, ERROR };

		/**
		 * Determine what rate the person should pay to enter the Amusement Park.
		 * Season pass holders are free.
		 * Without a season pass:
		 *     under 10 receives KID rate; 
		 *     10-20 receives YOUTH rate;
		 *     21-64 receives ADULT rate;
		 *     65 and older received SENIOR rate;
		 *
		 * @param age: How old is the person requesting admission to the park?
		 * @param passHolder: Is the customer has a season pass?
		 *
		 * @return
		 * FREE - passHolders are admitted for free
		 * KID - charge kid rate of $25.00
		 * YOUTH - charge youth rate of $30.00
		 * ADULT - charge adult rate of $40.00
		 * SENIOR - charge senior rate of $35.00
		 * ERROR - invalid age (assume age starts at zero)
		 **/
		
		
		public static Rate admissionRate(int age, boolean passHolder)
		{
			Rate person = Rate.ADULT;

			if (passHolder && (age >= 0)) {
				person = Rate.FREE;
			}
			else {
				if (age < 0) {
					person = Rate.ERROR;
				}
				else if (age < 10)
					person = Rate.KID;
				else if (age < 21)
					person = Rate.YOUTH;
				else if (age < 65)
					person = Rate.ADULT;
				else 
					person = Rate.SENIOR;
			}
				
			if (age == 8)
				person = Rate.YOUTH;
				
			return person;
		}

	}
