package uk.co.imallan.tuchongdaily.db;

import android.provider.BaseColumns;

/**
 * Created by allan on 15/2/20.
 */
public final class Table {

	public Table() {
	}

	public static final class Post implements BaseColumns {

		public static final String TABLE_NAME = "post";

		public static final String COLUMN_ID = "id";

		public static final String COLUMN_LAST_TREND = "lasttrend";

		public static final String COLUMN_URL = "url";

		public static final String COLUMN_TAGS = "tags";

		public static final String COLUMN_EXCERPT = "excerpt";

		public static final String COLUMN_AUTHOR_ID = "authorid";

		public static final String COLUMN_TYPE = "type";

		public static final String SQL_CREATE_TABLE =
				"CREATE TABLE " + TABLE_NAME + " (" +
						_ID + " INTEGER PRIMARY KEY," +
						COLUMN_ID + " TEXT UNIQUE ON CONFLICT REPLACE," +
						COLUMN_LAST_TREND + " INTEGER NOT NULL," +
						COLUMN_URL + " TEXT," +
						COLUMN_TAGS + " TEXT," +
						COLUMN_EXCERPT + " TEXT," +
						COLUMN_AUTHOR_ID + " TEXT NOT NULL," +
						COLUMN_TYPE + " TEXT " +
						" )";

		public static final String SQL_DELETE_TABLE =
				"DROP TABLE IF EXISTS " + TABLE_NAME;
	}

	public static final class Author implements BaseColumns {

		public static final String TABLE_NAME = "author";

		public static final String COLUMN_ID = "id";

		public static final String COLUMN_NAME = "name";

		public static final String COLUMN_DOMAIN = "domain";

		public static final String COLUMN_URL = "url";

		public static final String COLUMN_TYPE = "type";

		public static final String COLUMN_ICON = "icon";

		public static final String SQL_CREATE_TABLE =
				"CREATE TABLE " + TABLE_NAME + " (" +
						_ID + " INTEGER PRIMARY KEY," +
						COLUMN_ID + " TEXT UNIQUE ON CONFLICT REPLACE," +
						COLUMN_NAME + " TEXT NOT NULL," +
						COLUMN_DOMAIN + " TEXT," +
						COLUMN_URL + " TEXT," +
						COLUMN_TYPE + " TEXT," +
						COLUMN_ICON + " TEXT" +
						")";

		public static final String SQL_DELETE_TABLE =
				"DROP TABLE IF EXISTS " + TABLE_NAME;

	}

	public static final class Image implements BaseColumns {

		public static final String TABLE_NAME = "image";

		public static final String COLUMN_ID = "id";

		public static final String COLUMN_TITLE = "title";

		public static final String COLUMN_DESCRIPTION = "description";

		public static final String COLUMN_URL_SMALL = "urlsmall";

		public static final String COLUMN_URL_MEDIUM = "urlmedium";

		public static final String COLUMN_URL_LARGE = "urllarge";

		public static final String COLUMN_URL_SQUARE = "urlsquare";

		public static final String COLUMN_URL_FULL = "urlsquare";

		public static final String COLUMN_CAMERA = "camera";

		public static final String COLUMN_TAKEN = "camera";

		public static final String COLUMN_LENS = "lens";

		public static final String COLUMN_EXCERPT = "excerpt";

		public static final String COLUMN_USER_ID = "userid";

		public static final String COLUMN_POST_ID = "postid";

		public static final String SQL_CREATE_TABLE =
				"CREATE TABLE " + TABLE_NAME + " (" +
						_ID + " INTEGER PRIMARY KEY," +
						COLUMN_ID + " TEXT UNIQUE ON CONFLICT REPLACE," +
						COLUMN_TITLE + "TEXT," +
						COLUMN_DESCRIPTION + "TEXT," +
						COLUMN_URL_SMALL + "TEXT," +
						COLUMN_URL_MEDIUM + "TEXT," +
						COLUMN_URL_LARGE + "TEXT," +
						COLUMN_URL_SQUARE + "TEXT," +
						COLUMN_URL_FULL + "TEXT," +
						COLUMN_CAMERA + "TEXT," +
						COLUMN_TAKEN + "TEXT," +
						COLUMN_LENS + "TEXT," +
						COLUMN_EXCERPT + "TEXT," +
						COLUMN_USER_ID + "TEXT NOT NULL," +
						COLUMN_USER_ID + "TEXT NOT NULL" +
						")";

		public static final String SQL_DELETE_TABLE =
				"DROP TABLE IF EXISTS " + TABLE_NAME;

	}

}
