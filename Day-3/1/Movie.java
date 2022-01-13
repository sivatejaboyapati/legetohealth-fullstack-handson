package day3;

public class Movie {
	private String mname;
	private String producedby;
	private String directedby;
	private int duration;
	private int year;
	private String category;
	private static int moviesCount;
	private String movieId;
	public Movie(String mname, String producedby) {
		super();
		this.mname = mname;
		this.producedby = producedby;
	}

	public Movie(String mname, String producedby, String directedby, int duration, int year, String category) {
		this(mname,producedby);
		this.directedby = directedby;
		this.duration = duration;
		this.year = year;
		this.category = category;
		
	}
	
	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getProducedby() {
		return producedby;
	}

	public void setProducedby(String producedby) {
		this.producedby = producedby;
	}

	public String getDirectedby() {
		return directedby;
	}

	public void setDirectedby(String directedby) {
		this.directedby = directedby;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public static int getMoviesCount() {
		return moviesCount;
	}

	public static void setMoviesCount(int moviesCount) {
		Movie.moviesCount = moviesCount;
	}{
		moviesCount++;
	}

	public String getMovieId() {
		return mname +"_"+ moviesCount;
	}

	
	public String showDetails() {
		return "Movie Name: " + mname +" Produced By: "+producedby+" Directed By: "+directedby+" Duration: "+duration+" Year: "+year+" Category: "+category;
	}
	public String toString() {
		return "Movie [mname=" + mname + ", producedby=" + producedby + ", directedby=" + directedby + ", duration="
				+ duration + ", year=" + year + ", category=" + category + "]";
	}
	
	
	
}
