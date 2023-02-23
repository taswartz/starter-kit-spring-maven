package com.dlmtasks.service;

import com.bullhornsdk.data.model.entity.core.type.SearchEntity;
import com.dlmtasks.model.DateLastModifiedOption;
import com.dlmtasks.model.helper.DateLastModifiedEventTaskHelper;
import com.dlmtasks.node.DateLastModifiedEventTask;
import com.utility.Utility;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;

public abstract class SearchDateLastModifiedTasksService<T extends SearchEntity>  extends AbstractDateLastModifiedTasksService<T> {

    public SearchDateLastModifiedTasksService(Optional<List<DateLastModifiedEventTask<T>>> dateLastModifiedEventTasks, Class<T> type) {
        super(dateLastModifiedEventTasks, type);
    }

    @Override
    protected String getClause(DateLastModifiedEventTaskHelper<T> helper, DateTime start) {
        StringBuilder query = new StringBuilder();

        DateTime intervalMinutesAgo = start.minusMinutes(helper.getIntervalMinutes());

        query.append("dateLastModified:[").append(Utility.formatDateForSearch(intervalMinutesAgo.withZone(DateTimeZone.UTC)))
                .append(" TO *]");

        if (helper.getIncludeDateAdded() == DateLastModifiedOption.IncludeDateAdded.YES) {
            query.append(" OR dateAdded:[").append(Utility.formatDateForSearch(intervalMinutesAgo.withZone(DateTimeZone.UTC)))
                    .append(" TO *]");
        }

        return query.toString();
    }

    @Override
    protected void process(String where, Set<String> fields, Consumer<T> process) {
        Utility.searchAndProcessAll(getType(), where, fields, process);
    }
}
