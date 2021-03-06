/**
 * author yuanwq, date: 2017年9月13日
 */
package xyz.codemeans.aliyun4j.opensearch4j.query.distinct;

import com.google.common.collect.Maps;
import xyz.codemeans.aliyun4j.opensearch4j.query.ISearchClause;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;

/**
 * author yuanwq
 */
public class DistinctClause implements ISearchClause {
  private final Map<String, DistinctUnit> distincts = Maps.newLinkedHashMap();

  /**
   * distKey相同的distinct会覆盖之前的设置
   */
  public DistinctClause add(DistinctUnit distinct) {
    distincts.put(distinct.getKey(), distinct);
    return this;
  }

  public Collection<DistinctUnit> getDistincts() {
    return Collections.unmodifiableCollection(distincts.values());
  }

  public boolean isEmpty() {
    return distincts.isEmpty();
  }

  @Override
  public StringBuilder appendQueryParams(StringBuilder sb) {
    sb.append("distinct=");
    if (isEmpty()) return sb;
    boolean first = true;
    for (DistinctUnit distinct : distincts.values()) {
      if (first) {
        first = false;
      } else {
        sb.append(";");
      }
      distinct.appendQueryParams(sb);
    }
    return sb;
  }

  @Override
  public String toString() {
    return appendQueryParams(new StringBuilder()).toString();
  }
}
