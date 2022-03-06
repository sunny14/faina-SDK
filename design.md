
<h1>Design</h1>

The LOTR API is designed as a REST service with H2 in-memory database on its backend.

<h3>Entities/Tables:</h3>
- Book
- Chapter
- Movie
- Character
- Quote

Books and Chapters are mapped to each other with @ManyToOne relation (many chapters to one book).
Movies and Quotes are mapped to each other with @ManyToOne relation (many quotes to one movie).
Characters and Quotes are mapped to each other with @ManyToOne relation (many quotes to one character).


<h3>Frameworks:</h3>

REST controller communicates to database with spring JPA library.

I use Spring security to make access authorized while /book path is excluded (not authorized) by security filter.