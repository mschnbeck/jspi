/**
 * Copyright (C) 2003 <a href="http://www.lohndirekt.de/">lohndirekt.de</a>
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *  
 */
package de.lohndirekt.print.attribute.auth;

import java.util.Locale;

import javax.print.attribute.PrintRequestAttribute;
import javax.print.attribute.TextSyntax;

public class RequestingUserPassword extends TextSyntax implements PrintRequestAttribute{

	
	/**
	 * @param value
	 */
	public RequestingUserPassword(String name, Locale locale) {
		super(name, locale);
	}

	/**
	 *
	 */

	public Class getCategory() {
		return RequestingUserPassword.class;
	}

	/**
	 *
	 */

	public static String getIppName() {
		return "requesting-user-password";
	}

	public String getName() {
		return RequestingUserPassword.getIppName();
	}

}