package com.qmclouca.base.configs;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.AppenderBase;
import ch.qos.logback.core.Layout;
import ch.qos.logback.core.LayoutBase;

import java.util.ArrayList;
import java.util.List;

public class TestLogAppender extends AppenderBase<ILoggingEvent> {
    private final List<String> logs = new ArrayList<>();
    private Layout<ILoggingEvent> layout = new LayoutBase<ILoggingEvent>() {
        @Override
        public String doLayout(ILoggingEvent event) {
            return event.getFormattedMessage();
        }
    };

    public TestLogAppender() {

    }

    public TestLogAppender(Layout<ILoggingEvent> layout){
        this.layout = layout;
    }

    @Override
    protected void append(ILoggingEvent eventObject){
        logs.add(layout.doLayout(eventObject));
    }

    public List<String> getLogs(){
        return logs;
    }

    public void setLayout(Layout<ILoggingEvent> layout) {
        this.layout = layout;
    }
}
