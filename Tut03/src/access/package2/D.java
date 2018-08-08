package access.package2;

import access.package1.A;

public class D {

	public void methodD() {
		// A class D in another package to a class A
		// has only access to variables in A with public scope

		A objA = new A();
		System.out.println("var: " + objA.var);
		System.out.println("varPub: "  + objA.varPub);
		System.out.println("varPro: "  + objA.varPro);
		System.out.println("varPriv: " + varPriv);
	}
}
