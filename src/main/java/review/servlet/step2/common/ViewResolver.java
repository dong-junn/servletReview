package review.servlet.step2.common;

public class ViewResolver {
	public String prefix;  // "./"
	public String suffix;  // ".jsp"

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public String getView(String viewName) {   //"Index"
		return prefix + viewName + suffix;   // "./Index.jsp" 
	}
}
