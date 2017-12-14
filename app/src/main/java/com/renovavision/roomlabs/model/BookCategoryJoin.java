package com.renovavision.roomlabs.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;

@Entity(tableName = "book_category_join",
		primaryKeys = {"bookId", "categoryId"})
public class BookCategoryJoin {

	@ForeignKey(entity = Book.class,
			parentColumns = "id",
			childColumns = "bookId")
	public final int bookId;

	@ForeignKey(entity = Category.class,
			parentColumns = "id",
			childColumns = "categoryId")
	public final int categoryId;

	public BookCategoryJoin(final int bookId, final int categoryId) {
		this.bookId = bookId;
		this.categoryId = categoryId;
	}
}