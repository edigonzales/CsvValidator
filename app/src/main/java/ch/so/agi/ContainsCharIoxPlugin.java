package ch.so.agi;

import ch.interlis.iox_j.validator.InterlisFunction;
import ch.ehi.basics.settings.Settings;
import ch.interlis.ili2c.metamodel.LocalAttribute;
import ch.interlis.ili2c.metamodel.TransferDescription;
import ch.interlis.ili2c.metamodel.Viewable;
import ch.interlis.iom.IomObject;
import ch.interlis.iox.IoxValidationConfig;
import ch.interlis.iox_j.jts.Iox2jtsException;
import ch.interlis.iox_j.logging.LogEventFactory;
import ch.interlis.iox_j.validator.InterlisFunction;
import ch.interlis.iox_j.validator.ObjectPool;
import ch.interlis.iox_j.validator.Value;

public class ContainsCharIoxPlugin implements InterlisFunction {
    private LogEventFactory logger = null;

    @Override
    public Value evaluate(String validationKind, String usageScope, IomObject mainObj, Value[] actualArguments) {
        if (actualArguments[0].skipEvaluation()) {
            return actualArguments[0];
        }
        if (actualArguments[0].isUndefined()) {
            return Value.createSkipEvaluation();
        }
        if (actualArguments[1].skipEvaluation()) {
            return actualArguments[1];
        }
        if (actualArguments[1].isUndefined()) {
            return Value.createSkipEvaluation();
        }
        
        String attr = actualArguments[0].getValue();
        String character = actualArguments[1].getValue();

        return new Value(attr.contains(character));
    }

    @Override
    public String getQualifiedIliName() {
        return "SO_Functions.containsChar";
    }

    @Override
    public void init(TransferDescription td, Settings settings, IoxValidationConfig validationConfig, ObjectPool arg3,
            LogEventFactory logEventFactory) {
        this.logger = logEventFactory;
        this.logger.setValidationConfig(validationConfig);        
    }

}
