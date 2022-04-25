:beginner: _**Asgn Reference**_  

:writing_hand: **c1s1**  
- create centralized git repo on gitlab

:writing_hand: **_c1s3 calorie tracker_**  

```java
		// write logic here
		int monthlyExtraCal = calorieIntake * 30;
		// *2 mins to hrs [weekly]
		int calBurntMonthly = (cycling + running + swimming) * 2 * 4;
		int poundsLost = (calBurntMonthly - monthlyExtraCal) / 1000;
//		if(poundsLost < 0) {
//			return 0;
//		}
//		else {
//			return poundsLost;
//		}
		return poundsLost < 0 ? 0 : poundsLost;
```
