package com.renovavision.roomlabs.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.TypeConverters;
import android.content.Context;

import com.renovavision.roomlabs.database.converter.DateConverter;
import com.renovavision.roomlabs.database.dao.AuthorDao;
import com.renovavision.roomlabs.database.dao.BookCategoryJoinDao;
import com.renovavision.roomlabs.database.dao.BookDao;
import com.renovavision.roomlabs.database.dao.CategoryDao;
import com.renovavision.roomlabs.model.Author;
import com.renovavision.roomlabs.model.Book;
import com.renovavision.roomlabs.model.BookCategoryJoin;
import com.renovavision.roomlabs.model.Category;

@Database(entities = {Book.class, Category.class, Author.class, BookCategoryJoin.class}, version = 1)
@TypeConverters(DateConverter.class)
public abstract class LibraryDatabase extends RoomDatabase {

	private static final String DB_NAME = "libraryDatabase.db";

	private static volatile LibraryDatabase instance;

	static synchronized LibraryDatabase getInstance(Context context) {
		if (instance == null) {
			instance = create(context);
		}
		return instance;
	}

	private static LibraryDatabase create(final Context context) {
		return Room.databaseBuilder(
				context,
				LibraryDatabase.class, DB_NAME).build();
	}

	public abstract BookDao getBookDao();

	public abstract AuthorDao getAuthorDao();

	public abstract CategoryDao getCategoryDao();

	public abstract BookCategoryJoinDao getBookCategoryJoinDao();
}