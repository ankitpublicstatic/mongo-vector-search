package com.ankit.mgvector.models;

import java.util.Objects;

/**
 * @author Ankit.Kumar
 * @since 16-01-2025
 */

public class Imdb {
  private double rating;
  private int votes;
  private int id;

  public double getRating() {
    return rating;
  }

  public void setRating(double rating) {
    this.rating = rating;
  }

  public int getVotes() {
    return votes;
  }

  public void setVotes(int votes) {
    this.votes = votes;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, rating, votes);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof Imdb)) {
      return false;
    }
    Imdb other = (Imdb) obj;
    return id == other.id
        && Double.doubleToLongBits(rating) == Double.doubleToLongBits(other.rating)
        && votes == other.votes;
  }

  @Override
  public String toString() {
    return "Imdb [rating=" + rating + ", votes=" + votes + ", id=" + id + "]";
  }
}
