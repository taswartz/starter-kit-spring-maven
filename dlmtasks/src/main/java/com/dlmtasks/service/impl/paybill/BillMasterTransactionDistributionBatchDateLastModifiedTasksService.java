package com.dlmtasks.service.impl.paybill;

import com.bullhornsdk.data.model.entity.core.paybill.distribution.BillMasterTransactionDistributionBatch;
import com.dlmtasks.service.QueryDateLastModifiedTasksService;
import com.dlmtasks.node.DateLastModifiedEventTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BillMasterTransactionDistributionBatchDateLastModifiedTasksService extends QueryDateLastModifiedTasksService<BillMasterTransactionDistributionBatch> {

    @Autowired
    public BillMasterTransactionDistributionBatchDateLastModifiedTasksService(Optional<List<DateLastModifiedEventTask<BillMasterTransactionDistributionBatch>>> dateLastModifiedEventTasks) {
        super(dateLastModifiedEventTasks, BillMasterTransactionDistributionBatch.class);
    }

}
