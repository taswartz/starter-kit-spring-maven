package com.dlmtasks.node.impl.paybill;

import com.bullhornsdk.data.model.entity.core.paybill.charge.BillableCharge;
import com.dlmtasks.model.DateLastModifiedOption;
import com.dlmtasks.node.AbstractDateLastModifiedEventTask;

import java.util.Set;

public abstract class BillableChargeDateLastModifiedEventTask extends AbstractDateLastModifiedEventTask<BillableCharge> {

    public BillableChargeDateLastModifiedEventTask(Integer intervalMinutes) {
        super(BillableCharge.class, intervalMinutes);
    }

    public BillableChargeDateLastModifiedEventTask(Integer intervalMinutes, Set<String> fields) {
        super(BillableCharge.class, intervalMinutes, fields);
    }

    public BillableChargeDateLastModifiedEventTask(Integer intervalMinutes, DateLastModifiedOption.IncludeDateAdded includeDateAdded) {
        super(BillableCharge.class, intervalMinutes, includeDateAdded);
    }

    public BillableChargeDateLastModifiedEventTask(Integer intervalMinutes, Set<String> fields, DateLastModifiedOption.IncludeDateAdded includeDateAdded) {
        super(BillableCharge.class, intervalMinutes, fields, includeDateAdded);
    }

}
