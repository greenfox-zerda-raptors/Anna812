/* Delete the tables if they already exist */
drop table if exists Movie;
drop table if exists Reviewer;
drop table if exists Rating;

/* Create the schema for our tables */
create table Movie(mID int, title text, year int, director text);
create table Reviewer(rID int, name text);
create table Rating(rID int, mID int, stars int, ratingDate date);

/* Populate the tables with our data */
insert into Movie values(101, 'Gone with the Wind', 1939, 'Victor Fleming');
insert into Movie values(102, 'Star Wars', 1977, 'George Lucas');
insert into Movie values(103, 'The Sound of Music', 1965, 'Robert Wise');
insert into Movie values(104, 'E.T.', 1982, 'Steven Spielberg');
insert into Movie values(105, 'Titanic', 1997, 'James Cameron');
insert into Movie values(106, 'Snow White', 1937, null);
insert into Movie values(107, 'Avatar', 2009, 'James Cameron');
insert into Movie values(108, 'Raiders of the Lost Ark', 1981, 'Steven Spielberg');

insert into Reviewer values(201, 'Sarah Martinez');
insert into Reviewer values(202, 'Daniel Lewis');
insert into Reviewer values(203, 'Brittany Harris');
insert into Reviewer values(204, 'Mike Anderson');
insert into Reviewer values(205, 'Chris Jackson');
insert into Reviewer values(206, 'Elizabeth Thomas');
insert into Reviewer values(207, 'James Cameron');
insert into Reviewer values(208, 'Ashley White');

insert into Rating values(201, 101, 2, '2011-01-22');
insert into Rating values(201, 101, 4, '2011-01-27');
insert into Rating values(202, 106, 4, null);
insert into Rating values(203, 103, 2, '2011-01-20');
insert into Rating values(203, 108, 4, '2011-01-12');
insert into Rating values(203, 108, 2, '2011-01-30');
insert into Rating values(204, 101, 3, '2011-01-09');
insert into Rating values(205, 103, 3, '2011-01-27');
insert into Rating values(205, 104, 2, '2011-01-22');
insert into Rating values(205, 108, 4, null);
insert into Rating values(206, 107, 3, '2011-01-15');
insert into Rating values(206, 106, 5, '2011-01-19');
insert into Rating values(207, 107, 5, '2011-01-20');
insert into Rating values(208, 104, 3, '2011-01-02');

/* Q1 Find the titles of all movies directed by Steven Spielberg. 
SELECT title
FROM movie
WHERE Director LIKE 'Steven Spie%'; */

/* Q2 Find all years that have a movie that received a rating of 4 or 5, and sort them in increasing order.
SELECT year
FROM movie M
LEFT JOIN rating R ON M.mID = R.mID
WHERE stars > 3
Group by year; */

/* Q3 Find the titles of all movies that have no ratings. 
SELECT title
FROM movie M
LEFT JOIN rating R ON M.mID = R.mID
WHERE stars is NULL; */

/* Q4 Some reviewers didn't provide a date with their rating. Find the names of all reviewers who have ratings with a NULL value for the date. 
Select name
FROM reviewer
JOIN rating ON reviewer.rID = rating.rID
where ratingDAte is null; */

/* Q5 Write a query to return the ratings data in a more readable format: reviewer name, movie title, stars, and ratingDate. 
	  Also, sort the data, first by reviewer name, then by movie title, and lastly by number of stars. 
Select name, title, stars, ratingDate
FROM rating
JOIN reviewer ON Rating.rid = reviewer.rid
JOIN movie ON rating.mID = movie.mID
Order by name, title, stars; */

/* Q6 For all cases where the same reviewer rated the same movie twice and gave it a higher rating the second time,
	  return the reviewer's name and the title of the movie. 
SELECT name, title
FROM rating
JOIN (SELECT rID, mID
	 FROM rating
	 GROUP BY rID, mID
	 HAVING COUNT(*) > 1)
	 AS rating2 ON rating2.mID = rating.mID AND rating2.rID = rating.rID
JOIN reviewer ON rating.rID = reviewer.rID
JOIN movie ON movie.mID = rating.mID
WHERE EXISTS (SELECT *
	FROM rating rating3
	WHERE rating3.rID = rating.rID
	AND rating3.mID = rating.mID
	AND rating3.ratingDate < rating.ratingDate
	AND rating3.stars < rating.stars); */

/* Q7 For each movie that has at least one rating, find the highest number of stars that movie received.
	Return the movie title and number of stars. Sort by movie title. */






















