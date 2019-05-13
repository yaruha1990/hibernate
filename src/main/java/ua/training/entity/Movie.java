package ua.training.entity;

import lombok.*;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Movie {
    private String title;
    private String description;
    private int rating;
}
