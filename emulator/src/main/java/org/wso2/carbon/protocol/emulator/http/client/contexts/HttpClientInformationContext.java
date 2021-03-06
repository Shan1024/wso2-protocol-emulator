/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.protocol.emulator.http.client.contexts;

import org.wso2.carbon.protocol.emulator.http.client.HttpClientInitializer;

import java.util.ArrayList;
import java.util.List;

/**
 * Class for HTTP client request response information context.
 */
public class HttpClientInformationContext {
    private HttpClientConfigBuilderContext clientConfigBuilderContext;
    private List<RequestResponseCorrelation> correlation;
    private HttpClientInitializer clientInitializer;
    private HttpClientRequestBuilderContext requestContext;
    private HttpClientResponseProcessorContext receivedProcessContext;

    public HttpClientConfigBuilderContext getClientConfigBuilderContext() {
        return clientConfigBuilderContext;
    }

    public void setClientConfigBuilderContext(HttpClientConfigBuilderContext clientConfigBuilderContext) {
        this.clientConfigBuilderContext = clientConfigBuilderContext;
    }

    public List<RequestResponseCorrelation> getRequestResponseCorrelation() {
        return correlation;
    }

    public void addCorrelation(HttpClientRequestBuilderContext httpClientRequestBuilderContext,
                               HttpClientResponseBuilderContext expectedResponseContext) {
        if (correlation == null) {
            this.correlation = new ArrayList<>();
        }
        correlation.add(new RequestResponseCorrelation(httpClientRequestBuilderContext, expectedResponseContext));
    }

    public HttpClientInitializer getClientInitializer() {
        return clientInitializer;
    }

    public void setClientInitializer(HttpClientInitializer clientInitializer) {
        this.clientInitializer = clientInitializer;
    }

    public HttpClientRequestBuilderContext getRequestContext() {
        return requestContext;
    }

    public void setRequestContext(HttpClientRequestBuilderContext requestContext) {
        this.requestContext = requestContext;
    }

    public HttpClientResponseProcessorContext getLastReceivedResponseProcessContext() {
        return receivedProcessContext;
    }

    public void setReceivedResponseProcessContext(HttpClientResponseProcessorContext receivedProcessContext) {
        this.receivedProcessContext = receivedProcessContext;
    }

}
