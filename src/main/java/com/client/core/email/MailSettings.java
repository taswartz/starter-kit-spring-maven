package com.client.core.email;

import com.google.common.collect.Lists;
import lombok.Data;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * Object used to represent settings used for emailing.  Values should be provided via a properties file and injected
 * using a Spring {@link org.springframework.beans.factory.config.PropertyPlaceholderConfigurer}, either in
 * applicationContext.xml or using {@link org.springframework.beans.factory.annotation.Value} annotations
 */
@Data
@Configuration
public class MailSettings {
    private String host;
    private String port;
    private String username;
    private String password;
    private String sender;
    private String senderName;
    private Boolean disabled;
    private List<String> routeToWhenDisabled;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MailSettings)) return false;

        MailSettings that = (MailSettings) o;

        if (host != null ? !host.equals(that.host) : that.host != null) return false;
        if (port != null ? !port.equals(that.port) : that.port != null) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (sender != null ? !sender.equals(that.sender) : that.sender != null) return false;
        if (senderName != null ? !senderName.equals(that.senderName) : that.senderName != null) return false;
        if (disabled != null ? !disabled.equals(that.disabled) : that.disabled != null) return false;
        return routeToWhenDisabled != null ? routeToWhenDisabled.equals(that.routeToWhenDisabled) : that.routeToWhenDisabled == null;

    }

    @Override
    public int hashCode() {
        int result = host != null ? host.hashCode() : 0;
        result = 31 * result + (port != null ? port.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (sender != null ? sender.hashCode() : 0);
        result = 31 * result + (senderName != null ? senderName.hashCode() : 0);
        result = 31 * result + (disabled != null ? disabled.hashCode() : 0);
        result = 31 * result + (routeToWhenDisabled != null ? routeToWhenDisabled.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return new StringBuilder("MailSettings {")
                .append("\n\t\"host\": ")
                .append("'")
                .append(host).append('\'')
                .append(",\n\t\"port\": ")
                .append("'")
                .append(port).append('\'')
                .append(",\n\t\"username\": ")
                .append("'")
                .append(username).append('\'')
                .append(",\n\t\"password\": ")
                .append("'")
                .append(password).append('\'')
                .append(",\n\t\"sender\": ")
                .append("'")
                .append(sender).append('\'')
                .append(",\n\t\"senderName\": ")
                .append("'")
                .append(senderName).append('\'')
                .append(",\n\t\"disabled\": ")
                .append(disabled)
                .append(",\n\t\"routeToWhenDisabled\": ")
                .append("'")
                .append(routeToWhenDisabled).append('\'')
                .append('}')
                .toString();
    }
}
