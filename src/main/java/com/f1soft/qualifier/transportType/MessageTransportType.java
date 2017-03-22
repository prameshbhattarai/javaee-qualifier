/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1soft.qualifier.transportType;

import com.f1soft.qualifier.impl.EmailMessageSender;
import com.f1soft.qualifier.impl.SmsMessageSender;
import com.f1soft.qualifier.interfaces.MessageSender;

/**
 *
 * @author pramesh.bhattarai
 */
public enum MessageTransportType {
    Email(EmailMessageSender.class),
    Sms(SmsMessageSender.class);
    
    private final Class<? extends MessageSender> messageSender;

    private MessageTransportType(Class<? extends MessageSender> messageSender) {
        this.messageSender = messageSender;
    }

    public Class<? extends MessageSender> getMessageSenderClass() {
        return messageSender;
    }
}
