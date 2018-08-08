package access.package1;

/*
 * @author Aarthi
 * A class defining variables with different access modifiers
 */
public class B extends A {

	public void methodB() {
		System.out.println("var: " + var);
		System.out.println("varPub: "  + varPub);
		System.out.println("varPro: "  + varPro);
		System.out.println("varPriv: " + varPriv);
	}

}
