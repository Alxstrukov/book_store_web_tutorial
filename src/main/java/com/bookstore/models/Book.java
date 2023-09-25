package com.bookstore.models;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Book {
    private int id;
    @NonNull
    private String nameBook;
    @NonNull
    private String authorBook;
    @NonNull
    private String descriptionBook;


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Book{");
        sb.append("nameBook='").append(nameBook).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
