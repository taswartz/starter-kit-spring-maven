package com.dlmtasks.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.JobSubmission;
import com.dlmtasks.model.DateLastModifiedOption;
import com.dlmtasks.node.AbstractDateLastModifiedEventTask;

import java.util.Set;

public abstract class JobSubmissionDateLastModifiedEventTask extends AbstractDateLastModifiedEventTask<JobSubmission> {

    public JobSubmissionDateLastModifiedEventTask(Integer intervalMinutes) {
        super(JobSubmission.class, intervalMinutes);
    }

    public JobSubmissionDateLastModifiedEventTask(Integer intervalMinutes, Set<String> fields) {
        super(JobSubmission.class, intervalMinutes, fields);
    }

    public JobSubmissionDateLastModifiedEventTask(Integer intervalMinutes, DateLastModifiedOption.IncludeDateAdded includeDateAdded) {
        super(JobSubmission.class, intervalMinutes, includeDateAdded);
    }

    public JobSubmissionDateLastModifiedEventTask(Integer intervalMinutes, Set<String> fields, DateLastModifiedOption.IncludeDateAdded includeDateAdded) {
        super(JobSubmission.class, intervalMinutes, fields, includeDateAdded);
    }

}
