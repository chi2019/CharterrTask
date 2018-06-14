package com.example.chanakya.charterrtask.model;


import android.os.Parcel;
import android.os.Parcelable;

public class ClientAccount implements Parcelable {


	private double amount;


	private String name;


	private int id;

	private double rOI;

	protected ClientAccount(Parcel in) {
		amount = in.readDouble();
		name = in.readString();
		id = in.readInt();
		rOI = in.readDouble();
	}

	public static final Creator<ClientAccount> CREATOR = new Creator<ClientAccount>() {
		@Override
		public ClientAccount createFromParcel(Parcel in) {
			return new ClientAccount(in);
		}

		@Override
		public ClientAccount[] newArray(int size) {
			return new ClientAccount[size];
		}
	};

	public void setAmount(double amount){
		this.amount = amount;
	}

	public double getAmount(){
		return amount;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setROI(double rOI){
		this.rOI = rOI;
	}

	public double getROI(){
		return rOI;
	}

	@Override
 	public String toString(){
		return 
			"ClientAccount{" +
			"amount = '" + amount + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			",rOI = '" + rOI + '\'' + 
			"}";
		}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeDouble(amount);
		dest.writeString(name);
		dest.writeInt(id);
		dest.writeDouble(rOI);
	}
}