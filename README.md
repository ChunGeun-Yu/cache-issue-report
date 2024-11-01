there are following warn messages
```
Is this bean getting eagerly injected/applied to a currently created BeanPostProcessor [meterRegistryPostProcessor]?
```

following case.

CachingConfigurer + redis cache + jcache(ehcache) + actuator 


```

( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

 :: Spring Boot ::                (v3.3.5)

2024-11-01T20:11:04.298+09:00  INFO 135020 --- [report] [           main] c.example.report.IssueReportApplication  : Starting IssueReportApplication using Java 21.0.2 with PID 135020 (E:\workspace\meterregistry-error-report\target\classes started by chung in E:\workspace\meterregistry-error-report)
2024-11-01T20:11:04.300+09:00  INFO 135020 --- [report] [           main] c.example.report.IssueReportApplication  : No active profile set, falling back to 1 default profile: "default"
2024-11-01T20:11:04.982+09:00  INFO 135020 --- [report] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Multiple Spring Data modules found, entering strict repository configuration mode
2024-11-01T20:11:04.984+09:00  INFO 135020 --- [report] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data Redis repositories in DEFAULT mode.
2024-11-01T20:11:05.004+09:00  INFO 135020 --- [report] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 10 ms. Found 0 Redis repository interfaces.
2024-11-01T20:11:05.185+09:00  WARN 135020 --- [report] [           main] trationDelegate$BeanPostProcessorChecker : Bean 'spring.data.redis-org.springframework.boot.autoconfigure.data.redis.RedisProperties' of type [org.springframework.boot.autoconfigure.data.redis.RedisProperties] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying). Is this bean getting eagerly injected/applied to a currently created BeanPostProcessor [meterRegistryPostProcessor]? Check the corresponding BeanPostProcessor declaration and its dependencies/advisors. If this bean does not have to be post-processed, declare it with ROLE_INFRASTRUCTURE.
2024-11-01T20:11:05.189+09:00  WARN 135020 --- [report] [           main] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration' of type [org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying). Is this bean getting eagerly injected/applied to a currently created BeanPostProcessor [meterRegistryPostProcessor]? Check the corresponding BeanPostProcessor declaration and its dependencies/advisors. If this bean does not have to be post-processed, declare it with ROLE_INFRASTRUCTURE.
2024-11-01T20:11:05.191+09:00  WARN 135020 --- [report] [           main] trationDelegate$BeanPostProcessorChecker : Bean 'redisConnectionDetails' of type [org.springframework.boot.autoconfigure.data.redis.PropertiesRedisConnectionDetails] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying). Is this bean getting eagerly injected/applied to a currently created BeanPostProcessor [meterRegistryPostProcessor]? Check the corresponding BeanPostProcessor declaration and its dependencies/advisors. If this bean does not have to be post-processed, declare it with ROLE_INFRASTRUCTURE.
2024-11-01T20:11:05.196+09:00  WARN 135020 --- [report] [           main] trationDelegate$BeanPostProcessorChecker : Bean 'spring.ssl-org.springframework.boot.autoconfigure.ssl.SslProperties' of type [org.springframework.boot.autoconfigure.ssl.SslProperties] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying). Is this bean getting eagerly injected/applied to a currently created BeanPostProcessor [meterRegistryPostProcessor]? Check the corresponding BeanPostProcessor declaration and its dependencies/advisors. If this bean does not have to be post-processed, declare it with ROLE_INFRASTRUCTURE.
...
```
