
<h1>Design</h1>

The LOTR API is designed as a REST service with H2 in-memory database on its backend.

REST controller communicates to database with spring JPA library.

I use Spring security to make access authorized while /book path is excluded (not authorized) by security filter.