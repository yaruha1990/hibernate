package ua.training.entity;

import lombok.*;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Movie {
    private int id;
    private String title;
    private String description;
    private Author author;
}
