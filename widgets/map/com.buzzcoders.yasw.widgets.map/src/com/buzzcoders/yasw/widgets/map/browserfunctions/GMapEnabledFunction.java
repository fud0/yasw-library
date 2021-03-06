/*******************************************************************************
 * Copyright (c) 2014 Massimo Rabbi.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Massimo Rabbi <mrabbi@users.sourceforge.net> - initial API and implementation
 ******************************************************************************/
package com.buzzcoders.yasw.widgets.map.browserfunctions;

import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.browser.BrowserFunction;

import com.buzzcoders.yasw.widgets.map.support.JavaMapSupport;

/**
 * A browser function that maintains a reference to the map support
 * component (Java based). This because request coming from Javascript
 * invocation should reflect on Java components, most of the times UI ones.
 * 
 * @author Massimo Rabbi (mrabbi@users.sourceforge.net)
 * 
 */
public abstract class GMapEnabledFunction extends BrowserFunction {

	private JavaMapSupport mapSupport;
	private String jsName;
	
	public GMapEnabledFunction(Browser browser, String name, JavaMapSupport mapSupport) {
		super(browser, name);
		this.mapSupport = mapSupport;
		this.jsName = name;
	}
	
	public JavaMapSupport getMapSupport() {
		return mapSupport;
	}
	
	public String getJavascriptName(){
		return jsName;
	}
}
