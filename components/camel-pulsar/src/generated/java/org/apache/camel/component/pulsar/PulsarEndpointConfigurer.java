/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.pulsar;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class PulsarEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        PulsarEndpoint target = (PulsarEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "ackgrouptimemillis":
        case "ackGroupTimeMillis": target.getPulsarConfiguration().setAckGroupTimeMillis(property(camelContext, long.class, value)); return true;
        case "acktimeoutmillis":
        case "ackTimeoutMillis": target.getPulsarConfiguration().setAckTimeoutMillis(property(camelContext, long.class, value)); return true;
        case "allowmanualacknowledgement":
        case "allowManualAcknowledgement": target.getPulsarConfiguration().setAllowManualAcknowledgement(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "consumername":
        case "consumerName": target.getPulsarConfiguration().setConsumerName(property(camelContext, java.lang.String.class, value)); return true;
        case "consumernameprefix":
        case "consumerNamePrefix": target.getPulsarConfiguration().setConsumerNamePrefix(property(camelContext, java.lang.String.class, value)); return true;
        case "consumerqueuesize":
        case "consumerQueueSize": target.getPulsarConfiguration().setConsumerQueueSize(property(camelContext, int.class, value)); return true;
        case "deadlettertopic":
        case "deadLetterTopic": target.getPulsarConfiguration().setDeadLetterTopic(property(camelContext, java.lang.String.class, value)); return true;
        case "maxredelivercount":
        case "maxRedeliverCount": target.getPulsarConfiguration().setMaxRedeliverCount(property(camelContext, java.lang.Integer.class, value)); return true;
        case "negativeackredeliverydelaymicros":
        case "negativeAckRedeliveryDelayMicros": target.getPulsarConfiguration().setNegativeAckRedeliveryDelayMicros(property(camelContext, long.class, value)); return true;
        case "numberofconsumers":
        case "numberOfConsumers": target.getPulsarConfiguration().setNumberOfConsumers(property(camelContext, int.class, value)); return true;
        case "subscriptioninitialposition":
        case "subscriptionInitialPosition": target.getPulsarConfiguration().setSubscriptionInitialPosition(property(camelContext, org.apache.camel.component.pulsar.utils.consumers.SubscriptionInitialPosition.class, value)); return true;
        case "subscriptionname":
        case "subscriptionName": target.getPulsarConfiguration().setSubscriptionName(property(camelContext, java.lang.String.class, value)); return true;
        case "subscriptiontype":
        case "subscriptionType": target.getPulsarConfiguration().setSubscriptionType(property(camelContext, org.apache.camel.component.pulsar.utils.consumers.SubscriptionType.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "batchingenabled":
        case "batchingEnabled": target.getPulsarConfiguration().setBatchingEnabled(property(camelContext, boolean.class, value)); return true;
        case "batchingmaxmessages":
        case "batchingMaxMessages": target.getPulsarConfiguration().setBatchingMaxMessages(property(camelContext, int.class, value)); return true;
        case "batchingmaxpublishdelaymicros":
        case "batchingMaxPublishDelayMicros": target.getPulsarConfiguration().setBatchingMaxPublishDelayMicros(property(camelContext, long.class, value)); return true;
        case "blockifqueuefull":
        case "blockIfQueueFull": target.getPulsarConfiguration().setBlockIfQueueFull(property(camelContext, boolean.class, value)); return true;
        case "compressiontype":
        case "compressionType": target.getPulsarConfiguration().setCompressionType(property(camelContext, org.apache.pulsar.client.api.CompressionType.class, value)); return true;
        case "initialsequenceid":
        case "initialSequenceId": target.getPulsarConfiguration().setInitialSequenceId(property(camelContext, long.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "maxpendingmessages":
        case "maxPendingMessages": target.getPulsarConfiguration().setMaxPendingMessages(property(camelContext, int.class, value)); return true;
        case "maxpendingmessagesacrosspartitions":
        case "maxPendingMessagesAcrossPartitions": target.getPulsarConfiguration().setMaxPendingMessagesAcrossPartitions(property(camelContext, int.class, value)); return true;
        case "messagerouter":
        case "messageRouter": target.getPulsarConfiguration().setMessageRouter(property(camelContext, org.apache.pulsar.client.api.MessageRouter.class, value)); return true;
        case "messageroutingmode":
        case "messageRoutingMode": target.getPulsarConfiguration().setMessageRoutingMode(property(camelContext, org.apache.pulsar.client.api.MessageRoutingMode.class, value)); return true;
        case "producername":
        case "producerName": target.getPulsarConfiguration().setProducerName(property(camelContext, java.lang.String.class, value)); return true;
        case "sendtimeoutms":
        case "sendTimeoutMs": target.getPulsarConfiguration().setSendTimeoutMs(property(camelContext, int.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

}

