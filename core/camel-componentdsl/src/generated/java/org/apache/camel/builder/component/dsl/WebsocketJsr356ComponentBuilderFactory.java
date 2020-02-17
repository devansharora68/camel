/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.component.dsl;

import javax.annotation.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.websocket.jsr356.JSR356WebSocketComponent;

/**
 * Camel WebSocket using JSR356 (javax)
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface WebsocketJsr356ComponentBuilderFactory {

    /**
     * Javax Websocket (camel-websocket-jsr356)
     * Camel WebSocket using JSR356 (javax)
     * 
     * Category: http
     * Since: 2.23
     * Maven coordinates: org.apache.camel:camel-websocket-jsr356
     */
    static WebsocketJsr356ComponentBuilder websocketJsr356() {
        return new WebsocketJsr356ComponentBuilderImpl();
    }

    /**
     * Builder for the Javax Websocket component.
     */
    interface WebsocketJsr356ComponentBuilder
            extends
                ComponentBuilder<JSR356WebSocketComponent> {
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default WebsocketJsr356ComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default WebsocketJsr356ComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the component should use basic property binding (Camel 2.x)
         * or the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default WebsocketJsr356ComponentBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * To enable customization of how a WebSocket ServerEndpoint is
         * configured and deployed. By default
         * DefaultServerEndpointDeploymentStrategy is used.
         * 
         * The option is a:
         * <code>org.apache.camel.websocket.jsr356.ServerEndpointDeploymentStrategy</code> type.
         * 
         * Group: advanced
         */
        default WebsocketJsr356ComponentBuilder serverEndpointDeploymentStrategy(
                org.apache.camel.websocket.jsr356.ServerEndpointDeploymentStrategy serverEndpointDeploymentStrategy) {
            doSetProperty("serverEndpointDeploymentStrategy", serverEndpointDeploymentStrategy);
            return this;
        }
    }

    class WebsocketJsr356ComponentBuilderImpl
            extends
                AbstractComponentBuilder<JSR356WebSocketComponent>
            implements
                WebsocketJsr356ComponentBuilder {
        @Override
        protected JSR356WebSocketComponent buildConcreteComponent() {
            return new JSR356WebSocketComponent();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "bridgeErrorHandler": ((JSR356WebSocketComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "lazyStartProducer": ((JSR356WebSocketComponent) component).setLazyStartProducer((boolean) value); return true;
            case "basicPropertyBinding": ((JSR356WebSocketComponent) component).setBasicPropertyBinding((boolean) value); return true;
            case "serverEndpointDeploymentStrategy": ((JSR356WebSocketComponent) component).setServerEndpointDeploymentStrategy((org.apache.camel.websocket.jsr356.ServerEndpointDeploymentStrategy) value); return true;
            default: return false;
            }
        }
    }
}