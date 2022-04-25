package basic.xtra;

public class UniqueArrays {
	public static void main(String[] args) {
		int[] salesDepartmentEmpIds = { 101, 105, 106, 107, 108, 109 };
		int[] accountDepartmentEmpIds = { 201, 205, 206, 207, 208, 209, 201 };

		boolean duplicates = false;
//	loop compare compare each element from 1st with all other elements following it.
		for (int outer = 0; outer < salesDepartmentEmpIds.length - 1; outer++) {
			for (int inner = outer + 1; inner < salesDepartmentEmpIds.length; inner++) {
				if (salesDepartmentEmpIds[outer] == salesDepartmentEmpIds[inner]) {
					duplicates = true;
				}
			}
		}
		System.out.println(duplicates ? "Dup Found" : "No Dup");
	
	duplicates = false;
//	loop compare compare each element from 1st with all other elements following it.
		for (int outer = 0; outer <= accountDepartmentEmpIds.length - 1; outer++) {
			for (int inner = outer + 1; inner < accountDepartmentEmpIds.length; inner++) {
				if (accountDepartmentEmpIds[outer] == accountDepartmentEmpIds[inner]) {
					duplicates = true;
				}
			}
		}
		System.out.println(duplicates ? "Dup Found" : "No Dup");
	}
}
