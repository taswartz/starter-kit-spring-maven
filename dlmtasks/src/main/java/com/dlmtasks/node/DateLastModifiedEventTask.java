package com.dlmtasks.node;

import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.dlmtasks.model.DateLastModifiedOption;

import java.util.Set;

public interface DateLastModifiedEventTask<T extends BullhornEntity> {

    void process(T entity);

    Class<T> getType();

    Integer getIntervalMinutes();

    Set<String> getFields();

    DateLastModifiedOption.IncludeDateAdded getIncludeDateAdded();

}
