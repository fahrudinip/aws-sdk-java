/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.mturk.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mturk.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ListHITsForQualificationTypeResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListHITsForQualificationTypeResultJsonUnmarshaller implements Unmarshaller<ListHITsForQualificationTypeResult, JsonUnmarshallerContext> {

    public ListHITsForQualificationTypeResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListHITsForQualificationTypeResult listHITsForQualificationTypeResult = new ListHITsForQualificationTypeResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return listHITsForQualificationTypeResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("NextToken", targetDepth)) {
                    context.nextToken();
                    listHITsForQualificationTypeResult.setNextToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NumResults", targetDepth)) {
                    context.nextToken();
                    listHITsForQualificationTypeResult.setNumResults(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("HITs", targetDepth)) {
                    context.nextToken();
                    listHITsForQualificationTypeResult.setHITs(new ListUnmarshaller<HIT>(HITJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return listHITsForQualificationTypeResult;
    }

    private static ListHITsForQualificationTypeResultJsonUnmarshaller instance;

    public static ListHITsForQualificationTypeResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListHITsForQualificationTypeResultJsonUnmarshaller();
        return instance;
    }
}
