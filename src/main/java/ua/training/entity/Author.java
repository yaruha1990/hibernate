package ua.training.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.util.Set;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Author {
    private int id;
    private String name;
    private String movieDescription;
    private Set<Movie> movies;
}
