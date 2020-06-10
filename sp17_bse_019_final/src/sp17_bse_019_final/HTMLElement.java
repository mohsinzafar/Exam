package sp17_bse_019_final;

public class HTMLElement extends HTMLTag {
	private String tagName;
	private String startTag; 
	private String endTag;
	private String tagBody;
	
	public HTMLElement(String tagName){
		this.tagName = tagName;
	}
	public String getTagName() {
		return tagName;
	}

	public void setStartTag(String tag) {
		this.startTag = tag;
	}
	public void setEndTag(String tag) {
		this.endTag = tag;
	}

	public void setTagBody(String tagBody){
		this.tagBody = tagBody;
	}
	// printing the html on console
	public void generateHtml() {
		System.out.println(startTag+""+tagBody+""+endTag);
	}


}
