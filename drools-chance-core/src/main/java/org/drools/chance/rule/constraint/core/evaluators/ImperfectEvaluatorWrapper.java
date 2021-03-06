package org.drools.chance.rule.constraint.core.evaluators;


import org.drools.base.EvaluatorWrapper;
import org.drools.chance.degree.ChanceDegreeTypeRegistry;
import org.drools.chance.degree.Degree;
import org.drools.common.InternalFactHandle;
import org.drools.common.InternalWorkingMemory;
import org.drools.rule.Declaration;
import org.drools.rule.VariableRestriction;
import org.drools.spi.Evaluator;
import org.drools.spi.FieldValue;
import org.drools.spi.InternalReadAccessor;

public class ImperfectEvaluatorWrapper extends EvaluatorWrapper implements ImperfectEvaluator {

    public ImperfectEvaluatorWrapper( Evaluator evaluator, Declaration leftBinding, Declaration rightBinding ) {
        super( evaluator, leftBinding, rightBinding );
    }

    public Degree match( InternalFactHandle left,
                         InternalFactHandle right ) {
//        if( getLeftBinding() != null ) {
//            left = getLeftHandle();
//        }
//        if( getRightBinding() != null ) {
//            right = getRightHandle();
//        }

        if ( getEvaluator() instanceof ImperfectEvaluator ) {
            return ((ImperfectEvaluator) getEvaluator()).match( getWorkingMemory(),
                                                                getExtractor(),
                                                                left,
                                                                getExtractor(),
                                                                right );
        } else {
            return ChanceDegreeTypeRegistry.getSingleInstance().buildDegree(
                                                                ChanceDegreeTypeRegistry.getDefaultDegree(),
                                                                getEvaluator().evaluate( getWorkingMemory(),
                                                                                         getExtractor(),
                                                                                         left,
                                                                                         getExtractor(),
                                                                                         right ) ? 1.0 : 0.0 );
        }
    }

    public Degree match( InternalWorkingMemory workingMemory, InternalReadAccessor extractor, InternalFactHandle object, FieldValue value ) {
        return ((ImperfectEvaluator) getEvaluator()).match( workingMemory, extractor, object, value );
    }

    public Degree match( InternalWorkingMemory workingMemory, InternalReadAccessor leftExtractor, InternalFactHandle left, InternalReadAccessor rightExtractor, InternalFactHandle right ) {
        return ((ImperfectEvaluator) getEvaluator()).match( workingMemory, leftExtractor, left, rightExtractor, right );
    }

    public Degree matchCachedLeft( InternalWorkingMemory workingMemory, VariableRestriction.VariableContextEntry context, InternalFactHandle right ) {
        return ((ImperfectEvaluator) getEvaluator()).matchCachedLeft( workingMemory, context, right );
    }

    public Degree matchCachedRight( InternalWorkingMemory workingMemory, VariableRestriction.VariableContextEntry context, InternalFactHandle left ) {
        return ((ImperfectEvaluator) getEvaluator()).matchCachedRight( workingMemory, context, left );
    }
}
