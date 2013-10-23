package pl.net.formica.bean;

import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;

public class UserBean {
	private String name;
	private String dupa;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@RequiredStringValidator(key="")
	public String getDupa() {
		return dupa;
	}

	public void setDupa(String dupa) {
		this.dupa = dupa;
	}
	
}
