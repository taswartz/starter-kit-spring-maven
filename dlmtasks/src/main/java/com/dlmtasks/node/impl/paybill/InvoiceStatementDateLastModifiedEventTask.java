package com.dlmtasks.node.impl.paybill;

import com.bullhornsdk.data.model.entity.core.paybill.invoice.InvoiceStatement;
import com.dlmtasks.model.DateLastModifiedOption;
import com.dlmtasks.node.AbstractDateLastModifiedEventTask;

import java.util.Set;

public abstract class InvoiceStatementDateLastModifiedEventTask extends AbstractDateLastModifiedEventTask<InvoiceStatement> {

    public InvoiceStatementDateLastModifiedEventTask(Integer intervalMinutes) {
        super(InvoiceStatement.class, intervalMinutes);
    }

    public InvoiceStatementDateLastModifiedEventTask(Integer intervalMinutes, Set<String> fields) {
        super(InvoiceStatement.class, intervalMinutes, fields);
    }

    public InvoiceStatementDateLastModifiedEventTask(Integer intervalMinutes, DateLastModifiedOption.IncludeDateAdded includeDateAdded) {
        super(InvoiceStatement.class, intervalMinutes, includeDateAdded);
    }

    public InvoiceStatementDateLastModifiedEventTask(Integer intervalMinutes, Set<String> fields, DateLastModifiedOption.IncludeDateAdded includeDateAdded) {
        super(InvoiceStatement.class, intervalMinutes, fields, includeDateAdded);
    }

}
