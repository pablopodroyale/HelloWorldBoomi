package com.hello.connector;

import com.boomi.connector.api.*;
import com.boomi.connector.util.BaseConnector;

public class HelloConnector extends BaseConnector {

    @Override
    public Browser createBrowser(BrowseContext browseContext) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Operation createOperation(OperationContext operationContext) {
        return new HelloExecuteOperation(operationContext);
    }
}
