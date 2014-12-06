/*******************************************************************************
 * Copyright (c) 2014 Michael Gebhart (michael.gebhart@qa82.org).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Michael Gebhart - initial idea and concept
 * 
 *******************************************************************************/

package org.qa82.analyzer.core.impl;


public class SimpleInformation extends AbstractInformation {

    private Object informationObject;

    public SimpleInformation(Object informationObject) {
        super(informationObject.getClass().toString());
        this.informationObject = informationObject;
    }

    @Override
    public Object getValue() {
        return informationObject;
    }

    @Override
    public Boolean isInformationPresent() {
        return informationObject == null;
    }

}
