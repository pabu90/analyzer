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

package org.qa82.analyzer.core.providers.java;

import java.util.ArrayList;
import java.util.List;

import org.qa82.analyzer.core.Parameters;
import org.qa82.analyzer.core.annotations.Parameter;
import org.qa82.analyzer.core.annotations.ProvidedFunction;
import org.qa82.analyzer.core.bean.InformationNeed;
import org.qa82.analyzer.core.bean.InformationType;
import org.qa82.analyzer.core.impl.SimpleAnalyzer;
import org.qa82.analyzer.core.impl.Element;
import org.qa82.analyzer.core.Information;
import org.qa82.analyzer.core.impl.AbstractInformationProvider;

public class JavaJaxRsProvider extends AbstractInformationProvider {
	
	public JavaJaxRsProvider(SimpleAnalyzer analyzer) {
		super(analyzer);
	}

	@ProvidedFunction
	public @Parameter(uri="REST Services") List<Element> getAllRestServices() {
		System.out.println(analyzer.getProject().getRepository());
		List<Element> result = new ArrayList<Element>();
		
		for (int i = 0; i < 10; i++) {
			Element e = new Element("Test", "/service/rest");
			result.add(e);
		}
		
		return result;
	}
	
	@ProvidedFunction
	public @Parameter(uri="restOperations") Object getAllRestServices(@Parameter(uri="restService") Object restService) {
		return null;	
	}
	
	@ProvidedFunction
	public @Parameter(uri="serviceInterface") Element getServiceInterfaceOfService(@Parameter(uri="restService") Element restService) {
		return null;
	}

    @Override
    public Boolean provides(InformationType expectedInformation, Parameters parameters) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Information resolve(InformationType expoectedInformation, Parameters parameters) {
        // TODO Auto-generated method stub
        return null;
    }
	@Override
	public List<InformationNeed> getProvidedInformation() {
		// TODO Auto-generated method stub
		return null;
	}
}
