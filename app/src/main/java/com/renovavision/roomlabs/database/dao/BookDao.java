package com.renovavision.roomlabs.database.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;
import android.database.Cursor;

import com.renovavision.roomlabs.model.Book;

import java.util.List;

/**
 * Created by Alexandr Golovach on 13.12.17.
 */

@Dao
public interface BookDao {

	@Query("SELECT * FROM book")
	List<Book> getAllBooks();

	@Insert
	void insert(Book... repos);

	@Update
	void update(Book... repos);

	@Delete
	void delete(Book... repos);

	@Query("SELECT * FROM book WHERE id=:id")
	Book getBook(int id);

	@Query("SELECT * FROM book")
	Cursor getBooksCursor();

	@Query("SELECT * FROM book WHERE authorId=:authorId")
	List<Book> findBooksForAuthor(final int authorId);
}