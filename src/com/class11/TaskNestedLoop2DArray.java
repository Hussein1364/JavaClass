package com.class11;

public class TaskNestedLoop2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] car= { {"ford","tesla","GMC","chevy"},{"mercedec benz","Audi","bmw","volkswagon"},{"hyundai","kia","honda","toyota"
		},{"lambo","ferrari","fiat","maserati","alfa romeo"}};
		
		for(String[] array:car) {
			for(String a:array) {
				System.out.print(a+"  ");
			}
			System.out.println();
		}     System.out.println("---------second way---------");
	
		for(int r=0; r<car.length; r++ ) {
			for( int c=0; c<car[r].length; c++) {
				System.out.print(car[r][c]+"  ");
			}
			System.out.println();
		}
		
	}

}
