/*
 * Copyright (c) 2009, 2020 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

/*
 * $Id$
 */

package com.sun.ts.tests.jsf.api.jakarta_faces.component.html.htmlcommandbutton;

import jakarta.faces.component.UIComponent;
import jakarta.faces.component.UIComponentBase;
import jakarta.faces.component.html.HtmlCommandButton;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;

public final class TestServlet extends
    com.sun.ts.tests.jsf.api.jakarta_faces.component.uicommand.TestServlet {

  private static final String[] attributes = { "accesskey", "alt", "dir",
      "image", "lang", "onblur", "onchange", "onclick", "ondblclick", "onfocus",
      "onkeydown", "onkeypress", "onkeyup", "onmousedown", "onmousemove",
      "onmouseout", "onmouseover", "onmouseup", "onselect", "style",
      "styleClass", "tabindex", "title", "type", "disabled", "readonly" };

  /**
   * <p>
   * Initializes this {@link jakarta.servlet.Servlet}.
   * </p>
   * 
   * @param config
   *          this Servlet's configuration
   * @throws ServletException
   *           if an error occurs
   */
  public void init(ServletConfig config) throws ServletException {
    super.init(config);
    setRendererType("jakarta.faces.Button");
    setAttributeNames(attributes);
  }

  /**
   * <p>
   * Creates a new {@link UIComponent} instance.
   * </p>
   * 
   * @return a new {@link UIComponent} instance.
   */
  protected UIComponentBase createComponent() {
    return new HtmlCommandButton();
  }

  // ------------------------------------------- Test Methods ----

}
