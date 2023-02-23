package com.dlmtasks.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.Opportunity;
import com.dlmtasks.model.DateLastModifiedOption;
import com.dlmtasks.node.AbstractDateLastModifiedEventTask;

import java.util.Set;

public abstract class OpportunityDateLastModifiedEventTask extends AbstractDateLastModifiedEventTask<Opportunity> {

    public OpportunityDateLastModifiedEventTask(Integer intervalMinutes) {
        super(Opportunity.class, intervalMinutes);
    }

    public OpportunityDateLastModifiedEventTask(Integer intervalMinutes, Set<String> fields) {
        super(Opportunity.class, intervalMinutes, fields);
    }

    public OpportunityDateLastModifiedEventTask(Integer intervalMinutes, DateLastModifiedOption.IncludeDateAdded includeDateAdded) {
        super(Opportunity.class, intervalMinutes, includeDateAdded);
    }

    public OpportunityDateLastModifiedEventTask(Integer intervalMinutes, Set<String> fields, DateLastModifiedOption.IncludeDateAdded includeDateAdded) {
        super(Opportunity.class, intervalMinutes, fields, includeDateAdded);
    }

}
