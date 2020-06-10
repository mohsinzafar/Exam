package sp17_bse_019_final;

import java.util.ArrayList;
import java.util.List;

public class HTMLParentElement extends HTMLTag {
	private String tagName;
	private String startTag; 
	private String endTag;
	private List<HTMLTag>children;
	
	//constructor
	public HTMLParentElement(String tagName){
		this.children = new ArrayList<>();
	}
	//get tag name
	public String getTagName() {
		return tagName;
	}
	//setting start tag
	public void setStartTag(String tag) {
		this.startTag = tag;
	}
	//setting end tag
	public void setEndTag(String tag) {
		this.endTag = tag;
	}
	// adding child tag
	public void addChildTag(HTMLTag htmlTag){
		children.add(htmlTag);
	}
	// removing child tag
	public void removeChildTag(HTMLTag htmlTag){
		children.remove(htmlTag);
	}
	/// passing the list of children
	public List<HTMLTag>getChildren(){
		return children;
	}
	//producing html 
	public void generateHtml() {
		System.out.println(startTag);
		for(HTMLTag tag : children){
			tag.generateHtml();
		}
		System.out.println(endTag);
		
	}

}
