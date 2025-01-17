package com.dtp.starter.adapter.motan.autoconfigure;

import com.dtp.adapter.motan.MotanDtpAdapter;
import com.dtp.starter.common.autoconfigure.BaseBeanAutoConfiguration;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * MotanTpAutoConfiguration related
 *
 * @author yanhom
 * @since 1.1.0
 */
@Configuration
@ConditionalOnClass(name = "com.weibo.api.motan.config.springsupport.ServiceConfigBean")
@ConditionalOnBean({BaseBeanAutoConfiguration.class})
@AutoConfigureAfter({BaseBeanAutoConfiguration.class})
public class MotanTpAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public MotanDtpAdapter motanDtpAdapter() {
        return new MotanDtpAdapter();
    }
}
