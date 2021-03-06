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
package com.amazonaws.services.mediatailor.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mediatailor.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetPlaybackConfigurationResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPlaybackConfigurationResultJsonUnmarshaller implements Unmarshaller<GetPlaybackConfigurationResult, JsonUnmarshallerContext> {

    public GetPlaybackConfigurationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetPlaybackConfigurationResult getPlaybackConfigurationResult = new GetPlaybackConfigurationResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getPlaybackConfigurationResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("AdDecisionServerUrl", targetDepth)) {
                    context.nextToken();
                    getPlaybackConfigurationResult.setAdDecisionServerUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AvailSuppression", targetDepth)) {
                    context.nextToken();
                    getPlaybackConfigurationResult.setAvailSuppression(AvailSuppressionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Bumper", targetDepth)) {
                    context.nextToken();
                    getPlaybackConfigurationResult.setBumper(BumperJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CdnConfiguration", targetDepth)) {
                    context.nextToken();
                    getPlaybackConfigurationResult.setCdnConfiguration(CdnConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DashConfiguration", targetDepth)) {
                    context.nextToken();
                    getPlaybackConfigurationResult.setDashConfiguration(DashConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("HlsConfiguration", targetDepth)) {
                    context.nextToken();
                    getPlaybackConfigurationResult.setHlsConfiguration(HlsConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LivePreRollConfiguration", targetDepth)) {
                    context.nextToken();
                    getPlaybackConfigurationResult.setLivePreRollConfiguration(LivePreRollConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    getPlaybackConfigurationResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PersonalizationThresholdSeconds", targetDepth)) {
                    context.nextToken();
                    getPlaybackConfigurationResult.setPersonalizationThresholdSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("PlaybackConfigurationArn", targetDepth)) {
                    context.nextToken();
                    getPlaybackConfigurationResult.setPlaybackConfigurationArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PlaybackEndpointPrefix", targetDepth)) {
                    context.nextToken();
                    getPlaybackConfigurationResult.setPlaybackEndpointPrefix(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SessionInitializationEndpointPrefix", targetDepth)) {
                    context.nextToken();
                    getPlaybackConfigurationResult.setSessionInitializationEndpointPrefix(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SlateAdUrl", targetDepth)) {
                    context.nextToken();
                    getPlaybackConfigurationResult.setSlateAdUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    getPlaybackConfigurationResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("TranscodeProfileName", targetDepth)) {
                    context.nextToken();
                    getPlaybackConfigurationResult.setTranscodeProfileName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VideoContentSourceUrl", targetDepth)) {
                    context.nextToken();
                    getPlaybackConfigurationResult.setVideoContentSourceUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getPlaybackConfigurationResult;
    }

    private static GetPlaybackConfigurationResultJsonUnmarshaller instance;

    public static GetPlaybackConfigurationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetPlaybackConfigurationResultJsonUnmarshaller();
        return instance;
    }
}
