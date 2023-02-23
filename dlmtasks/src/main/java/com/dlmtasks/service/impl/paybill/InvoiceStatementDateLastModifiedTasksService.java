package com.dlmtasks.service.impl.paybill;

import com.bullhornsdk.data.model.entity.core.paybill.invoice.InvoiceStatement;
import com.dlmtasks.service.QueryDateLastModifiedTasksService;
import com.dlmtasks.node.DateLastModifiedEventTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvoiceStatementDateLastModifiedTasksService extends QueryDateLastModifiedTasksService<InvoiceStatement> {

    @Autowired
    public InvoiceStatementDateLastModifiedTasksService(Optional<List<DateLastModifiedEventTask<InvoiceStatement>>> dateLastModifiedEventTasks) {
        super(dateLastModifiedEventTasks, InvoiceStatement.class);
    }

}
