package com.serviceport.component;

public class WorkCapacitiy {
	
	private int senior;
	
	private int junior;
	
	public void WorkCapacity(){}	

	public WorkCapacitiy(int senior, int junior) {
		super();
		this.senior = senior;
		this.junior = junior;
	}

	public int getSenior() {
		return senior;
	}

	public void setSenior(int senior) {
		this.senior = senior;
	}

	public int getJunior() {
		return junior;
	}

	public void setJunior(int junior) {
		this.junior = junior;
	}


	
	@Override
	public String toString() {
		return "WorkCapacitiy [senior=" + senior + ", junior=" + junior + "]";
	}

}
