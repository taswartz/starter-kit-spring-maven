package com.client.core.base.workflow.node;

import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.client.ApplicationSettings;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.base.model.relatedentity.StandardRelatedEntity;
import com.client.core.base.workflow.traversing.Traverser;
import com.email.service.EmailTemplateService;
import com.email.service.Emailer;
import com.google.common.collect.Maps;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.NoSuchMessageException;

import java.util.Locale;
import java.util.Map;
import java.util.Set;

// TODO: This class changed quite a bit getting rid of things. Make sure there's nothing missing from original file
public abstract class AbstractWorkflowAction<E extends BullhornEntity, T extends Traverser> implements WorkflowAction<E, T> {

    private final Logger log = Logger.getLogger(getClass());  // TODO: NEW LOGGER??

    private final Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields;

    @Autowired
    private ApplicationSettings appSettings;

    @Autowired
    private Emailer emailer;

    @Autowired
    private MessageSource messageSource;

    public AbstractWorkflowAction(Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
        this.relatedEntityFields = relatedEntityFields;
    }

    protected Map<StandardRelatedEntity, Set<String>> getStandardEntityFields() {
        return Maps.newLinkedHashMap();
    }

    protected String getMessageUsingKey(String key) throws NoSuchMessageException {
        return getMessageUsingKey(key, new Object[] {});
    }

    protected String getMessageUsingKey(String key, Object[] args) throws NoSuchMessageException {
        return messageSource.getMessage(key, args, Locale.US);
    }

    @Override
    public Map<? extends BullhornRelatedEntity, Set<String>> getRelatedEntityFields() {
        Map<BullhornRelatedEntity, Set<String>> allFields = Maps.newLinkedHashMap();

        allFields.putAll(getStandardEntityFields());
        allFields.putAll(this.relatedEntityFields);

        return allFields;
    }

    protected Logger getLog() {
        return log;
    }

}
