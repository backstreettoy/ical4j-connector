/**
 * Copyright (c) 2012, Ben Fortuna
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  o Redistributions of source code must retain the above copyright
 * notice, this list of conditions and the following disclaimer.
 *
 *  o Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 *
 *  o Neither the name of Ben Fortuna nor the names of any other contributors
 * may be used to endorse or promote products derived from this software
 * without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
//package net.fortuna.ical4j.connector.dav.property;
//
//import org.apache.jackrabbit.webdav.property.AbstractDavProperty;
//import org.apache.jackrabbit.webdav.property.DavPropertyName;
//import org.apache.jackrabbit.webdav.property.HrefProperty;
//import org.apache.jackrabbit.webdav.xml.Namespace;
//import org.w3c.dom.Document;
//import org.w3c.dom.Element;
//
//
//public class ScheduleDefaultCalendarUrl extends AbstractDavProperty<String[]>{
//	
//	
//	
//	public static final DavPropertyName NAME = DavPropertyName.create(
//			"schedule-default-calendar-URL", Namespace.getNamespace("urn:ietf:params:xml:ns:caldav"));
//	
//	private HrefProperty href;
//
//	public ScheduleDefaultCalendarUrl(String value) {
//		super(NAME, true);
//		href = new HrefProperty(NAME, "/calendars/__uids__/65F9CE4C1D054A158F0E4CE116C01080/calendars", true);
//	}
//
//	@Override
//	public Element toXml(Document document) {
//		return href.toXml(document);
//	}
//	
//	@Override
//	public String[] getValue() {
//		return href.getValue();
//	}
//
//}
