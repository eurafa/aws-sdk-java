/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.devicefarm.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.devicefarm.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ListArtifactsResult JSON Unmarshaller
 */
public class ListArtifactsResultJsonUnmarshaller implements
        Unmarshaller<ListArtifactsResult, JsonUnmarshallerContext> {

    public ListArtifactsResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        ListArtifactsResult listArtifactsResult = new ListArtifactsResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL)
            return null;

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("artifacts", targetDepth)) {
                    context.nextToken();
                    listArtifactsResult
                            .setArtifacts(new ListUnmarshaller<Artifact>(
                                    ArtifactJsonUnmarshaller.getInstance())
                                    .unmarshall(context));
                }
                if (context.testExpression("nextToken", targetDepth)) {
                    context.nextToken();
                    listArtifactsResult.setNextToken(StringJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null
                        || context.getLastParsedParentElement().equals(
                                currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return listArtifactsResult;
    }

    private static ListArtifactsResultJsonUnmarshaller instance;

    public static ListArtifactsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListArtifactsResultJsonUnmarshaller();
        return instance;
    }
}
