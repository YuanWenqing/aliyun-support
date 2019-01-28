# opensearch4j

对阿里云OpenSearch的二次封装，便于构造查询，尤其是其中的query子句与Filter子句的构造

限制：
* 仅支持v2版本api
* 仅支持aliyun用户的accessKey/accessSecret
* 仅支持json格式的返回值
* disable和summary功能未实现
* 仅支持search和suggest功能

## Usage

maven

~~~xml
<dependency>
  <groupId>xyz.codemeans.aliyun4j</groupId>
  <artifactId>opensearch4j</artifactId>
  <version>1.0.0</version>
</dependency>
~~~

gradle

~~~groovy
implementation "xyz.codemeans.aliyun4j:opensearch4j:1.0.0"
~~~

