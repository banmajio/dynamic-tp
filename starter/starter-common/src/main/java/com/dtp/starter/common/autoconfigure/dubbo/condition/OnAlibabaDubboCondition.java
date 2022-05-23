package com.dtp.starter.common.autoconfigure.dubbo.condition;

import org.springframework.boot.autoconfigure.condition.AllNestedConditions;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Condition;

/**
 * {@link Condition} that checks if the application is a dubbo application
 *
 * @author yanhom
 * @since 1.0.6
 */
public class OnAlibabaDubboCondition extends AllNestedConditions {

    OnAlibabaDubboCondition() {
        super(ConfigurationPhase.REGISTER_BEAN);
    }

    @ConditionalOnProperty(prefix = "spring.dubbo", name = "server", havingValue = "true")
    static class PropertyEnabled {}

    /**
     * just any common bean.
     */
    @ConditionalOnBean(type = "com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor")
    static class AnyCommonBean {}
}