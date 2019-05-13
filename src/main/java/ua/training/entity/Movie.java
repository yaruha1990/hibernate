package ua.training.entity;

import lombok.*;

import java.util.Set;

@Data
@NoArgsConstructor
@EqualsAndHashCode(exclude = "authors")
public class Movie {
    private int id;
    private String title;
    private String description;
    private Set<Author> authors;

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
