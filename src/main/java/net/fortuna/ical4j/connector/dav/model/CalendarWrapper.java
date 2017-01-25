package net.fortuna.ical4j.connector.dav.model;

import java.io.Serializable;
import java.net.URI;

import net.fortuna.ical4j.model.Calendar;

public class CalendarWrapper implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5099638416520267115L;
	
	private Calendar calendar;
	private URI webDavUrl;
	
	public Calendar getCalendar() {
		return calendar;
	}
	public void setCalendar(Calendar calendar) {
		this.calendar = calendar;
	}
	public URI getWebDavUrl() {
		return webDavUrl;
	}
	public void setWebDavUrl(URI webDavUrl) {
		this.webDavUrl = webDavUrl;
	}
	
	@Override
	public String toString() {
		return "url: " + webDavUrl + " " + "calendar: " + calendar;
	}
	
}
