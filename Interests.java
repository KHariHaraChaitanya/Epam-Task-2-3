/*
 * This class contains methods to calculate Simple Interest and Compound Interest
 * author- K.HariHaraChaitanya  Interest calculation
 */
public class Interests {
	double principal;
	double ratePercent;
	double time;
	/*
	 * parameterized constructor 
	 */
	public Interests(double principal,double ratePercent,double time) {
		this.principal=principal;
		this.ratePercent=ratePercent;
		this.time=time;
	}
	/*
	 * method for simple interest
	 */
	double simpleInterest() {
		return (principal*ratePercent*time)/100;
	}
	/*
	 * method for compound interest
	 */
    double compoundInterest() {
    	return (principal*Math.pow((1+ratePercent/100),time))-principal;
    }
}
