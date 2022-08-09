package com.github.fporto.apilangs;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "language")
public class Language {
    @Id
    private String id;
    private final String name;
    private final String image;
    // TODO: adicionar mais atributos

    public Language(String name, String image) {
        this.name = name;
        this.image = image;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }
}
