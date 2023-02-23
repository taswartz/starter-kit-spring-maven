package com.dlmtasks.service.impl;

import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.dlmtasks.service.SearchDateLastModifiedTasksService;
import com.dlmtasks.node.DateLastModifiedEventTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CandidateDateLastModifiedTasksService extends SearchDateLastModifiedTasksService<Candidate> {

    @Autowired
    public CandidateDateLastModifiedTasksService(Optional<List<DateLastModifiedEventTask<Candidate>>> dateLastModifiedEventTasks) {
        super(dateLastModifiedEventTasks, Candidate.class);
    }

}
