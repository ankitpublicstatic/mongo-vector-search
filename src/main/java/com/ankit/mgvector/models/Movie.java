package com.ankit.mgvector.models;

/**
 * @author Ankit.Kumar
 * @since 16-01-2025
 */
import java.util.Date;
import java.util.List;
import java.util.Objects;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;

public class Movie {
  @BsonProperty("_id")
  private ObjectId id;

  private String title;
  private int year;
  private int runtime;
  private Date released;
  private String poster;
  private String plot;
  private String fullplot;
  private String lastUpdated;
  private String type;
  private List<String> directors;
  private List<String> cast;
  private List<String> countries;
  private List<String> genres;
  private String plot_embeddings;
  private int num_mflix_comments;
  private Imdb imdb;
  private Tomatoes tomatoes;

  public ObjectId getId() {
    return id;
  }

  public void setId(ObjectId id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public int getRuntime() {
    return runtime;
  }

  public void setRuntime(int runtime) {
    this.runtime = runtime;
  }

  public Date getReleased() {
    return released;
  }

  public void setReleased(Date released) {
    this.released = released;
  }

  public String getPoster() {
    return poster;
  }

  public void setPoster(String poster) {
    this.poster = poster;
  }

  public String getPlot() {
    return plot;
  }

  public void setPlot(String plot) {
    this.plot = plot;
  }

  public String getFullplot() {
    return fullplot;
  }

  public void setFullplot(String fullplot) {
    this.fullplot = fullplot;
  }

  public String getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public List<String> getDirectors() {
    return directors;
  }

  public void setDirectors(List<String> directors) {
    this.directors = directors;
  }

  public List<String> getCast() {
    return cast;
  }

  public void setCast(List<String> cast) {
    this.cast = cast;
  }

  public List<String> getCountries() {
    return countries;
  }

  public void setCountries(List<String> countries) {
    this.countries = countries;
  }

  public List<String> getGenres() {
    return genres;
  }

  public void setGenres(List<String> genres) {
    this.genres = genres;
  }

  public String getPlot_embeddings() {
    return plot_embeddings;
  }

  public void setPlot_embeddings(String plot_embeddings) {
    this.plot_embeddings = plot_embeddings;
  }

  public int getNum_mflix_comments() {
    return num_mflix_comments;
  }

  public void setNum_mflix_comments(int num_mflix_comments) {
    this.num_mflix_comments = num_mflix_comments;
  }

  public Imdb getImdb() {
    return imdb;
  }

  public void setImdb(Imdb imdb) {
    this.imdb = imdb;
  }

  public Tomatoes getTomatoes() {
    return tomatoes;
  }

  public void setTomatoes(Tomatoes tomatoes) {
    this.tomatoes = tomatoes;
  }

  @Override
  public int hashCode() {
    return Objects.hash(cast, countries, directors, fullplot, genres, id, imdb, lastUpdated,
        num_mflix_comments, plot, plot_embeddings, poster, released, runtime, title, tomatoes, type,
        year);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof Movie)) {
      return false;
    }
    Movie other = (Movie) obj;
    return Objects.equals(cast, other.cast) && Objects.equals(countries, other.countries)
        && Objects.equals(directors, other.directors) && Objects.equals(fullplot, other.fullplot)
        && Objects.equals(genres, other.genres) && Objects.equals(id, other.id)
        && Objects.equals(imdb, other.imdb) && Objects.equals(lastUpdated, other.lastUpdated)
        && num_mflix_comments == other.num_mflix_comments && Objects.equals(plot, other.plot)
        && Objects.equals(plot_embeddings, other.plot_embeddings)
        && Objects.equals(poster, other.poster) && Objects.equals(released, other.released)
        && runtime == other.runtime && Objects.equals(title, other.title)
        && Objects.equals(tomatoes, other.tomatoes) && Objects.equals(type, other.type)
        && year == other.year;
  }

  @Override
  public String toString() {
    return "Movie [id=" + id + ", title=" + title + ", year=" + year + ", runtime=" + runtime
        + ", released=" + released + ", poster=" + poster + ", plot=" + plot + ", fullplot="
        + fullplot + ", lastUpdated=" + lastUpdated + ", type=" + type + ", directors=" + directors
        + ", cast=" + cast + ", countries=" + countries + ", genres=" + genres
        + ", plot_embeddings=" + plot_embeddings + ", num_mflix_comments=" + num_mflix_comments
        + ", imdb=" + imdb + ", tomatoes=" + tomatoes + "]";
  }

}
