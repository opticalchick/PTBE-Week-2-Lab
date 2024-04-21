package labs;

public class Lab2 {

	public static void main(String[] args) {
	
	int age = 16;
	
	System.out.println(age >= 16);
	
	boolean hasLicense = true;
	
	if (age >= 16 && hasLicense) {
		System.out.println("You can drive");
	} else {
		System.out.println("You cannot drive");
	}
	
	double costOfMilk = 3.00;
	int thirstLevel = 10;			
	
	if (costOfMilk <= 2.50 || thirstLevel > 6) {
		System.out.println("Milk Please");
	} else {
		System.out.println("No Thanks");
	}
	
	int numberOfCookies = 60;
	int numberOfChildren = 22;
	
	if (numberOfCookies % numberOfChildren == 0) {
		System.out.println("Sad Face");
	}  else if (numberOfCookies % numberOfChildren <= 2) {
		System.out.println("Yes!");
	}  else if (numberOfCookies % numberOfChildren <= 5) {
		System.out.println("Whoohoooo!");
	} else {
		System.out.println("Jackpot!");
	}
		
	String loyaltyMemberStatus = "SILVER";
	double loyaltyMemberDiscount = 0.0;
	
	
	switch (loyaltyMemberStatus) {	
	case "SILVER": 
		loyaltyMemberDiscount = 0.10;
		break;
	case "GOLD":
		loyaltyMemberDiscount = 0.15;
		break;
	case "PLATINUM":
		loyaltyMemberDiscount = 0.25;
	}
	
	double billTotal = 1166.82;
	double adjustedTotal = (billTotal - (billTotal * loyaltyMemberDiscount));
	
	System.out.println(loyaltyMemberDiscount);
	System.out.println(adjustedTotal);
	
	if (adjustedTotal > 500) {
		if (loyaltyMemberStatus == "SILVER") {
			loyaltyMemberStatus = "GOLD";
		} else if (loyaltyMemberStatus == "GOLD") {
			loyaltyMemberStatus = "PLATINUM";					
		}
	}
	System.out.println(loyaltyMemberStatus);
	
	String username = "Tommy123";
	String password = "12345";
	
	if (username == "Tommy123" &&  password == "12345") {
		System.out.println("Login Successful");
	} else {
		System.out.println("access denied");
	}
	
	for (int i = 0; i < 10; i++) {
		System.out.println(i);
	}
	
	for (int i = 10; i >= 0; i--) {
		System.out.println(i);
	}
	
	for (int i = 0; i <= 100; i++) {
		if (i % 2 == 0) {
		System.out.println(i);}
		
	}
	
	for (int i = 0; i <= 100; i++) {
		if (i % 2 == 0) {
			System.out.println("EVEN");
		} else {
			System.out.println("ODD");
		}
	}
	
	
	 for ( int i = 100; i >= 0; i--) {
		 System.out.println(i % 3);
	 }
	}
	

}
