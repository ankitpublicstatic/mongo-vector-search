package com.ankit.mgvector.models;

/**
 * @author Ankit.Kumar
 * @since 16-01-2025
 */
import java.sql.Date;
import java.util.Objects;

public class Tomatoes {
  private Viewer viewer;
  private Date lastUpdated;

  public Viewer getViewer() {
    return viewer;
  }

  public void setViewer(Viewer viewer) {
    this.viewer = viewer;
  }

  public Date getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(Date lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public Tomatoes(Viewer viewer, Date lastUpdated) {
    super();
    this.viewer = viewer;
    this.lastUpdated = lastUpdated;
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastUpdated, viewer);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof Tomatoes)) {
      return false;
    }
    Tomatoes other = (Tomatoes) obj;
    return Objects.equals(lastUpdated, other.lastUpdated) && Objects.equals(viewer, other.viewer);
  }

  @Override
  public String toString() {
    return "Tomatoes [viewer=" + viewer + ", lastUpdated=" + lastUpdated + "]";
  }
}
