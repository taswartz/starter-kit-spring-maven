package com.client.core.scheduledtasks.config;

import com.google.common.collect.Maps;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Map;

@ConfigurationProperties(prefix = "scheduledtasks")
public record ScheduledTasksSettings(Map<String, String> customSubscriptions, String dateLastModifiedCronExpression) {
    public ScheduledTasksSettings {
        if (customSubscriptions == null) {
            customSubscriptions = Maps.newHashMap();
        }
    }
}
