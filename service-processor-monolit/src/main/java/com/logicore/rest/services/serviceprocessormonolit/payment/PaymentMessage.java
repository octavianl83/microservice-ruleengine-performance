package com.logicore.rest.services.serviceprocessormonolit.payment;

public class PaymentMessage {

    private Tenant tenant;
    private String messageType;
    private MessageContent messageContent;

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public MessageContent getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(MessageContent messageContent) {
        this.messageContent = messageContent;
    }
}
