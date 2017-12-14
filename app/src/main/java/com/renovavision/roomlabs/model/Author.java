package com.renovavision.roomlabs.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Alexandr Golovach on 13.12.17.
 */

@Entity
public class Author {

	@PrimaryKey
	public final int id;

	@ColumnInfo
	public final String firstName;

	@ColumnInfo
	public final String lastName;

	@ColumnInfo
	public final int age;

	public Author(int id, String firstName, String lastName, int age) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
}