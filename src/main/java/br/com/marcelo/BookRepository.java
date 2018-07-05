package br.com.marcelo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "book", path = "books")
public interface BookRepository extends CrudRepository<Book, Long> {

//	@Query("SELECT c.title FROM book c WHERE c.id = :id")
//	Book findNomeById(@Param("id") Long id);
	
//	@Query("SELECT c.* FROM book c")
//	List<Book> BookList(@Param("title") String title);
}
