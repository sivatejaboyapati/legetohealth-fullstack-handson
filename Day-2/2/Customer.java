package day2;

public class Customer extends Inherit_Person{
	private int cid;
	private double accno;
	private double bal;
	public Customer(int cid, String name, String gender, double accno, double bal) {
		super(name,gender);
		this.cid=cid;
		this.accno=accno;
		this.bal=bal;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public double getAccno() {
		return accno;
	}
	public void setAccno(double accno) {
		this.accno = accno;
	}
	public double getBal() {
		return bal;
	}
	public void setBal(double bal) {
		this.bal = bal;
	}
	public void display() {
		super.display();
		System.out.println("CustomerId:"+cid);
		System.out.println("Account No:"+accno);
		System.out.println("Balance:"+bal);
	}
}
