package org.w3._2002._07.owl;

import com.clarkparsia.empire.EmpireGenerated;
import com.clarkparsia.empire.SupportsRdfId;
import com.clarkparsia.empire.annotation.Namespaces;
import com.clarkparsia.empire.annotation.RdfsClass;
import org.drools.core.metadata.Identifiable;
import org.drools.core.metadata.Internal;
import org.openrdf.model.Graph;


// <http://www.w3.org/2002/07/owl#Thing>

@RdfsClass( value="tns:Thing" )
@Namespaces({ "tns", "http://www.w3.org/2002/07/owl#" })
public interface Thing<K> extends org.drools.semantics.Thing<K>, EmpireGenerated, Identifiable
                                 
{

    public static String IRI = "<http://www.w3.org/2002/07/owl#Thing>";

    @Internal
    Graph getAllTriples();

    @Internal
    Graph getInstanceTriples();

    @Internal
    SupportsRdfId.RdfKey getRdfId();

}