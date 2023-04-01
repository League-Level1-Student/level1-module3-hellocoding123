package _04_netflix;

public class NetflixRUnner {
	
	public static void main(String [] args) {
		
		Movie bob = new Movie("Bob", 5);
		Movie jeff = new Movie("Jeff", 4);
		Movie tom = new Movie("Tom", 3);
		Movie bobby = new Movie("Bobby", 2);
		Movie gertrude = new Movie("Gertrude", 1);
		Movie jeff2 = new Movie("Jeff2", 0);
		System.out.println(bob.getTitle());
		System.out.println(bob.getRating());
		System.out.println(bob.toString());
		System.out.println(bob.getTicketPrice());
		System.out.println(bob.compareTo(jeff));
		NetflixQueue queue = new NetflixQueue();
		queue.addMovie(bob);
		queue.addMovie(jeff);
		queue.addMovie(tom);
		queue.addMovie(bobby);
		queue.addMovie(gertrude);
		queue.addMovie(jeff2);
		queue.printMovies();
		queue.getBestMovie();
		
	}
}
