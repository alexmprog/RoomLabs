package com.renovavision.roomlabs.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

import java.util.Date;

import static android.arch.persistence.room.ForeignKey.CASCADE;

/**
 * Created by Alexandr Golovach on 13.12.17.
 */

@Entity
public class Book {

	@PrimaryKey
	public final int id;

	@ColumnInfo
	public final String name;

	@ColumnInfo
	public final String url;

	@ColumnInfo
	public Date createdAt;

	@ColumnInfo
	@ForeignKey(entity = Author.class,
			parentColumns = "id",
			childColumns = "authorId",
			onDelete = CASCADE)
	public int authorId;

	public Book(int id, String name, String url, int authorId) {
		this.id = id;
		this.name = name;
		this.url = url;
		this.authorId = authorId;
	}
}
