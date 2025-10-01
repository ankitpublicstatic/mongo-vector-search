package com.ankit.mgvector.models;

import java.util.Objects;

/**
 * @author Ankit.Kumar
 * @since 16-01-2025
 */
public class Viewer {
  private double rating;
  private int numReviews;

  public double getRating() {
    return rating;
  }

  public void setRating(double rating) {
    this.rating = rating;
  }

  public int getNumReviews() {
    return numReviews;
  }

  public void setNumReviews(int numReviews) {
    this.numReviews = numReviews;
  }

  public Viewer(double rating, int numReviews) {
    super();
    this.rating = rating;
    this.numReviews = numReviews;
  }

  @Override
  public int hashCode() {
    return Objects.hash(numReviews, rating);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof Viewer)) {
      return false;
    }
    Viewer other = (Viewer) obj;
    return numReviews == other.numReviews
        && Double.doubleToLongBits(rating) == Double.doubleToLongBits(other.rating);
  }

  @Override
  public String toString() {
    return "Viewer [rating=" + rating + ", numReviews=" + numReviews + "]";
  }
}
