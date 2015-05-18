/*
 * Copyright 2014 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.drools.shapes.terms.operations;

import edu.mayo.terms_metamodel.terms.ConceptDescriptor;

public interface TermsMapping {

    public boolean mapsTo( ConceptDescriptor source, ConceptDescriptor target );
}
