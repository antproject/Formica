package pl.net.formica;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.Validations;
import com.opensymphony.xwork2.validator.annotations.VisitorFieldValidator;
@Validations
public class DefaultAction extends ActionSupport  {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3226748929234428710L;

	
	private Object              formBean;
	
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
	public String dupa(){
		return "dupa";
	}
	
	public void setFormBean(final Object formBean) {

	      this.formBean = formBean;
	   }
	
	@VisitorFieldValidator(message = "")
	public Object getFormBean() {

	      return formBean;
	   }

	

	
	
	
}
