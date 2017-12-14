package com.renovavision.roomlabs.database.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.renovavision.roomlabs.model.Author;

import java.util.List;

/**
 * Created by Alexandr Golovach on 13.12.17.
 */

@Dao
public interface AuthorDao {

	@Query("SELECT * FROM author")
	List<Author> getAllAuthors();

	@Insert
	void insert(Author... authors);

	@Update
	void update(Author... authors);

	@Delete
	void delete(Author... authors);

	@Query("SELECT * FROM author WHERE id=:id")
	Author getAuthor(int id);
}
