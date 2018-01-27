package com;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

public class BankEmployee extends Employee implements Externalizable {
	private double bonus;

	public BankEmployee() {
	}

	

	public BankEmployee(int empId, String empName, String designation, double bonus) {
		super(empId, empName, designation);
		this.bonus = bonus;
	}



	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "BankEmployee [bonus=" + bonus + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(getEmpId());
		out.writeUTF(getDesignation());
		out.writeDouble(getBonus());
		out.writeUTF(getEmpName());
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		setEmpId(in.readInt());
		setDesignation(in.readUTF());
		setBonus(in.readDouble());
		setEmpName(in.readUTF());
	}	
}
