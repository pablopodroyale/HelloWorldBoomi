package com.hello.connector;

import com.boomi.connector.api.*;
import com.boomi.connector.util.PayloadUtil;

public class HelloExecuteOperation implements Operation {
    private final String _inputFromOperation;

    protected HelloExecuteOperation(OperationContext context){
        this._inputFromOperation = context.getOperationProperties().getProperty("inputFromOperation");
    }

    @Override
    public void execute(OperationRequest operationRequest, OperationResponse operationResponse) {

        UpdateRequest updateRequest =(UpdateRequest) operationRequest;
        String output;
        for (ObjectData input : updateRequest) {
            input.getLogger().info("Hello world: ");
            output = (this._inputFromOperation != null && !this._inputFromOperation.isEmpty()) ? this._inputFromOperation : "operation input empty";
            Payload payload = (PayloadUtil.toPayload("Hello world: " + output));
            operationResponse.addResult(input, OperationStatus.SUCCESS, "200", "great success!", payload);
        }
    }
}
