package pl.net.formica;

import com.opensymphony.xwork2.ActionSupport;

public class DefaultAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3226748929234428710L;

	public String welcome()
	{
		return "welcome";		
	}
	
	public String friends()
	{
		return "friends";		
	}
	
	public String office()
	{
		return "office";		
	}
}
