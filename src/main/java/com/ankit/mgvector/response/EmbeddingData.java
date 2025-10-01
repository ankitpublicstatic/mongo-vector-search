package com.ankit.mgvector.response;

import java.util.List;
import java.util.Objects;

/**
 * @author Ankit.Kumar
 * @since 16-01-2025
 */
public class EmbeddingData {
  private List<Double> embedding;

  public List<Double> getEmbedding() {
    return embedding;
  }

  public void setEmbedding(List<Double> embedding) {
    this.embedding = embedding;
  }

  @Override
  public int hashCode() {
    return Objects.hash(embedding);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof EmbeddingData)) {
      return false;
    }
    EmbeddingData other = (EmbeddingData) obj;
    return Objects.equals(embedding, other.embedding);
  }

  @Override
  public String toString() {
    return "EmbeddingData [embedding=" + embedding + "]";
  }
}
