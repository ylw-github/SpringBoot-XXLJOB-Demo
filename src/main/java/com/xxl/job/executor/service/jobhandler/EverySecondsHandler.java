package com.xxl.job.executor.service.jobhandler;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.JobHandler;
import com.xxl.job.executor.core.config.XxlJobConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@JobHandler("everySecondsHandler")
@Component
public class EverySecondsHandler extends IJobHandler {

    private Logger logger = LoggerFactory.getLogger(XxlJobConfig.class);

    @Value("${server.port}")
    private String serverPort;

    @Override
    public ReturnT<String> execute(String param) throws Exception {
        logger.info("######端口号：serverPort" + serverPort + "###定时Job开始执行啦!!!!######");
        return SUCCESS;
    }

}