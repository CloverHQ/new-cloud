### 关于@LoadBalanced

```java
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
```
基于RestTemplate的ClientHttpRequestInterceptor实现，请求前加入LoadBalancerInterceptor实现负载均衡。


