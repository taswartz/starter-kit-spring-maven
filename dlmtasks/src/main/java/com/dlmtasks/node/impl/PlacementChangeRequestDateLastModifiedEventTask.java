package com.dlmtasks.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.PlacementChangeRequest;
import com.dlmtasks.model.DateLastModifiedOption;
import com.dlmtasks.node.AbstractDateLastModifiedEventTask;

import java.util.Set;

public abstract class PlacementChangeRequestDateLastModifiedEventTask extends AbstractDateLastModifiedEventTask<PlacementChangeRequest> {

    public PlacementChangeRequestDateLastModifiedEventTask(Integer intervalMinutes) {
        super(PlacementChangeRequest.class, intervalMinutes);
    }

    public PlacementChangeRequestDateLastModifiedEventTask(Integer intervalMinutes, Set<String> fields) {
        super(PlacementChangeRequest.class, intervalMinutes, fields);
    }

    public PlacementChangeRequestDateLastModifiedEventTask(Integer intervalMinutes, DateLastModifiedOption.IncludeDateAdded includeDateAdded) {
        super(PlacementChangeRequest.class, intervalMinutes, includeDateAdded);
    }

    public PlacementChangeRequestDateLastModifiedEventTask(Integer intervalMinutes, Set<String> fields, DateLastModifiedOption.IncludeDateAdded includeDateAdded) {
        super(PlacementChangeRequest.class, intervalMinutes, fields, includeDateAdded);
    }

}
