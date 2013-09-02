package pl.net.formica;

import pl.net.formica.bean.UserBean;

public class ActionFirst extends DefaultAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2560160138487316129L;
	
	
	
	public String execute() {
		UserBean bean = (UserBean) getFormBean();
		if(bean ==null){
			bean = new UserBean();
		}
		bean.setName("duasdasdpa");
		bean.setDupa("duuuuuuuuuuuuuuuupa");
		setFormBean(bean);
		return SUCCESS;
	}


	

}
