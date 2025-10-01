package com.ankit.mgvector.response;

import java.util.List;
import java.util.Objects;

/**
 * @author Ankit.Kumar
 * @since 16-01-2025
 */
public class EmbeddingResponse {
  private List<EmbeddingData> data;

  public List<EmbeddingData> getData() {
    return data;
  }

  public void setData(List<EmbeddingData> data) {
    this.data = data;
  }

  public List<Double> getEmbedding() {
    return data.get(0).getEmbedding();
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof EmbeddingResponse)) {
      return false;
    }
    EmbeddingResponse other = (EmbeddingResponse) obj;
    return Objects.equals(data, other.data);
  }

  @Override
  public String toString() {
    return "EmbeddingResponse [data=" + data + "]";
  }
}
