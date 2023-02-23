package com.dlmtasks.service;

import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.dlmtasks.model.DateLastModifiedOption;
import com.dlmtasks.model.helper.DateLastModifiedEventTaskHelper;
import com.dlmtasks.node.DateLastModifiedEventTask;
import com.utility.Utility;
import org.joda.time.DateTime;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;

public abstract class QueryDateLastModifiedTasksService<T extends QueryEntity> extends AbstractDateLastModifiedTasksService<T> {

    public QueryDateLastModifiedTasksService(Optional<List<DateLastModifiedEventTask<T>>> dateLastModifiedEventTasks, Class<T> type) {
        super(dateLastModifiedEventTasks, type);
    }

    @Override
    protected String getClause(DateLastModifiedEventTaskHelper<T> helper, DateTime start) {
        StringBuilder where = new StringBuilder();

        Long intervalMinutesAgo = start.minusMinutes(helper.getIntervalMinutes()).getMillis();

        where.append("dateLastModified >= ").append(intervalMinutesAgo);

        if (helper.getIncludeDateAdded() == DateLastModifiedOption.IncludeDateAdded.YES) {
            where.append(" OR dateAdded >= ").append(intervalMinutesAgo);
        }

        return where.toString();
    }

    @Override
    protected void process(String where, Set<String> fields, Consumer<T> process) {
        Utility.queryAndProcessAll(getType(), where, fields, process);
    }

}
