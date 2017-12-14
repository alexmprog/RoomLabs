package com.renovavision.roomlabs.database.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.renovavision.roomlabs.model.BookCategoryJoin;
import com.renovavision.roomlabs.model.Category;
import com.renovavision.roomlabs.model.Book;

import java.util.List;

@Dao
public interface BookCategoryJoinDao {

	@Insert
    void insert(BookCategoryJoin bookCategoryJoin);

    @Query("SELECT * FROM category INNER JOIN book_category_join ON " +
			"category.id=book_category_join.categoryId WHERE book_category_join.bookId=:bookId")
	List<Category> getCategoriesForBook(final int bookId);

    @Query("SELECT * FROM book INNER JOIN book_category_join ON " +
			"book.id=book_category_join.bookId WHERE book_category_join.categoryId=:categoryId")
    List<Book> getBookForCategory(final int categoryId);
}