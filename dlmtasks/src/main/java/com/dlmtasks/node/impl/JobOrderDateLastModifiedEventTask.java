package com.dlmtasks.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.JobOrder;
import com.dlmtasks.model.DateLastModifiedOption;
import com.dlmtasks.node.AbstractDateLastModifiedEventTask;

import java.util.Set;

public abstract class JobOrderDateLastModifiedEventTask extends AbstractDateLastModifiedEventTask<JobOrder> {

    public JobOrderDateLastModifiedEventTask(Integer intervalMinutes) {
        super(JobOrder.class, intervalMinutes);
    }

    public JobOrderDateLastModifiedEventTask(Integer intervalMinutes, Set<String> fields) {
        super(JobOrder.class, intervalMinutes, fields);
    }

    public JobOrderDateLastModifiedEventTask(Integer intervalMinutes, DateLastModifiedOption.IncludeDateAdded includeDateAdded) {
        super(JobOrder.class, intervalMinutes, includeDateAdded);
    }

    public JobOrderDateLastModifiedEventTask(Integer intervalMinutes, Set<String> fields, DateLastModifiedOption.IncludeDateAdded includeDateAdded) {
        super(JobOrder.class, intervalMinutes, fields, includeDateAdded);
    }

}
