package ua.training.entity;

import lombok.*;

import java.util.Set;

@Data
@NoArgsConstructor
@EqualsAndHashCode(exclude = "movies")
public class Author {
    private int id;
    private String name;
    private Set<Movie> movies;

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", movies=" + movies +
                '}';
    }
}
