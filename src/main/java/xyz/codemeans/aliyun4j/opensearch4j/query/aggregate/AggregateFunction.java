package xyz.codemeans.aliyun4j.opensearch4j.query.aggregate;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * author: yuanwq
 * date: 2018/9/22
 */
@AllArgsConstructor
@Getter
public enum AggregateFunction {
  COUNT("count"),
  SUM("sum"),
  MAX("max"),
  MIN("min");

  private final String functionName;
}
