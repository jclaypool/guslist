package edu.gac.mcs270.hvidsten.guslist.shared;

import com.google.gwt.user.client.rpc.IsSerializable;

public class Seller  implements IsSerializable{
	private String name="";
	
	public Seller() {}
	
	public Seller(String string) {
		name = string;
	}
	public String getname(){
		return name;
	}
}
