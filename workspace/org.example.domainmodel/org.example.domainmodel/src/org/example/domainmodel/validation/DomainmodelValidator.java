/*
 * generated by Xtext 2.31.0
 */
package org.example.domainmodel.validation;

import org.eclipse.xtext.validation.Check;
import org.example.domainmodel.domainmodel.DomainmodelPackage;
import org.example.domainmodel.domainmodel.Entity;
import org.example.domainmodel.domainmodel.Feature;

import com.google.common.base.Objects;

/**
 * This class contains custom validation rules.
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class DomainmodelValidator extends AbstractDomainmodelValidator {
	public static final String INVALID_NAME = "invalidName";
	@Check
//	public void checkFeatureNameIsUnique(Feature feature) {
//	    Entity superEntity = ((Entity) feature.eContainer()).getSuperType();
//	    while (superEntity != null) {
//	        for (Feature other : superEntity.getFeatures()) {
//	            if (Objects.equal(feature.getName(), other.getName())) {
//	                error("Feature names have to be unique", DomainmodelPackage.Literals.FEATURE__NAME);
//	                return;
//	            }
//	        }
//	        superEntity = superEntity.getSuperType();
//	    }
//	}
	public void checkFeatureNameIsUnique(Feature feature) {
	    Entity superEntity = ((Entity) feature.eContainer()).getSuperType();
	    while (superEntity != null) {
	        for (Feature other : superEntity.getFeatures()) {
	            if (Objects.equal(feature.getName(), other.getName())) {
	                error("Feature names have to be unique", DomainmodelPackage.Literals.FEATURE__NAME);
	                return;
	            }
	        }
	        superEntity = superEntity.getSuperType();
	    }
	}
}
