package com.dlmtasks.service.impl.paybill;

import com.bullhornsdk.data.model.entity.core.paybill.invoice.InvoiceStatementBatch;
import com.dlmtasks.service.QueryDateLastModifiedTasksService;
import com.dlmtasks.node.DateLastModifiedEventTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvoiceStatementBatchDateLastModifiedTasksService extends QueryDateLastModifiedTasksService<InvoiceStatementBatch> {

    @Autowired
    public InvoiceStatementBatchDateLastModifiedTasksService(Optional<List<DateLastModifiedEventTask<InvoiceStatementBatch>>> dateLastModifiedEventTasks) {
        super(dateLastModifiedEventTasks, InvoiceStatementBatch.class);
    }

}
