package nth.reflect.app.swdocgen.dom.javadoc.tag;

import nth.reflect.fw.generic.regex.Regex;


public enum EndTag {
	AUTHOR ,VERSION ,PARAM ,RETURN ,DEPRECATED ,SINCE ,THROWS ,EXCEPTION ,SEE ,SERIAL ,SERIALFIELD ,SERIALDATA;
	
	public Regex asRegex() {
		String name="@"+this.name();
		Regex regex=new Regex().ignoreCase().literal(name);
		return regex;
	}
	
	
}
