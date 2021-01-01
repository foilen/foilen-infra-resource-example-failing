/*
    Foilen Infra Resource Example Failing
    https://github.com/foilen/foilen-infra-resource-example-failing
    Copyright (c) 2018-2021 Foilen (http://foilen.com)

    The MIT License
    http://opensource.org/licenses/MIT

 */
package com.foilen.infra.resource.example.failing;

import com.foilen.infra.plugin.v1.core.context.ChangesContext;
import com.foilen.infra.plugin.v1.core.context.CommonServicesContext;
import com.foilen.infra.plugin.v1.core.context.TimerEventContext;
import com.foilen.infra.plugin.v1.core.eventhandler.TimerEventHandler;

public class CrashingTimerEventHandler implements TimerEventHandler {

    @Override
    public void timerHandler(CommonServicesContext services, ChangesContext changes, TimerEventContext event) {
        throw new RuntimeException("FAILING PLUGIN");
    }

}
