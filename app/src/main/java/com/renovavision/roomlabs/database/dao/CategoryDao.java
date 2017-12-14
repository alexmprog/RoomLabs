package com.renovavision.roomlabs.database.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.renovavision.roomlabs.model.Category;

import java.util.List;

/**
 * Created by Alexandr Golovach on 13.12.17.
 */

@Dao
public interface CategoryDao {

	@Query("SELECT * FROM category")
	List<Category> getAllCategories();

	@Insert
	void insert(Category... categories);

	@Update
	void update(Category... categories);

	@Delete
	void delete(Category... categories);

	@Query("SELECT * FROM category WHERE id=:id")
	Category getCategory(int id);
}
