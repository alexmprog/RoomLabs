package com.renovavision.roomlabs.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Alexandr Golovach on 13.12.17.
 */

@Entity
public class Category {

	@PrimaryKey
	public final int id;

	@ColumnInfo
	public final String name;

	public Category(int id, String name) {
		this.id = id;
		this.name = name;
	}
}
