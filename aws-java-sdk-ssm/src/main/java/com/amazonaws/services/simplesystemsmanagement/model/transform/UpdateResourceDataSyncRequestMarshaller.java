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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simplesystemsmanagement.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateResourceDataSyncRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateResourceDataSyncRequestMarshaller {

    private static final MarshallingInfo<String> SYNCNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SyncName").build();
    private static final MarshallingInfo<String> SYNCTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SyncType").build();
    private static final MarshallingInfo<StructuredPojo> SYNCSOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SyncSource").build();

    private static final UpdateResourceDataSyncRequestMarshaller instance = new UpdateResourceDataSyncRequestMarshaller();

    public static UpdateResourceDataSyncRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateResourceDataSyncRequest updateResourceDataSyncRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateResourceDataSyncRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateResourceDataSyncRequest.getSyncName(), SYNCNAME_BINDING);
            protocolMarshaller.marshall(updateResourceDataSyncRequest.getSyncType(), SYNCTYPE_BINDING);
            protocolMarshaller.marshall(updateResourceDataSyncRequest.getSyncSource(), SYNCSOURCE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
