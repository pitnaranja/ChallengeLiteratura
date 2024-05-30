API Gutendex
- buscar libros por palabra devuelve el Libro/Libros con su titulo, autor, genero, numero de descargas e idioma
-- el genero lo determinar en fucnion del campo Subjects. analiza en fucncion de tres generos, Drama, ficcion y comedia. Cuenta el numero de veces que se mencionacada uno y seleecciona al que mayor numero de veces aparce.
-- no se han encontrados libros en dos idiomas, pero el tratamiento dle idioma es selccionar el primero
-- Para los autores tambien se selcciona el primer autor dentro de la lista
-- se genera un objeto autor que se vuelca en la bade de datos de autores teniendo una relacion de uno-a-muchos. ya que un autor puede escribir mas de un libro.
-- la posibilidad de eque un libro haya sido escrito por mas de un autor en al base de datos se ha omitido ya se que solo se selccciona un autor por libro.
