package com.aws.lamda.integration;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LamdaHandler implements RequestHandler<String,String> {

    public String handleRequest(String input, Context context) {
        LambdaLogger logger = context.getLogger();
        logger.log("JDK Version: " + System.getProperty("java.version"));
        return new StringBuffer(input).reverse().toString();
    }

}