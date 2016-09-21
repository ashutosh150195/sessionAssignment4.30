package com.java.assginmentfour.sessionassginment1;

public class A extends B{
	public static void test(){
		System.out.println("Test method in class A");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C.test();
	}

}


/**Answer :
 * It is not possible to invoke test() method defined in C from a method in A.
 * It's true if and only if the test method present in the class C is non-static method.
 * Because as in the given question ,  We are restricted to create a instance of class C.
 * So, without creating instance of the class C , It is not possible to invoke the non-static method.
 */
