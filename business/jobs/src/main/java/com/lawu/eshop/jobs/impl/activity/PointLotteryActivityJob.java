package com.lawu.eshop.jobs.impl.activity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import com.lawu.eshop.jobs.service.PointLotteryActivityService;

/**
 * @author meishuquan
 * @date 2018/2/5.
 */
public class PointLotteryActivityJob implements SimpleJob {

    private static Logger logger = LoggerFactory.getLogger(PointLotteryActivityJob.class);

    @Autowired
    private PointLotteryActivityService pointLotteryActivityService;

    @Override
    public void execute(ShardingContext shardingContext) {
        logger.debug("------{}-{} starting------", this.getClass().getSimpleName(), shardingContext.getShardingItem());

        pointLotteryActivityService.executeUpdatePointLotteryActivityStatus();

        logger.debug("------{}-{} finished------", this.getClass().getSimpleName(), shardingContext.getShardingItem());
    }
}
