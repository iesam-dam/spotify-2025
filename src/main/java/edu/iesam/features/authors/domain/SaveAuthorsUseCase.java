package edu.iesam.features.authors.domain;

import java.util.ArrayList;

public class SaveAuthorsUseCase {

    private AuthorRepository authorRepository;

   public SaveAuthorsUseCase(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public void execute(Author author){
        authorRepository.saveAuthor(author);
    }

}
